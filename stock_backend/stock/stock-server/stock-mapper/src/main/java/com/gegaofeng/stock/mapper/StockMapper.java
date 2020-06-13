package com.gegaofeng.stock.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gegaofeng.stock.model.Stock;

import java.util.List;

public interface StockMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

    List<Stock> getStockListByName(String name);

    List<Stock> getStockListPage(Page<Stock> page, Stock stock);
}