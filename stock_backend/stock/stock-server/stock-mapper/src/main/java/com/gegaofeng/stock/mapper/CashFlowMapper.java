package com.gegaofeng.stock.mapper;

import com.gegaofeng.stock.model.CashFlow;

public interface CashFlowMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(CashFlow record);

    int insertSelective(CashFlow record);

    CashFlow selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(CashFlow record);

    int updateByPrimaryKey(CashFlow record);

    CashFlow selectByStockIdAndReportDate(String stockId, String reportDate);

}