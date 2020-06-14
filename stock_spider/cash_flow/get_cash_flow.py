from tools.file_download import file_download
import xlrd
import time
import os


# 拼接url
def get_url(code):
    urlStart = 'https://money.finance.sina.com.cn/corp/go.php/vDOWN_CashFlow/displaytype/4/stockid/'
    urlEnd = '/ctrl/all.phtml'
    url = urlStart + code + urlEnd
    return url


# fileName = code + '.xls'
# savePath = '../../document/cash_flow/'
# file_download(url, fileName, savePath)
def get_cash_flow_file(code):
    fileName = code + '.xls'
    savePath = '../../document/cash_flow/'
    # 判断文件是否存在
    if (os.path.exists(savePath + fileName)):
        print('现金流量表文件"' + fileName + '”已存在')
    else:
        file_download(get_url(code), fileName, savePath)
        if (os.path.exists(savePath + fileName)):
            print('现金流量表文件“' + fileName + '”下载成功')
        else:
            print('现金流量表文件“' + fileName + '”下载失败')


def get_all_cash_flow_file(filePath='', startRow=1, endRow=1):
    workbook = xlrd.open_workbook('../../document/all_stocks_list.xls')
    # print(workbook.sheet_names())
    sheet = workbook.sheet_by_index(0)
    for num in range(startRow, endRow):
        print(sheet.cell_value(num, 0))
        get_cash_flow_file(sheet.cell_value(num, 0))
        time.sleep(1.5)


# get_cash_flow_file('600327')
get_all_cash_flow_file('', 3800, 4000)
