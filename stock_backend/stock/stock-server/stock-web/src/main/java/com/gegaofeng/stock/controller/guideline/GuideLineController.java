package com.gegaofeng.stock.controller.guideline;

import com.gegaofeng.stock.model.CalculationGuideLine;
import com.gegaofeng.stock.service.CalculationGuideLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public Object test(){
        return calculationGuideLineService.calculateGuideLine("002071","20140930");
    }
}
