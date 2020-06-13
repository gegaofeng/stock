package com.gegaofeng.stock.controller.assets;

import com.gegaofeng.stock.model.Assets;
import com.gegaofeng.stock.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * AssetsController
 *
 * @author Feng
 * @version 1.0   2020-06-12 23:00
 */
@RestController
@RequestMapping("/assets")
public class AssetsController {
    @Autowired
    AssetsService assetsService;

    @GetMapping("/getAssets")
    public List<Assets> getAssetsByStockId(@RequestParam(value = "stockId", defaultValue = "") String stockId,
                                           @RequestParam(value = "startTime", required = false, defaultValue = "") String startTime,
                                           @RequestParam(value = "endTime", required = false, defaultValue = "") String endTime,
                                           @RequestParam(value = "reportType", required = true, defaultValue = "1") Integer reportType) {
        if (stockId == null || stockId.trim().length() == 0) {
            stockId = "300309";
        }
        if (startTime == null || startTime.trim().length() == 0) {
            startTime = "1970-01-01";
        }
        if (endTime == null || endTime.trim().length() == 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            endTime = sdf.format(new Date());
        }
        List<Assets> list = assetsService.getAssrtsByStockId(stockId, startTime, endTime);
        return list;
    }
}
