import xlrd
import csv
import time
from tools.mysql_connector import mydb
from tools.math_tool import is_number
import datetime
from tools.data_import_error import save as error_save


# 根据stockId获取指定列数据
def get_assets_by_stockid_col(stockId, col=1):
    assetsData = []
    with open('../../document/assets/' + stockId + '.xls') as tsv:
        for line in csv.reader(tsv, dialect="excel-tab"):
            if (len(line) > col):
                if (is_number(line[col])):
                    assetsData.append(float(line[col]))
                else:
                    assetsData.append(line[col])
            else:
                # 汇总字段赋值为“0”，‘流动资产’，‘非流动资产’，‘’
                assetsData.append(0)
                # print(len(line))
    assetsData[0] = str(int(assetsData[0]))
    # 每股收益汇总数据强制设零
    # assetsData[25] = 0

    assetsData.append(stockId)
    now = datetime.datetime.now()
    now = now.strftime("%Y-%m-%d %H:%M:%S")
    assetsData.append(now)
    # print(assetsData)
    # print(len(assetsData))
    return assetsData


# get_assets_by_stockid_col('688318',1)

def get(stockid):
    with open('../../document/assets/' + stockid + '.xls') as tsv:
        for line in csv.reader(tsv, dialect="excel-tab"):
            print(line[1])
    return line[1]


# get('300833')

sql = "INSERT INTO assets (stock_id,unit) VALUES (%s,%s)"
sqlSaveAll = "INSERT INTO assets (report_date,unit,current_assets,money_funds,trading_financial_assets," \
             "derivative_financial_assets,bills_accounts_receivable,bill_receivable,accounts_receivable," \
             "receivable_financing,prepayments,total_other_receivables,interest_receivable,dividend_receivable," \
             "other_receivables,resale_financial_assets,stock,assets_held_for_sale,non_current_assets_one_year," \
             "prepaid_expenses,pending_current_assets,other_current_assets,total_current_assets,non_current_assets," \
             "loans_and_advances,available_sale_financial_assets,held_to_maturity_investments,long_term_receivables," \
             "long_term_equity_investment,investment_real_estate,total_construction_in_progress,construction_in_progress," \
             "engineer_material,total_fixed_assets_liquidation,net_fixed_assets,fixed_assets_clearance," \
             "productive_biological_assets,welfare_biological_assets,oil_gas_asset,right_of_use_asset,intangible_assets," \
             "development_expenditure,goodwill,long_term_prepaid_expenses,deferred_tax_assets,other_non_current_assets," \
             "total_non_current_assets,total_assets,current_liabilities,short_term_loan," \
             "transactional_financial_liabilities," \
             "bills_accounts_payable,bills_payable,accounts_payable,advance_payment,fees_commissions," \
             "staff_payable,taxes_payable,total_other_payables,interest_payable,dividend_payable,other_payables," \
             "withholding_fees,deferred_income_within_one_year,payable_short_term_bonds," \
             "non_current_liabilities_within_one," \
             "other_current_liabilities,total_current_liabilities,non_current_liabilities,long_term_loan," \
             "bonds_payable,lease_liability,long_term_compensation,total_long_term_payables," \
             "long_term_payables,special_payables,estimated_non_current_liabilities," \
             "deferred_income_tax_liabilities,long_term_deferred_income," \
             "other_non_current_liabilities,total_non_current_liabilities," \
             "total_liabilities,owners_equity,share_capital,capital_reserve," \
             "treasury_shares,other_comprehensive_income,special_reserves,surplus_reserve," \
             "general_risk_preparation,undistributed_profit," \
             "total_equity_to__parent,minority_interest,total_equity,total_liabilities_equity," \
             "stock_id,update_date) " \
             "VALUES" \
             "(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" \
             ",%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" \
             ",%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" \
             ",%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" \
             ",%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)"

sqlIsExisted = 'SELECT 1 FROM assets WHERE stock_id = %s AND report_date = %s'


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
    csv_reader = csv.reader(open('../../document/assets/' + stockId + '.xls'))
    for row in csv_reader:
        period = len(row[0].split()) - 1
    print("财报总期数为：" + str(period) + "期")
    return period


# 存储指定股票的所有资产负债表数据
def save_data(stockId):
    period = get_period(stockId)
    for i in range(1, period):
        data = get_assets_by_stockid_col(stockId, i)
        if (is_existed(sqlIsExisted, stockId, data)):
            print("股票代码：" + str(stockId) + "的资产表" + data[0] + "期数据已存在")
        else:
            try:
                save(sqlSaveAll, get_assets_by_stockid_col(stockId, i))
            except BaseException:
                print("存储股票代码：" + str(stockId) + "的资产表" + data[0] + "期数据发生错误")
                error_save(stockId, data[0], 1)
                # time.sleep(1.5)
            else:
                print("存储第" + str(i) + "列数据成功")


# 存储所有股票的资产负债表数据
def save_all_stock_assets_data(startRow=1, endRow=1):
    workbook = xlrd.open_workbook('../../document/all_stocks_list.xls')
    sheet = workbook.sheet_by_index(0)
    for row in range(startRow, endRow):
        stockId = str(sheet.cell_value(row, 0))
        print("股票代码：" + stockId)
        save_data(stockId)
        print("============")


# save(sqlSaveAll,get_assets_by_stockid_col('688318',1))
# get_period('688318')
# save_data('688318')
save_all_stock_assets_data(1, 2000)
