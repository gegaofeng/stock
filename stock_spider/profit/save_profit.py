import xlrd
import csv
import time
from tools.mysql_connector import mydb
from tools.math_tool import is_number
import datetime
from tools.data_import_error import save as error_save


# data=pd.read_table("../../document/profit/600795.xls",sep="\t")
# print(data)

# 获取指定列数据
def get_profit_by_stockid_col(stockid, col=1):
    profitdata = []
    with open('../../document/profit/' + stockid + '.xls') as tsv:
        for line in csv.reader(tsv, dialect="excel-tab"):
            if (len(line) > col):
                if (is_number(line[col])):
                    profitdata.append(float(line[col]))
                else:
                    profitdata.append(line[col])
            else:
                # 每股收益汇总字段赋值为“0”
                profitdata.append(0)
                # print(len(line))
    profitdata[0] = str(int(profitdata[0]))
    # 每股收益汇总数据强制设零
    profitdata[25] = 0

    now = datetime.datetime.now()
    now = now.strftime("%Y-%m-%d %H:%M:%S")
    profitdata.append(now)
    profitdata.append(stockid)
    # print(profitdata[25])
    # print(profitdata)
    return profitdata


# get_profit_by_stockid_col("600795",19)


# 获取报表最新一期数据，即获取第二列数据
def get_profit_by_id(stockid):
    profitdata = []
    with open('../../document/profit/' + stockid + '.xls') as tsv:
        for line in csv.reader(tsv, dialect="excel-tab"):
            if (is_number(line[1])):
                profitdata.append(float(line[1]))
            else:
                profitdata.append(line[1])
    profitdata[0] = str(int(profitdata[0]))
    # 每股收益汇总数据强制设零
    profitdata[25] = 0

    now = datetime.datetime.now()
    now = now.strftime("%Y-%m-%d %H:%M:%S")
    profitdata.append(now)
    profitdata.append(stockid)
    print(profitdata[25])
    print(profitdata)
    return profitdata


# get('300833')

# 存储全部数据
sqlSaveAllProfit = "INSERT INTO profit (report_date,unit,total_operating_income," \
                   "operating_income,total_operating_cost,operating_cost,business_tax_surcharges," \
                   "sales_expense,management_fees,financial_expenses,r_d_expenses,asset_impairment_losses," \
                   "gains_changes_in_fair_value,investment_income,investment_income_associates_joint," \
                   "exchange_gains,operating_profit,non_operating_income,non_operating_expenses," \
                   "loss_non_current_assets,total_profit,income_tax_expense,net_profit," \
                   "profits_to_owner,minority_gains_losses,earnings_per_share,basic_earnings_per_share," \
                   "diluted_earnings_per_share,other_comprehensive_income," \
                   "total_comprehensive_income,total_income_to_owners,total_income_minority," \
                   "update_date,stock_id )" \
                   "VALUES" \
                   "(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s," \
                   "%s,%s,%s,%s,%s,%s,%s,%s,%s,%s," \
                   "%s,%s,%s,%s,%s,%s,%s,%s,%s,%s," \
                   "%s,%s,%s,%s)"
sqlIsExist = 'SELECT 1 FROM profit WHERE stock_id = %s AND report_date = %s'


# 存储数据
def save(sql, data):
    mycursor = mydb.cursor()
    mycursor.execute(sql, data)
    mydb.commit()
    # print(mycursor.lastrowid)


# 判断记录是否存在
def is_existed(sql, stockId, data):
    mycursor = mydb.cursor()
    # mycursor.execute(sql, (stockId))
    mycursor.execute(sqlIsExist, (stockId, data[0]))
    result = mycursor.fetchall()
    mydb.commit()
    # print(result)
    # print(len(result))
    if (len(result) > 0):
        return True
    else:
        return False


# is_existed(sqlIsExist, 300843, get_profit_by_stockid_col('300833', 1))


# 获取报告期数
def get_period(stockid):
    period = 0
    csv_reader = csv.reader(open('../../document/profit/' + stockid + '.xls'))
    for row in csv_reader:
        # 第一列为表头列需要减去
        period = len(row[0].split()) - 1
    print("财报总期数为：" + str(period) + "期")
    # print(row)
    return period


# 存储所有财报数据
def save_data(stockid):
    period = get_period(stockid) + 1
    for i in range(1, period):
        data = get_profit_by_stockid_col(stockid, i)
        if (is_existed(sqlIsExist, stockid, data)):
            print("股票代码：" + str(stockid) + "的利润表" + data[0] + "期数据已存在")
        else:
            try:
                save(sqlSaveAllProfit, get_profit_by_stockid_col(stockid, i))
            except BaseException:
                print("存储股票代码：" + str(stockid) + "的利润表" + data[0] + "期数据发生错误")
                error_save(stockid, data[0], 1)
                # time.sleep(1.5)
            else:
                print("存储第存储股票代码：" + str(stockid) + "的利润表" + str(i) + "列数据成功")


# get_period(('600795'))
# save(sqlSaveAllProfit, get_profit_by_stockid_col('300833', 2))
# save_data('600795')


# 存储所有表中的财报数据
def save_all_stock_profit_data(startRow=1, endRow=1):
    workbook = xlrd.open_workbook('../../document/all_stocks_list.xls')
    # print(workbook.sheet_names())
    sheet = workbook.sheet_by_index(0)
    for row in range(startRow, endRow):
        stockId = str(sheet.cell_value(row, 0))
        print('股票代码:' + stockId)
        print("开始存储第" + str(row) + "行数据，股票代码：" + stockId)
        save_data(str(stockId))
        print('==================')


save_all_stock_profit_data(1, 2000)
