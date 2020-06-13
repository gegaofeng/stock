package com.gegaofeng.stock.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CalculationGuideLine implements Serializable {
    private Integer no;

    private Date updateDate;

    private String stockId;

    private Integer reportType;

    private Date reportDate;

    private BigDecimal grossMargin;

    private BigDecimal netInterestRate;

    private BigDecimal coreProfitMargin;

    private BigDecimal coreProfit;

    private BigDecimal roe;

    private BigDecimal returnOnTotalAssets;

    private BigDecimal assetsAndLiabilities;

    private BigDecimal dividendYield;

    private BigDecimal peRatioPe;

    private BigDecimal pb;

    private BigDecimal psRatio;

    private BigDecimal pcf;

    private BigDecimal quickRatio;

    private BigDecimal currentRatio;

    private BigDecimal longTermDebtToEquityRatio;

    private BigDecimal cashRatio;

    private BigDecimal earnedInterestMultiple;

    private BigDecimal shareholdersEquityRatio;

    private BigDecimal debtToOwnerEquityRatio;

    private BigDecimal capitalFixedRatio;

    private BigDecimal accountsReceivableTurnoverRatio;

    private BigDecimal daysReceivable;

    private BigDecimal inventoryTurnover;

    private BigDecimal inventoryDays;

    private BigDecimal accountsPayableTurnoverRate;

    private BigDecimal daysPayable;

    private BigDecimal cashTurnoverDays;

    private BigDecimal turnoverRateOfCurrentAssets;

    private BigDecimal turnoverOfTotalAssets;

    private BigDecimal salesCashRatio;

    private BigDecimal netProfitCashContent;

    private BigDecimal cashManagementIndex;

    private BigDecimal cashSatisfactionRatio;

    private BigDecimal netCashFlowGrowthRate;

    private BigDecimal sellingExpenseRatio;

    private BigDecimal managementExpenseRatio;

    private BigDecimal coreProfitGeneratingCashFlowCapability;

    private BigDecimal returnOnOperatingAssets;

    private static final long serialVersionUID = 1L;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public BigDecimal getGrossMargin() {
        return grossMargin;
    }

    public void setGrossMargin(BigDecimal grossMargin) {
        this.grossMargin = grossMargin;
    }

    public BigDecimal getNetInterestRate() {
        return netInterestRate;
    }

    public void setNetInterestRate(BigDecimal netInterestRate) {
        this.netInterestRate = netInterestRate;
    }

    public BigDecimal getCoreProfitMargin() {
        return coreProfitMargin;
    }

    public void setCoreProfitMargin(BigDecimal coreProfitMargin) {
        this.coreProfitMargin = coreProfitMargin;
    }

    public BigDecimal getCoreProfit() {
        return coreProfit;
    }

    public void setCoreProfit(BigDecimal coreProfit) {
        this.coreProfit = coreProfit;
    }

    public BigDecimal getRoe() {
        return roe;
    }

    public void setRoe(BigDecimal roe) {
        this.roe = roe;
    }

    public BigDecimal getReturnOnTotalAssets() {
        return returnOnTotalAssets;
    }

    public void setReturnOnTotalAssets(BigDecimal returnOnTotalAssets) {
        this.returnOnTotalAssets = returnOnTotalAssets;
    }

    public BigDecimal getAssetsAndLiabilities() {
        return assetsAndLiabilities;
    }

    public void setAssetsAndLiabilities(BigDecimal assetsAndLiabilities) {
        this.assetsAndLiabilities = assetsAndLiabilities;
    }

    public BigDecimal getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(BigDecimal dividendYield) {
        this.dividendYield = dividendYield;
    }

    public BigDecimal getPeRatioPe() {
        return peRatioPe;
    }

    public void setPeRatioPe(BigDecimal peRatioPe) {
        this.peRatioPe = peRatioPe;
    }

    public BigDecimal getPb() {
        return pb;
    }

    public void setPb(BigDecimal pb) {
        this.pb = pb;
    }

    public BigDecimal getPsRatio() {
        return psRatio;
    }

    public void setPsRatio(BigDecimal psRatio) {
        this.psRatio = psRatio;
    }

    public BigDecimal getPcf() {
        return pcf;
    }

    public void setPcf(BigDecimal pcf) {
        this.pcf = pcf;
    }

    public BigDecimal getQuickRatio() {
        return quickRatio;
    }

    public void setQuickRatio(BigDecimal quickRatio) {
        this.quickRatio = quickRatio;
    }

    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(BigDecimal currentRatio) {
        this.currentRatio = currentRatio;
    }

    public BigDecimal getLongTermDebtToEquityRatio() {
        return longTermDebtToEquityRatio;
    }

    public void setLongTermDebtToEquityRatio(BigDecimal longTermDebtToEquityRatio) {
        this.longTermDebtToEquityRatio = longTermDebtToEquityRatio;
    }

    public BigDecimal getCashRatio() {
        return cashRatio;
    }

    public void setCashRatio(BigDecimal cashRatio) {
        this.cashRatio = cashRatio;
    }

    public BigDecimal getEarnedInterestMultiple() {
        return earnedInterestMultiple;
    }

    public void setEarnedInterestMultiple(BigDecimal earnedInterestMultiple) {
        this.earnedInterestMultiple = earnedInterestMultiple;
    }

    public BigDecimal getShareholdersEquityRatio() {
        return shareholdersEquityRatio;
    }

    public void setShareholdersEquityRatio(BigDecimal shareholdersEquityRatio) {
        this.shareholdersEquityRatio = shareholdersEquityRatio;
    }

    public BigDecimal getDebtToOwnerEquityRatio() {
        return debtToOwnerEquityRatio;
    }

    public void setDebtToOwnerEquityRatio(BigDecimal debtToOwnerEquityRatio) {
        this.debtToOwnerEquityRatio = debtToOwnerEquityRatio;
    }

    public BigDecimal getCapitalFixedRatio() {
        return capitalFixedRatio;
    }

    public void setCapitalFixedRatio(BigDecimal capitalFixedRatio) {
        this.capitalFixedRatio = capitalFixedRatio;
    }

    public BigDecimal getAccountsReceivableTurnoverRatio() {
        return accountsReceivableTurnoverRatio;
    }

    public void setAccountsReceivableTurnoverRatio(BigDecimal accountsReceivableTurnoverRatio) {
        this.accountsReceivableTurnoverRatio = accountsReceivableTurnoverRatio;
    }

    public BigDecimal getDaysReceivable() {
        return daysReceivable;
    }

    public void setDaysReceivable(BigDecimal daysReceivable) {
        this.daysReceivable = daysReceivable;
    }

    public BigDecimal getInventoryTurnover() {
        return inventoryTurnover;
    }

    public void setInventoryTurnover(BigDecimal inventoryTurnover) {
        this.inventoryTurnover = inventoryTurnover;
    }

    public BigDecimal getInventoryDays() {
        return inventoryDays;
    }

    public void setInventoryDays(BigDecimal inventoryDays) {
        this.inventoryDays = inventoryDays;
    }

    public BigDecimal getAccountsPayableTurnoverRate() {
        return accountsPayableTurnoverRate;
    }

    public void setAccountsPayableTurnoverRate(BigDecimal accountsPayableTurnoverRate) {
        this.accountsPayableTurnoverRate = accountsPayableTurnoverRate;
    }

    public BigDecimal getDaysPayable() {
        return daysPayable;
    }

    public void setDaysPayable(BigDecimal daysPayable) {
        this.daysPayable = daysPayable;
    }

    public BigDecimal getCashTurnoverDays() {
        return cashTurnoverDays;
    }

    public void setCashTurnoverDays(BigDecimal cashTurnoverDays) {
        this.cashTurnoverDays = cashTurnoverDays;
    }

    public BigDecimal getTurnoverRateOfCurrentAssets() {
        return turnoverRateOfCurrentAssets;
    }

    public void setTurnoverRateOfCurrentAssets(BigDecimal turnoverRateOfCurrentAssets) {
        this.turnoverRateOfCurrentAssets = turnoverRateOfCurrentAssets;
    }

    public BigDecimal getTurnoverOfTotalAssets() {
        return turnoverOfTotalAssets;
    }

    public void setTurnoverOfTotalAssets(BigDecimal turnoverOfTotalAssets) {
        this.turnoverOfTotalAssets = turnoverOfTotalAssets;
    }

    public BigDecimal getSalesCashRatio() {
        return salesCashRatio;
    }

    public void setSalesCashRatio(BigDecimal salesCashRatio) {
        this.salesCashRatio = salesCashRatio;
    }

    public BigDecimal getNetProfitCashContent() {
        return netProfitCashContent;
    }

    public void setNetProfitCashContent(BigDecimal netProfitCashContent) {
        this.netProfitCashContent = netProfitCashContent;
    }

    public BigDecimal getCashManagementIndex() {
        return cashManagementIndex;
    }

    public void setCashManagementIndex(BigDecimal cashManagementIndex) {
        this.cashManagementIndex = cashManagementIndex;
    }

    public BigDecimal getCashSatisfactionRatio() {
        return cashSatisfactionRatio;
    }

    public void setCashSatisfactionRatio(BigDecimal cashSatisfactionRatio) {
        this.cashSatisfactionRatio = cashSatisfactionRatio;
    }

    public BigDecimal getNetCashFlowGrowthRate() {
        return netCashFlowGrowthRate;
    }

    public void setNetCashFlowGrowthRate(BigDecimal netCashFlowGrowthRate) {
        this.netCashFlowGrowthRate = netCashFlowGrowthRate;
    }

    public BigDecimal getSellingExpenseRatio() {
        return sellingExpenseRatio;
    }

    public void setSellingExpenseRatio(BigDecimal sellingExpenseRatio) {
        this.sellingExpenseRatio = sellingExpenseRatio;
    }

    public BigDecimal getManagementExpenseRatio() {
        return managementExpenseRatio;
    }

    public void setManagementExpenseRatio(BigDecimal managementExpenseRatio) {
        this.managementExpenseRatio = managementExpenseRatio;
    }

    public BigDecimal getCoreProfitGeneratingCashFlowCapability() {
        return coreProfitGeneratingCashFlowCapability;
    }

    public void setCoreProfitGeneratingCashFlowCapability(BigDecimal coreProfitGeneratingCashFlowCapability) {
        this.coreProfitGeneratingCashFlowCapability = coreProfitGeneratingCashFlowCapability;
    }

    public BigDecimal getReturnOnOperatingAssets() {
        return returnOnOperatingAssets;
    }

    public void setReturnOnOperatingAssets(BigDecimal returnOnOperatingAssets) {
        this.returnOnOperatingAssets = returnOnOperatingAssets;
    }
}