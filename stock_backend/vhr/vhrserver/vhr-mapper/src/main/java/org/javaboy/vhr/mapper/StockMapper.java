package org.javaboy.vhr.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.javaboy.vhr.model.Stock;

import java.util.List;

public interface StockMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

    List<Stock> getStockListByName(String name);

    List<Stock> getStockListPage(Page<Stock> page, @Param("stock") Stock stock);
}