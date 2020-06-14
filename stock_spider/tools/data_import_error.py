import datetime

from tools.mysql_connector import mydb

sqlInsert = "INSERT INTO data_import_error (update_date,stock_id,report_date,error_type,solved)" \
            "VALUES " \
            "(%s,%s,%s,%s,%s)"
sqlIsExisted = "SELECT 1 FROM data_import_error WHERE stock_id = %s AND report_date = %s" \
               "AND error_type = %s"


# 存储数据
def save(stockId, report_date, errorType):
    data = []
    now = datetime.datetime.now()
    now = now.strftime("%Y-%m-%d %H:%M:%S")
    data.append(now)
    data.append(stockId)
    data.append(report_date)
    data.append(errorType)
    data.append(0)
    if (is_existed(stockId, report_date, errorType)):
        print("存储股票代码：" + stockId + "," + report_date + "期错误日志已存在")
    else:
        mycursor = mydb.cursor()
        mycursor.execute(sqlInsert, data)
        mydb.commit()
        print("存储股票代码：" + stockId + "," + report_date + "期错误日志成功")


# 判断要存储的错误日志是否已经存在
def is_existed(stockId, report_date, errorType):
    mycursor = mydb.cursor()
    mycursor.execute(sqlIsExisted, (stockId, report_date, errorType))
    result = mycursor.fetchall()
    mydb.commit()
    if (len(result) > 0):
        return True
    else:
        return False
