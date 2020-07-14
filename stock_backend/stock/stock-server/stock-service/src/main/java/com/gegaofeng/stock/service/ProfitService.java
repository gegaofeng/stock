package com.gegaofeng.stock.service;

import com.gegaofeng.stock.mapper.ProfitMapper;
import com.gegaofeng.stock.model.Profit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ProfitService
 *
 * @author Feng
 * @version 1.0   2020-05-24 18:54
 */
@Service
public class ProfitService {
    @Autowired
    ProfitMapper profitMapper;

    public List<Profit> getAllProfitByStockId(String stockId) {
        return profitMapper.getProfitByStockId(stockId);
    }

    public List<Profit> getIncomeByStockId(String stockId) {
        return profitMapper.getIncomeByStockId(stockId);
    }

    public List<Profit> getIncomeByStockId(String stockId, String startTime, String endTime) {
        return profitMapper.getIncomeByStockId(stockId, startTime, endTime);
    }
}
