package org.javaboy.vhr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.javaboy.vhr.mapper.StockMapper;
import org.javaboy.vhr.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * StockService
 *
 * @author Feng
 * @version 1.0   2020-05-27 21:19
 */
@Service
public class StockService {
    @Autowired
    StockMapper stockMapper;

    public List<Stock> getStockListByName(String name) {
        return stockMapper.getStockListByName(name);
    }

    public IPage<Stock> getStockListPage(Stock stock,int page,int pageSize){
        try {
            Page<Stock> stockPage=new Page<>(page,pageSize);
            stockPage.setRecords(stockMapper.getStockListPage(stockPage,stock));
            return stockPage;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
