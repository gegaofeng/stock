package com.gegaofeng.stock.controller.profit;

import com.gegaofeng.stock.model.Profit;
import com.gegaofeng.stock.service.ProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * ProfitController
 *
 * @author Feng
 * @version 1.0   2020-05-24 17:41
 */
@RestController
@RequestMapping("/profit")
public class ProfitController {
    @Autowired
    ProfitService profitService;

    @GetMapping("/basic")
    public List<String> getProfit() {
        List<String> ls = new ArrayList<>();
        ls.add("23");
        ls.add("13");
        ls.add("43");
        ls.add("33");
        ls.add("3");
        return ls;
    }

    @GetMapping("/getall")
    public List<Profit> getAllProfitByStockId() {
        return profitService.getAllProfitByStockId("300833");
    }

    @GetMapping("/getincome")
    public List<Profit> getIncomeByStockId(@RequestParam(value = "stockId", required = false, defaultValue = "") String stockId,
                                           @RequestParam(value = "startTime", required = false, defaultValue = "") String startTime,
                                           @RequestParam(value = "endTime", required = false, defaultValue = "") String endTime,
                                           @RequestParam(value = "reportType", required = true, defaultValue = "1") Integer reportType) {
//        System.out.print(stockId);
//        System.out.print("\n");
//        System.out.print(startTime.length());
//        System.out.print("\n");
//        System.out.print(endTime.length());
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
        List<Profit> list = profitService.getIncomeByStockId(stockId, startTime, endTime);
        switch (reportType) {
            case 1:
                return profitFilter(list);
            case 2:
                return list;
            default:
                return null;
        }
    }
//    过滤仅返回年报数据
    public List<Profit> profitFilter(List<Profit> profitList){
        if (profitList==null||profitList.size()==0){
            return profitList;
        }
        else {
            List<Profit> filter=new ArrayList<>();
            for (Profit profit:profitList){
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(profit.getReportDate());
                if (calendar.get(Calendar.MONTH)==11){
                    filter.add(profit);
                }
            }
            return filter;
        }
    }
}
