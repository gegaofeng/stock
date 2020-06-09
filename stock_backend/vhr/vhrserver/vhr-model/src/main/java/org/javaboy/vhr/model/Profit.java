package org.javaboy.vhr.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Profit implements Serializable {
    private Integer no;

    private String stockId;

    private Date updateDate;

    private Date reportDate;

    private String unit;

    private BigDecimal totalOperatingIncome;

    private BigDecimal operatingIncome;

    private BigDecimal totalOperatingCost;

    private BigDecimal operatingCost;

    private BigDecimal businessTaxSurcharges;

    private BigDecimal salesExpense;

    private BigDecimal managementFees;

    private BigDecimal financialExpenses;

    private BigDecimal rDExpenses;

    private BigDecimal assetImpairmentLosses;

    private BigDecimal gainsChangesInFairValue;

    private BigDecimal investmentIncome;

    private BigDecimal investmentIncomeAssociatesJoint;

    private BigDecimal exchangeGains;

    private BigDecimal operatingProfit;

    private BigDecimal nonOperatingIncome;

    private BigDecimal nonOperatingExpenses;

    private BigDecimal lossNonCurrentAssets;

    private BigDecimal totalProfit;

    private BigDecimal incomeTaxExpense;

    private BigDecimal netProfit;

    private BigDecimal profitsToOwner;

    private BigDecimal minorityGainsLosses;

    private BigDecimal earningsPerShare;

    private BigDecimal basicEarningsPerShare;

    private BigDecimal dilutedEarningsPerShare;

    private BigDecimal otherComprehensiveIncome;

    private BigDecimal totalComprehensiveIncome;

    private BigDecimal totalIncomeToOwners;

    private BigDecimal totalIncomeMinority;

    private static final long serialVersionUID = 1L;

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
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getTotalOperatingIncome() {
        return totalOperatingIncome;
    }

    public void setTotalOperatingIncome(BigDecimal totalOperatingIncome) {
        this.totalOperatingIncome = totalOperatingIncome;
    }

    public BigDecimal getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(BigDecimal operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public BigDecimal getTotalOperatingCost() {
        return totalOperatingCost;
    }

    public void setTotalOperatingCost(BigDecimal totalOperatingCost) {
        this.totalOperatingCost = totalOperatingCost;
    }

    public BigDecimal getOperatingCost() {
        return operatingCost;
    }

    public void setOperatingCost(BigDecimal operatingCost) {
        this.operatingCost = operatingCost;
    }

    public BigDecimal getBusinessTaxSurcharges() {
        return businessTaxSurcharges;
    }

    public void setBusinessTaxSurcharges(BigDecimal businessTaxSurcharges) {
        this.businessTaxSurcharges = businessTaxSurcharges;
    }

    public BigDecimal getSalesExpense() {
        return salesExpense;
    }

    public void setSalesExpense(BigDecimal salesExpense) {
        this.salesExpense = salesExpense;
    }

    public BigDecimal getManagementFees() {
        return managementFees;
    }

    public void setManagementFees(BigDecimal managementFees) {
        this.managementFees = managementFees;
    }

    public BigDecimal getFinancialExpenses() {
        return financialExpenses;
    }

    public void setFinancialExpenses(BigDecimal financialExpenses) {
        this.financialExpenses = financialExpenses;
    }

    public BigDecimal getrDExpenses() {
        return rDExpenses;
    }

    public void setrDExpenses(BigDecimal rDExpenses) {
        this.rDExpenses = rDExpenses;
    }

    public BigDecimal getAssetImpairmentLosses() {
        return assetImpairmentLosses;
    }

    public void setAssetImpairmentLosses(BigDecimal assetImpairmentLosses) {
        this.assetImpairmentLosses = assetImpairmentLosses;
    }

    public BigDecimal getGainsChangesInFairValue() {
        return gainsChangesInFairValue;
    }

    public void setGainsChangesInFairValue(BigDecimal gainsChangesInFairValue) {
        this.gainsChangesInFairValue = gainsChangesInFairValue;
    }

    public BigDecimal getInvestmentIncome() {
        return investmentIncome;
    }

    public void setInvestmentIncome(BigDecimal investmentIncome) {
        this.investmentIncome = investmentIncome;
    }

    public BigDecimal getInvestmentIncomeAssociatesJoint() {
        return investmentIncomeAssociatesJoint;
    }

    public void setInvestmentIncomeAssociatesJoint(BigDecimal investmentIncomeAssociatesJoint) {
        this.investmentIncomeAssociatesJoint = investmentIncomeAssociatesJoint;
    }

    public BigDecimal getExchangeGains() {
        return exchangeGains;
    }

    public void setExchangeGains(BigDecimal exchangeGains) {
        this.exchangeGains = exchangeGains;
    }

    public BigDecimal getOperatingProfit() {
        return operatingProfit;
    }

    public void setOperatingProfit(BigDecimal operatingProfit) {
        this.operatingProfit = operatingProfit;
    }

    public BigDecimal getNonOperatingIncome() {
        return nonOperatingIncome;
    }

    public void setNonOperatingIncome(BigDecimal nonOperatingIncome) {
        this.nonOperatingIncome = nonOperatingIncome;
    }

    public BigDecimal getNonOperatingExpenses() {
        return nonOperatingExpenses;
    }

    public void setNonOperatingExpenses(BigDecimal nonOperatingExpenses) {
        this.nonOperatingExpenses = nonOperatingExpenses;
    }

    public BigDecimal getLossNonCurrentAssets() {
        return lossNonCurrentAssets;
    }

    public void setLossNonCurrentAssets(BigDecimal lossNonCurrentAssets) {
        this.lossNonCurrentAssets = lossNonCurrentAssets;
    }

    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
    }

    public BigDecimal getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    public void setIncomeTaxExpense(BigDecimal incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
    }

    public BigDecimal getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(BigDecimal netProfit) {
        this.netProfit = netProfit;
    }

    public BigDecimal getProfitsToOwner() {
        return profitsToOwner;
    }

    public void setProfitsToOwner(BigDecimal profitsToOwner) {
        this.profitsToOwner = profitsToOwner;
    }

    public BigDecimal getMinorityGainsLosses() {
        return minorityGainsLosses;
    }

    public void setMinorityGainsLosses(BigDecimal minorityGainsLosses) {
        this.minorityGainsLosses = minorityGainsLosses;
    }

    public BigDecimal getEarningsPerShare() {
        return earningsPerShare;
    }

    public void setEarningsPerShare(BigDecimal earningsPerShare) {
        this.earningsPerShare = earningsPerShare;
    }

    public BigDecimal getBasicEarningsPerShare() {
        return basicEarningsPerShare;
    }

    public void setBasicEarningsPerShare(BigDecimal basicEarningsPerShare) {
        this.basicEarningsPerShare = basicEarningsPerShare;
    }

    public BigDecimal getDilutedEarningsPerShare() {
        return dilutedEarningsPerShare;
    }

    public void setDilutedEarningsPerShare(BigDecimal dilutedEarningsPerShare) {
        this.dilutedEarningsPerShare = dilutedEarningsPerShare;
    }

    public BigDecimal getOtherComprehensiveIncome() {
        return otherComprehensiveIncome;
    }

    public void setOtherComprehensiveIncome(BigDecimal otherComprehensiveIncome) {
        this.otherComprehensiveIncome = otherComprehensiveIncome;
    }

    public BigDecimal getTotalComprehensiveIncome() {
        return totalComprehensiveIncome;
    }

    public void setTotalComprehensiveIncome(BigDecimal totalComprehensiveIncome) {
        this.totalComprehensiveIncome = totalComprehensiveIncome;
    }

    public BigDecimal getTotalIncomeToOwners() {
        return totalIncomeToOwners;
    }

    public void setTotalIncomeToOwners(BigDecimal totalIncomeToOwners) {
        this.totalIncomeToOwners = totalIncomeToOwners;
    }

    public BigDecimal getTotalIncomeMinority() {
        return totalIncomeMinority;
    }

    public void setTotalIncomeMinority(BigDecimal totalIncomeMinority) {
        this.totalIncomeMinority = totalIncomeMinority;
    }

    @Override
    public String toString() {
        return "Profit{" +
                "no=" + no +
                ", stockId='" + stockId + '\'' +
                ", updateDate=" + updateDate +
                ", reportDate=" + reportDate +
                ", unit='" + unit + '\'' +
                ", totalOperatingIncome=" + totalOperatingIncome +
                ", operatingIncome=" + operatingIncome +
                ", totalOperatingCost=" + totalOperatingCost +
                ", operatingCost=" + operatingCost +
                ", businessTaxSurcharges=" + businessTaxSurcharges +
                ", salesExpense=" + salesExpense +
                ", managementFees=" + managementFees +
                ", financialExpenses=" + financialExpenses +
                ", rDExpenses=" + rDExpenses +
                ", assetImpairmentLosses=" + assetImpairmentLosses +
                ", gainsChangesInFairValue=" + gainsChangesInFairValue +
                ", investmentIncome=" + investmentIncome +
                ", investmentIncomeAssociatesJoint=" + investmentIncomeAssociatesJoint +
                ", exchangeGains=" + exchangeGains +
                ", operatingProfit=" + operatingProfit +
                ", nonOperatingIncome=" + nonOperatingIncome +
                ", nonOperatingExpenses=" + nonOperatingExpenses +
                ", lossNonCurrentAssets=" + lossNonCurrentAssets +
                ", totalProfit=" + totalProfit +
                ", incomeTaxExpense=" + incomeTaxExpense +
                ", netProfit=" + netProfit +
                ", profitsToOwner=" + profitsToOwner +
                ", minorityGainsLosses=" + minorityGainsLosses +
                ", earningsPerShare=" + earningsPerShare +
                ", basicEarningsPerShare=" + basicEarningsPerShare +
                ", dilutedEarningsPerShare=" + dilutedEarningsPerShare +
                ", otherComprehensiveIncome=" + otherComprehensiveIncome +
                ", totalComprehensiveIncome=" + totalComprehensiveIncome +
                ", totalIncomeToOwners=" + totalIncomeToOwners +
                ", totalIncomeMinority=" + totalIncomeMinority +
                '}';
    }
}