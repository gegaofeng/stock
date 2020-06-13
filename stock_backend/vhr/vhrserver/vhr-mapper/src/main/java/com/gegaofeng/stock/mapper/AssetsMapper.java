package com.gegaofeng.stock.mapper;

import com.gegaofeng.stock.model.Assets;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetsMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(Assets record);

    int insertSelective(Assets record);

    Assets selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(Assets record);

    int updateByPrimaryKey(Assets record);

    List<Assets> getAssetsByStockId(@Param("stockId") String stockId,
                                    @Param("startTime") String startTime,
                                    @Param("endTime") String endTime);
}