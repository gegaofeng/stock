package com.gegaofeng.stock.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ProfitIncome
 *
 * @author Feng
 * @version 1.0   2020-05-26 20:29
 */
public class ProfitIncome {
    private Integer no;
    private String stockId;
    private Integer reportType;
    private Date reportDate;
    private String unit;
    private BigDecimal totalOperatingIncome;
    private BigDecimal totalProfit;

    @Override
    public String toString() {
        return "ProfitIncome{" +
                "no=" + no +
                ", stockId='" + stockId + '\'' +
                ", reportDate=" + reportDate +
                ", unit='" + unit + '\'' +
                ", totalOperatingIncome=" + totalOperatingIncome +
                ", totalProfit=" + totalProfit +
                '}';
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {

        this.reportDate = reportDate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getTotalOperatingIncome() {
        return totalOperatingIncome;
    }

    public void setTotalOperatingIncome(BigDecimal totalOperatingIncome) {
        this.totalOperatingIncome = totalOperatingIncome;
    }
}
