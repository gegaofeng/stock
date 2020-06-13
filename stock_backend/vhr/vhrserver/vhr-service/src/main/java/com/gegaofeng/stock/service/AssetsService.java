package com.gegaofeng.stock.service;

import com.gegaofeng.stock.mapper.AssetsMapper;
import com.gegaofeng.stock.model.Assets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AssetsService
 *
 * @author Feng
 * @version 1.0   2020-06-12 22:46
 */
@Service
public class AssetsService {
    @Autowired
    AssetsMapper assetsMapper;

    public int insertSelective(Assets assets) {
        return assetsMapper.insertSelective(assets);
    }

    public List<Assets> getAssrtsByStockId(String stockId, String startTime, String endTime) {
        return assetsMapper.getAssetsByStockId(stockId, startTime, endTime);
    }
}
