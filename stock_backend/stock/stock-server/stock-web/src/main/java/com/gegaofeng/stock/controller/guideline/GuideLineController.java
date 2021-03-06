package com.gegaofeng.stock.controller.guideline;

import com.gegaofeng.stock.model.CalculationGuideLine;
import com.gegaofeng.stock.service.CalculationGuideLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * GuideLine
 *
 * @author Feng
 * @version 1.0   2020-06-13 18:43
 */
@RestController
@RequestMapping("/guideLine")
public class GuideLineController {
    @Autowired
    CalculationGuideLineService calculationGuideLineService;

    @RequestMapping("/*")
    public Object test(@RequestParam(value = "stockId", defaultValue = "") String stockId,
                       @RequestParam(value = "reportDate", defaultValue = "") String reportDate) {
        if (stockId == null || stockId.trim().length() == 0) {
            stockId = "300309";
        }
        if (reportDate == null || reportDate.trim().length() == 0) {
            reportDate = "20191231";
        }
        return calculationGuideLineService.calculateGuideLine(stockId, reportDate);
    }
}
