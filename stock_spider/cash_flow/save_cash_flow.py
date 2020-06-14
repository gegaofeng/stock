import xlrd
import csv
import time
from tools.mysql_connector import mydb
from tools.math_tool import is_number
import datetime
from tools.data_import_error import save as error_save


# 根据stockId获取指定列数据
def get_cash_flow_by_stockid_col(stockId, col=1):
    cashFlowData = []
    with open('../../document/cash_flow/' + stockId + '.xls') as tsv:
        for line in csv.reader(tsv, dialect="excel-tab"):
            if (len(line) > col):
                if (is_number(line[col])):
                    cashFlowData.append(float(line[col]))
                else:
                    cashFlowData.append(line[col])
            else:
                # 汇总字段赋值为“0”，‘流动资产’，‘非流动资产’，‘’
                cashFlowData.append(0)
                # print(len(line))
    cashFlowData[0] = str(int(cashFlowData[0]))
    # 每股收益汇总数据强制设零
    # cashFlowData[25] = 0

    cashFlowData.append(stockId)
    now = datetime.datetime.now()
    now = now.strftime("%Y-%m-%d %H:%M:%S")
    cashFlowData.append(now)
    # print(cashFlowData)
    # print(len(cashFlowData))
    return cashFlowData


# get_cash_flow_by_stockid_col('688318',1)

def get(stockid):
    with open('../../document/cash_flow/' + stockid + '.xls') as tsv:
        for line in csv.reader(tsv, dialect="excel-tab"):
            print(line[1])
    return line[1]


# get('300833')

sql = "INSERT INTO cash_flow (stock_id,unit) VALUES (%s,%s)"
sqlSaveAll = "INSERT INTO cash_flow ( report_date, unit, cash_flow_from_operating_activities," \
             "cash_received_from_sales, tax_refund, other_cash_received_related_operating, subtotal_cash_inflow_from_operating_activities, " \
             "cash_for_purchasing_and_receiving_labor_services, cash_paid_to_and_for_employees, " \
             "various_taxes_paid, other_cash_paid_related_to_operating_activities, subtotal_cash_outflow_from_operating_activities," \
             "net_cash_flow_from_operating_activities, cash_flow_from_investment_activities, cash_received_from_investment_recovery, " \
             "cash_received_from_investment_income, net_cash_from_disposal_fixed_assets, net_cash_from_disposal_other_business_units, " \
             "other_cash_received_related_to_investment, subtotal_of_cash_inflow_from_investment, " \
             "cash_paid_for_purchase_fixed_assets, cash_paid_for_investment, obtain_net_cash_paid_by_other_business_units, " \
             "other_cash_paid_related_to_investment, subtotal_of_cash_outflows_from_investment, " \
             "net_cash_flows_from_investing_activities, cash_flow_from_financing_activities, absorb_cash_received_from_investment, " \
             "cash_received_from_minority, obtain_the_cash_received_from_the_loan, cash_received_from_issuing_bonds, " \
             "receive_other_cash_related_to_financing, subtotal_of_cash_inflows_from_financing, " \
             "cash_paid_for_debt_repayment, cash_paid_for_dividends_profitsr_interest_payments, " \
             "dividends_profits_paid_to_minority_shareholders, payment_of_other_cash_related_financing, " \
             "subtotal_of_cash_outflows_from_financing, net_cash_flow_from_financing_activities, " \
             "impact_of_exchange_rate_changes, net_increase_in_cash_and_cash_equivalents, cash_and_cash_equivalents_at_beginning, " \
             "cash_and_cash_equivalents_at_end, notes, net_profit, minority_interest, unrecognized_investment_losses, " \
             "impairment_of_assets, depreciation_of__assets, amortization_of_intangible_assets, " \
             "amortization_of_long_term_deferred_expenses, decrease_in_deferred_expenses, increase_in_accrued_expenses, " \
             "disposal_fixed_intangible_long_term_assets, fixed_asset_retirement_loss, loss_from_changes_in_fair_value, " \
             "deferred_income_increases, estimated_liabilities, financial_expenses, investment_loss, " \
             "decrease_in_deferred_income_tax_assets, increase_in_deferred_income_tax_liabilities, " \
             "inventory_reduction, decrease_of_operating_receivables, increase_in_operational_payable_items, " \
             "decrease_completed_and_unsettled_payments, increase_settled_outstanding_work, other, " \
             "other_net_cash_flow_from_operating_activities, conversion_of_debt_into_capital, convertible_bonds_within_one_year, " \
             "financing_leased_fixed_assets, cash_ending_balance, opening_balance_of_cash, closing_balance_of_cash_equivalents, " \
             "opening_balance_of_cash_equivalents, net_increase_cash_and_equivalents,stock_id,update_date) " \
             "VALUES" \
             "(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" \
             ",%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" \
             ",%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" \
             ",%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)"

sqlIsExisted = 'SELECT 1 FROM cash_flow WHERE stock_id = %s AND report_date = %s'


# 存储数据
def save(sql, data):
    mycursor = mydb.cursor()
    mycursor.execute(sql, data)
    mydb.commit()
    print(mycursor.lastrowid)


# 判断记录是否存在
def is_existed(sql, stockId, data):
    mycursor = mydb.cursor()
    mycursor.execute(sqlIsExisted, (stockId, data[0]))
    result = mycursor.fetchall()
    mydb.commit()
    if (len(result) > 0):
        return True
    else:
        return False


# 获取报告期数
def get_period(stockId):
    period = 0
    csv_reader = csv.reader(open('../../document/cash_flow/' + stockId + '.xls'))
    for row in csv_reader:
        period = len(row[0].split()) - 1
    print("财报总期数为：" + str(period) + "期")
    return period


# 存储指定股票的所有现金流量表表数据
def save_data(stockId):
    period = get_period(stockId)
    for i in range(1, period):
        data = get_cash_flow_by_stockid_col(stockId, i)
        if (is_existed(sqlIsExisted, stockId, data)):
            print("股票代码：" + str(stockId) + "的现金流量" + data[0] + "期数据已存在")
        else:
            try:
                save(sqlSaveAll, get_cash_flow_by_stockid_col(stockId, i))
            except BaseException:
                print("存储股票代码：" + str(stockId) + "的现金流量" + data[0] + "期数据发生错误")
                error_save(stockId, data[0], 3)
                # time.sleep(1)
            else:
                print("存储第" + str(i) + "列数据成功")


# 存储所有股票的资产负债表数据
def save_all_cash_flow_data(startRow=1, endRow=1):
    workbook = xlrd.open_workbook('../../document/all_stocks_list.xls')
    sheet = workbook.sheet_by_index(0)
    for row in range(startRow, endRow):
        stockId = str(sheet.cell_value(row, 0))
        print("开始存储第"+str(row)+"行数据，股票代码：" + stockId)
        save_data(stockId)
        print("============")


# save(sqlSaveAll,get_cash_flow_by_stockid_col('688318',1))
# get_period('688318')
# save_data('688318')
save_all_cash_flow_data(419, 2000)

