package org.javaboy.vhr.controller.Stock;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.javaboy.vhr.model.Stock;
import org.javaboy.vhr.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * StockController
 *
 * @author Feng
 * @version 1.0   2020-05-27 21:21
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("/getstocklistbyname")
    public List<Stock> getStockListByName(@RequestParam(value = "name", required = false,defaultValue = "") String name) {
        return stockService.getStockListByName("%" + name + "%");
    }

    @GetMapping("/getStockList")
    public IPage<Stock> getStockList(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                    @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        Stock stock = new Stock();
        IPage<Stock> iPage = stockService.getStockListPage(stock, page, pageSize);
        iPage.getRecords();
        return iPage;
    }
}
