from tools.file_download import file_download
import xlrd
import time
import os


# 拼接url
def get_url(code):
    urlStart = 'https://money.finance.sina.com.cn/corp/go.php/vDOWN_BalanceSheet/displaytype/4/stockid/'
    urlEnd = '/ctrl/all.phtml'
    url = urlStart + code + urlEnd
    return url


# fileName = code + '.xls'
# savePath = '../../document/profit/'
# file_download(url, fileName, savePath)
def get_assets_file(code):
    fileName = code + '.xls'
    savePath = '../../document/assets/'
    # 判断文件是否存在
    if (os.path.exists(savePath + fileName)):
        print('资产表文件"' + fileName + '”已存在')
    else:
        file_download(get_url(code), fileName, savePath)
        if (os.path.exists(savePath + fileName)):
            print('资产表文件“' + fileName + '”下载成功')
        else:
            print('资产表文件“' + fileName + '”下载失败')


def get_all_assets_file(filePath='', startRow=1, endRow=1):
    workbook = xlrd.open_workbook('../../document/all_stocks_list.xls')
    # print(workbook.sheet_names())
    sheet = workbook.sheet_by_index(0)
    for num in range(startRow, endRow):
        print(sheet.cell_value(num, 0))
        get_assets_file(sheet.cell_value(num, 0))
        time.sleep(1.5)


# get_assets_file('300833')
get_all_assets_file('', 3800, 4800)
