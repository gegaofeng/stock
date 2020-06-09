import time
import tushare as ts

# print(tushare.__version__)

# stockList=ts.get_stock_basics()
# ts.set_token('383b1fb7c3243024068edf080aa6d3aa4b5615e1655fb551b8ee5685')
# pro = ts.pro_api()
# stockList=pro.stock_company
# df = pro.stock_basic()
# print(df)
stockList = ts.get_stock_basics()
# fileName = '../../document/all_stocks_list-' + time.strftime('%Y-%m-%d', time.localtime(time.time())) + '.xls'
fileName = '../../document/all_stocks_list.xls'
stockList.to_excel(fileName)
# with open('stock.xls', 'wb') as code:
#     code.write(stockList)
# print(stockList)
