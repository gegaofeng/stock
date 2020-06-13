package com.gegaofeng.stock.mapper;

import com.gegaofeng.stock.model.Profit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProfitMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(Profit record);

    int insertSelective(Profit record);

    Profit selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(Profit record);

    int updateByPrimaryKey(Profit record);

    List<Profit> getProfitByStockId(String stockId);

    List<Profit> getIncomeByStockId(String stockId);

    List<Profit> getIncomeByStockId(@Param("stockId") String stockId,
                                          @Param("startTime") String startTime,
                                          @Param("endTime") String endTime);
    Profit selectByStockIdAndReportDate(String stockId,String reportDate);

}