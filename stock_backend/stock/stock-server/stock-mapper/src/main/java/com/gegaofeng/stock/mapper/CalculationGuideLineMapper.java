package com.gegaofeng.stock.mapper;


import com.gegaofeng.stock.model.CalculationGuideLine;

public interface CalculationGuideLineMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(CalculationGuideLine record);

    int insertSelective(CalculationGuideLine record);

    CalculationGuideLine selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(CalculationGuideLine record);

    int updateByPrimaryKey(CalculationGuideLine record);
}