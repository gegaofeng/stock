package com.gegaofeng.stock.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CashFlow implements Serializable {
    private Integer no;

    private Date updateDate;

    private String stockId;

    private Byte reportType;

    private Date reportDate;

    private String unit;

    private BigDecimal cashFlowFromOperatingActivities;

    private BigDecimal cashReceivedFromSales;

    private BigDecimal taxRefund;

    private BigDecimal otherCashReceivedRelatedOperating;

    private BigDecimal subtotalCashInflowFromOperatingActivities;

    private BigDecimal cashForPurchasingAndReceivingLaborServices;

    private BigDecimal cashPaidToAndForEmployees;

    private BigDecimal variousTaxesPaid;

    private BigDecimal otherCashPaidRelatedToOperatingActivities;

    private BigDecimal subtotalCashOutflowFromOperatingActivities;

    private BigDecimal netCashFlowFromOperatingActivities;

    private BigDecimal cashFlowFromInvestmentActivities;

    private BigDecimal cashReceivedFromInvestmentRecovery;

    private BigDecimal cashReceivedFromInvestmentIncome;

    private BigDecimal netCashFromDisposalFixedAssets;

    private BigDecimal netCashFromDisposalOtherBusinessUnits;

    private BigDecimal otherCashReceivedRelatedToInvestment;

    private BigDecimal subtotalOfCashInflowFromInvestment;

    private BigDecimal cashPaidForPurchaseFixedAssets;

    private BigDecimal cashPaidForInvestment;

    private BigDecimal obtainNetCashPaidByOtherBusinessUnits;

    private BigDecimal otherCashPaidRelatedToInvestment;

    private BigDecimal subtotalOfCashOutflowsFromInvestment;

    private BigDecimal netCashFlowsFromInvestingActivities;

    private BigDecimal cashFlowFromFinancingActivities;

    private BigDecimal absorbCashReceivedFromInvestment;

    private BigDecimal cashReceivedFromMinority;

    private BigDecimal obtainTheCashReceivedFromTheLoan;

    private BigDecimal cashReceivedFromIssuingBonds;

    private BigDecimal receiveOtherCashRelatedToFinancing;

    private BigDecimal subtotalOfCashInflowsFromFinancing;

    private BigDecimal cashPaidForDebtRepayment;

    private BigDecimal cashPaidForDividendsProfitsrInterestPayments;

    private BigDecimal dividendsProfitsPaidToMinorityShareholders;

    private BigDecimal paymentOfOtherCashRelatedFinancing;

    private BigDecimal subtotalOfCashOutflowsFromFinancing;

    private BigDecimal netCashFlowFromFinancingActivities;

    private BigDecimal impactOfExchangeRateChanges;

    private BigDecimal netIncreaseInCashAndCashEquivalents;

    private BigDecimal cashAndCashEquivalentsAtBeginning;

    private BigDecimal cashAndCashEquivalentsAtEnd;

    private BigDecimal notes;

    private BigDecimal netProfit;

    private BigDecimal minorityInterest;

    private BigDecimal unrecognizedInvestmentLosses;

    private BigDecimal impairmentOfAssets;

    private BigDecimal depreciationOfAssets;

    private BigDecimal amortizationOfIntangibleAssets;

    private BigDecimal amortizationOfLongTermDeferredExpenses;

    private BigDecimal decreaseInDeferredExpenses;

    private BigDecimal increaseInAccruedExpenses;

    private BigDecimal disposalFixedIntangibleLongTermAssets;

    private BigDecimal fixedAssetRetirementLoss;

    private BigDecimal lossFromChangesInFairValue;

    private BigDecimal deferredIncomeIncreases;

    private BigDecimal estimatedLiabilities;

    private BigDecimal financialExpenses;

    private BigDecimal investmentLoss;

    private BigDecimal decreaseInDeferredIncomeTaxAssets;

    private BigDecimal increaseInDeferredIncomeTaxLiabilities;

    private BigDecimal inventoryReduction;

    private BigDecimal decreaseOfOperatingReceivables;

    private BigDecimal increaseInOperationalPayableItems;

    private BigDecimal decreaseCompletedAndUnsettledPayments;

    private BigDecimal increaseSettledOutstandingWork;

    private BigDecimal other;

    private BigDecimal otherNetCashFlowFromOperatingActivities;

    private BigDecimal conversionOfDebtIntoCapital;

    private BigDecimal convertibleBondsWithinOneYear;

    private BigDecimal financingLeasedFixedAssets;

    private BigDecimal cashEndingBalance;

    private BigDecimal openingBalanceOfCash;

    private BigDecimal closingBalanceOfCashEquivalents;

    private BigDecimal openingBalanceOfCashEquivalents;

    private BigDecimal netIncreaseCashAndEquivalents;

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

    public Byte getReportType() {
        return reportType;
    }

    public void setReportType(Byte reportType) {
        this.reportType = reportType;
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

    public BigDecimal getCashFlowFromOperatingActivities() {
        return cashFlowFromOperatingActivities;
    }

    public void setCashFlowFromOperatingActivities(BigDecimal cashFlowFromOperatingActivities) {
        this.cashFlowFromOperatingActivities = cashFlowFromOperatingActivities;
    }

    public BigDecimal getCashReceivedFromSales() {
        return cashReceivedFromSales;
    }

    public void setCashReceivedFromSales(BigDecimal cashReceivedFromSales) {
        this.cashReceivedFromSales = cashReceivedFromSales;
    }

    public BigDecimal getTaxRefund() {
        return taxRefund;
    }

    public void setTaxRefund(BigDecimal taxRefund) {
        this.taxRefund = taxRefund;
    }

    public BigDecimal getOtherCashReceivedRelatedOperating() {
        return otherCashReceivedRelatedOperating;
    }

    public void setOtherCashReceivedRelatedOperating(BigDecimal otherCashReceivedRelatedOperating) {
        this.otherCashReceivedRelatedOperating = otherCashReceivedRelatedOperating;
    }

    public BigDecimal getSubtotalCashInflowFromOperatingActivities() {
        return subtotalCashInflowFromOperatingActivities;
    }

    public void setSubtotalCashInflowFromOperatingActivities(BigDecimal subtotalCashInflowFromOperatingActivities) {
        this.subtotalCashInflowFromOperatingActivities = subtotalCashInflowFromOperatingActivities;
    }

    public BigDecimal getCashForPurchasingAndReceivingLaborServices() {
        return cashForPurchasingAndReceivingLaborServices;
    }

    public void setCashForPurchasingAndReceivingLaborServices(BigDecimal cashForPurchasingAndReceivingLaborServices) {
        this.cashForPurchasingAndReceivingLaborServices = cashForPurchasingAndReceivingLaborServices;
    }

    public BigDecimal getCashPaidToAndForEmployees() {
        return cashPaidToAndForEmployees;
    }

    public void setCashPaidToAndForEmployees(BigDecimal cashPaidToAndForEmployees) {
        this.cashPaidToAndForEmployees = cashPaidToAndForEmployees;
    }

    public BigDecimal getVariousTaxesPaid() {
        return variousTaxesPaid;
    }

    public void setVariousTaxesPaid(BigDecimal variousTaxesPaid) {
        this.variousTaxesPaid = variousTaxesPaid;
    }

    public BigDecimal getOtherCashPaidRelatedToOperatingActivities() {
        return otherCashPaidRelatedToOperatingActivities;
    }

    public void setOtherCashPaidRelatedToOperatingActivities(BigDecimal otherCashPaidRelatedToOperatingActivities) {
        this.otherCashPaidRelatedToOperatingActivities = otherCashPaidRelatedToOperatingActivities;
    }

    public BigDecimal getSubtotalCashOutflowFromOperatingActivities() {
        return subtotalCashOutflowFromOperatingActivities;
    }

    public void setSubtotalCashOutflowFromOperatingActivities(BigDecimal subtotalCashOutflowFromOperatingActivities) {
        this.subtotalCashOutflowFromOperatingActivities = subtotalCashOutflowFromOperatingActivities;
    }

    public BigDecimal getNetCashFlowFromOperatingActivities() {
        return netCashFlowFromOperatingActivities;
    }

    public void setNetCashFlowFromOperatingActivities(BigDecimal netCashFlowFromOperatingActivities) {
        this.netCashFlowFromOperatingActivities = netCashFlowFromOperatingActivities;
    }

    public BigDecimal getCashFlowFromInvestmentActivities() {
        return cashFlowFromInvestmentActivities;
    }

    public void setCashFlowFromInvestmentActivities(BigDecimal cashFlowFromInvestmentActivities) {
        this.cashFlowFromInvestmentActivities = cashFlowFromInvestmentActivities;
    }

    public BigDecimal getCashReceivedFromInvestmentRecovery() {
        return cashReceivedFromInvestmentRecovery;
    }

    public void setCashReceivedFromInvestmentRecovery(BigDecimal cashReceivedFromInvestmentRecovery) {
        this.cashReceivedFromInvestmentRecovery = cashReceivedFromInvestmentRecovery;
    }

    public BigDecimal getCashReceivedFromInvestmentIncome() {
        return cashReceivedFromInvestmentIncome;
    }

    public void setCashReceivedFromInvestmentIncome(BigDecimal cashReceivedFromInvestmentIncome) {
        this.cashReceivedFromInvestmentIncome = cashReceivedFromInvestmentIncome;
    }

    public BigDecimal getNetCashFromDisposalFixedAssets() {
        return netCashFromDisposalFixedAssets;
    }

    public void setNetCashFromDisposalFixedAssets(BigDecimal netCashFromDisposalFixedAssets) {
        this.netCashFromDisposalFixedAssets = netCashFromDisposalFixedAssets;
    }

    public BigDecimal getNetCashFromDisposalOtherBusinessUnits() {
        return netCashFromDisposalOtherBusinessUnits;
    }

    public void setNetCashFromDisposalOtherBusinessUnits(BigDecimal netCashFromDisposalOtherBusinessUnits) {
        this.netCashFromDisposalOtherBusinessUnits = netCashFromDisposalOtherBusinessUnits;
    }

    public BigDecimal getOtherCashReceivedRelatedToInvestment() {
        return otherCashReceivedRelatedToInvestment;
    }

    public void setOtherCashReceivedRelatedToInvestment(BigDecimal otherCashReceivedRelatedToInvestment) {
        this.otherCashReceivedRelatedToInvestment = otherCashReceivedRelatedToInvestment;
    }

    public BigDecimal getSubtotalOfCashInflowFromInvestment() {
        return subtotalOfCashInflowFromInvestment;
    }

    public void setSubtotalOfCashInflowFromInvestment(BigDecimal subtotalOfCashInflowFromInvestment) {
        this.subtotalOfCashInflowFromInvestment = subtotalOfCashInflowFromInvestment;
    }

    public BigDecimal getCashPaidForPurchaseFixedAssets() {
        return cashPaidForPurchaseFixedAssets;
    }

    public void setCashPaidForPurchaseFixedAssets(BigDecimal cashPaidForPurchaseFixedAssets) {
        this.cashPaidForPurchaseFixedAssets = cashPaidForPurchaseFixedAssets;
    }

    public BigDecimal getCashPaidForInvestment() {
        return cashPaidForInvestment;
    }

    public void setCashPaidForInvestment(BigDecimal cashPaidForInvestment) {
        this.cashPaidForInvestment = cashPaidForInvestment;
    }

    public BigDecimal getObtainNetCashPaidByOtherBusinessUnits() {
        return obtainNetCashPaidByOtherBusinessUnits;
    }

    public void setObtainNetCashPaidByOtherBusinessUnits(BigDecimal obtainNetCashPaidByOtherBusinessUnits) {
        this.obtainNetCashPaidByOtherBusinessUnits = obtainNetCashPaidByOtherBusinessUnits;
    }

    public BigDecimal getOtherCashPaidRelatedToInvestment() {
        return otherCashPaidRelatedToInvestment;
    }

    public void setOtherCashPaidRelatedToInvestment(BigDecimal otherCashPaidRelatedToInvestment) {
        this.otherCashPaidRelatedToInvestment = otherCashPaidRelatedToInvestment;
    }

    public BigDecimal getSubtotalOfCashOutflowsFromInvestment() {
        return subtotalOfCashOutflowsFromInvestment;
    }

    public void setSubtotalOfCashOutflowsFromInvestment(BigDecimal subtotalOfCashOutflowsFromInvestment) {
        this.subtotalOfCashOutflowsFromInvestment = subtotalOfCashOutflowsFromInvestment;
    }

    public BigDecimal getNetCashFlowsFromInvestingActivities() {
        return netCashFlowsFromInvestingActivities;
    }

    public void setNetCashFlowsFromInvestingActivities(BigDecimal netCashFlowsFromInvestingActivities) {
        this.netCashFlowsFromInvestingActivities = netCashFlowsFromInvestingActivities;
    }

    public BigDecimal getCashFlowFromFinancingActivities() {
        return cashFlowFromFinancingActivities;
    }

    public void setCashFlowFromFinancingActivities(BigDecimal cashFlowFromFinancingActivities) {
        this.cashFlowFromFinancingActivities = cashFlowFromFinancingActivities;
    }

    public BigDecimal getAbsorbCashReceivedFromInvestment() {
        return absorbCashReceivedFromInvestment;
    }

    public void setAbsorbCashReceivedFromInvestment(BigDecimal absorbCashReceivedFromInvestment) {
        this.absorbCashReceivedFromInvestment = absorbCashReceivedFromInvestment;
    }

    public BigDecimal getCashReceivedFromMinority() {
        return cashReceivedFromMinority;
    }

    public void setCashReceivedFromMinority(BigDecimal cashReceivedFromMinority) {
        this.cashReceivedFromMinority = cashReceivedFromMinority;
    }

    public BigDecimal getObtainTheCashReceivedFromTheLoan() {
        return obtainTheCashReceivedFromTheLoan;
    }

    public void setObtainTheCashReceivedFromTheLoan(BigDecimal obtainTheCashReceivedFromTheLoan) {
        this.obtainTheCashReceivedFromTheLoan = obtainTheCashReceivedFromTheLoan;
    }

    public BigDecimal getCashReceivedFromIssuingBonds() {
        return cashReceivedFromIssuingBonds;
    }

    public void setCashReceivedFromIssuingBonds(BigDecimal cashReceivedFromIssuingBonds) {
        this.cashReceivedFromIssuingBonds = cashReceivedFromIssuingBonds;
    }

    public BigDecimal getReceiveOtherCashRelatedToFinancing() {
        return receiveOtherCashRelatedToFinancing;
    }

    public void setReceiveOtherCashRelatedToFinancing(BigDecimal receiveOtherCashRelatedToFinancing) {
        this.receiveOtherCashRelatedToFinancing = receiveOtherCashRelatedToFinancing;
    }

    public BigDecimal getSubtotalOfCashInflowsFromFinancing() {
        return subtotalOfCashInflowsFromFinancing;
    }

    public void setSubtotalOfCashInflowsFromFinancing(BigDecimal subtotalOfCashInflowsFromFinancing) {
        this.subtotalOfCashInflowsFromFinancing = subtotalOfCashInflowsFromFinancing;
    }

    public BigDecimal getCashPaidForDebtRepayment() {
        return cashPaidForDebtRepayment;
    }

    public void setCashPaidForDebtRepayment(BigDecimal cashPaidForDebtRepayment) {
        this.cashPaidForDebtRepayment = cashPaidForDebtRepayment;
    }

    public BigDecimal getCashPaidForDividendsProfitsrInterestPayments() {
        return cashPaidForDividendsProfitsrInterestPayments;
    }

    public void setCashPaidForDividendsProfitsrInterestPayments(BigDecimal cashPaidForDividendsProfitsrInterestPayments) {
        this.cashPaidForDividendsProfitsrInterestPayments = cashPaidForDividendsProfitsrInterestPayments;
    }

    public BigDecimal getDividendsProfitsPaidToMinorityShareholders() {
        return dividendsProfitsPaidToMinorityShareholders;
    }

    public void setDividendsProfitsPaidToMinorityShareholders(BigDecimal dividendsProfitsPaidToMinorityShareholders) {
        this.dividendsProfitsPaidToMinorityShareholders = dividendsProfitsPaidToMinorityShareholders;
    }

    public BigDecimal getPaymentOfOtherCashRelatedFinancing() {
        return paymentOfOtherCashRelatedFinancing;
    }

    public void setPaymentOfOtherCashRelatedFinancing(BigDecimal paymentOfOtherCashRelatedFinancing) {
        this.paymentOfOtherCashRelatedFinancing = paymentOfOtherCashRelatedFinancing;
    }

    public BigDecimal getSubtotalOfCashOutflowsFromFinancing() {
        return subtotalOfCashOutflowsFromFinancing;
    }

    public void setSubtotalOfCashOutflowsFromFinancing(BigDecimal subtotalOfCashOutflowsFromFinancing) {
        this.subtotalOfCashOutflowsFromFinancing = subtotalOfCashOutflowsFromFinancing;
    }

    public BigDecimal getNetCashFlowFromFinancingActivities() {
        return netCashFlowFromFinancingActivities;
    }

    public void setNetCashFlowFromFinancingActivities(BigDecimal netCashFlowFromFinancingActivities) {
        this.netCashFlowFromFinancingActivities = netCashFlowFromFinancingActivities;
    }

    public BigDecimal getImpactOfExchangeRateChanges() {
        return impactOfExchangeRateChanges;
    }

    public void setImpactOfExchangeRateChanges(BigDecimal impactOfExchangeRateChanges) {
        this.impactOfExchangeRateChanges = impactOfExchangeRateChanges;
    }

    public BigDecimal getNetIncreaseInCashAndCashEquivalents() {
        return netIncreaseInCashAndCashEquivalents;
    }

    public void setNetIncreaseInCashAndCashEquivalents(BigDecimal netIncreaseInCashAndCashEquivalents) {
        this.netIncreaseInCashAndCashEquivalents = netIncreaseInCashAndCashEquivalents;
    }

    public BigDecimal getCashAndCashEquivalentsAtBeginning() {
        return cashAndCashEquivalentsAtBeginning;
    }

    public void setCashAndCashEquivalentsAtBeginning(BigDecimal cashAndCashEquivalentsAtBeginning) {
        this.cashAndCashEquivalentsAtBeginning = cashAndCashEquivalentsAtBeginning;
    }

    public BigDecimal getCashAndCashEquivalentsAtEnd() {
        return cashAndCashEquivalentsAtEnd;
    }

    public void setCashAndCashEquivalentsAtEnd(BigDecimal cashAndCashEquivalentsAtEnd) {
        this.cashAndCashEquivalentsAtEnd = cashAndCashEquivalentsAtEnd;
    }

    public BigDecimal getNotes() {
        return notes;
    }

    public void setNotes(BigDecimal notes) {
        this.notes = notes;
    }

    public BigDecimal getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(BigDecimal netProfit) {
        this.netProfit = netProfit;
    }

    public BigDecimal getMinorityInterest() {
        return minorityInterest;
    }

    public void setMinorityInterest(BigDecimal minorityInterest) {
        this.minorityInterest = minorityInterest;
    }

    public BigDecimal getUnrecognizedInvestmentLosses() {
        return unrecognizedInvestmentLosses;
    }

    public void setUnrecognizedInvestmentLosses(BigDecimal unrecognizedInvestmentLosses) {
        this.unrecognizedInvestmentLosses = unrecognizedInvestmentLosses;
    }

    public BigDecimal getImpairmentOfAssets() {
        return impairmentOfAssets;
    }

    public void setImpairmentOfAssets(BigDecimal impairmentOfAssets) {
        this.impairmentOfAssets = impairmentOfAssets;
    }

    public BigDecimal getDepreciationOfAssets() {
        return depreciationOfAssets;
    }

    public void setDepreciationOfAssets(BigDecimal depreciationOfAssets) {
        this.depreciationOfAssets = depreciationOfAssets;
    }

    public BigDecimal getAmortizationOfIntangibleAssets() {
        return amortizationOfIntangibleAssets;
    }

    public void setAmortizationOfIntangibleAssets(BigDecimal amortizationOfIntangibleAssets) {
        this.amortizationOfIntangibleAssets = amortizationOfIntangibleAssets;
    }

    public BigDecimal getAmortizationOfLongTermDeferredExpenses() {
        return amortizationOfLongTermDeferredExpenses;
    }

    public void setAmortizationOfLongTermDeferredExpenses(BigDecimal amortizationOfLongTermDeferredExpenses) {
        this.amortizationOfLongTermDeferredExpenses = amortizationOfLongTermDeferredExpenses;
    }

    public BigDecimal getDecreaseInDeferredExpenses() {
        return decreaseInDeferredExpenses;
    }

    public void setDecreaseInDeferredExpenses(BigDecimal decreaseInDeferredExpenses) {
        this.decreaseInDeferredExpenses = decreaseInDeferredExpenses;
    }

    public BigDecimal getIncreaseInAccruedExpenses() {
        return increaseInAccruedExpenses;
    }

    public void setIncreaseInAccruedExpenses(BigDecimal increaseInAccruedExpenses) {
        this.increaseInAccruedExpenses = increaseInAccruedExpenses;
    }

    public BigDecimal getDisposalFixedIntangibleLongTermAssets() {
        return disposalFixedIntangibleLongTermAssets;
    }

    public void setDisposalFixedIntangibleLongTermAssets(BigDecimal disposalFixedIntangibleLongTermAssets) {
        this.disposalFixedIntangibleLongTermAssets = disposalFixedIntangibleLongTermAssets;
    }

    public BigDecimal getFixedAssetRetirementLoss() {
        return fixedAssetRetirementLoss;
    }

    public void setFixedAssetRetirementLoss(BigDecimal fixedAssetRetirementLoss) {
        this.fixedAssetRetirementLoss = fixedAssetRetirementLoss;
    }

    public BigDecimal getLossFromChangesInFairValue() {
        return lossFromChangesInFairValue;
    }

    public void setLossFromChangesInFairValue(BigDecimal lossFromChangesInFairValue) {
        this.lossFromChangesInFairValue = lossFromChangesInFairValue;
    }

    public BigDecimal getDeferredIncomeIncreases() {
        return deferredIncomeIncreases;
    }

    public void setDeferredIncomeIncreases(BigDecimal deferredIncomeIncreases) {
        this.deferredIncomeIncreases = deferredIncomeIncreases;
    }

    public BigDecimal getEstimatedLiabilities() {
        return estimatedLiabilities;
    }

    public void setEstimatedLiabilities(BigDecimal estimatedLiabilities) {
        this.estimatedLiabilities = estimatedLiabilities;
    }

    public BigDecimal getFinancialExpenses() {
        return financialExpenses;
    }

    public void setFinancialExpenses(BigDecimal financialExpenses) {
        this.financialExpenses = financialExpenses;
    }

    public BigDecimal getInvestmentLoss() {
        return investmentLoss;
    }

    public void setInvestmentLoss(BigDecimal investmentLoss) {
        this.investmentLoss = investmentLoss;
    }

    public BigDecimal getDecreaseInDeferredIncomeTaxAssets() {
        return decreaseInDeferredIncomeTaxAssets;
    }

    public void setDecreaseInDeferredIncomeTaxAssets(BigDecimal decreaseInDeferredIncomeTaxAssets) {
        this.decreaseInDeferredIncomeTaxAssets = decreaseInDeferredIncomeTaxAssets;
    }

    public BigDecimal getIncreaseInDeferredIncomeTaxLiabilities() {
        return increaseInDeferredIncomeTaxLiabilities;
    }

    public void setIncreaseInDeferredIncomeTaxLiabilities(BigDecimal increaseInDeferredIncomeTaxLiabilities) {
        this.increaseInDeferredIncomeTaxLiabilities = increaseInDeferredIncomeTaxLiabilities;
    }

    public BigDecimal getInventoryReduction() {
        return inventoryReduction;
    }

    public void setInventoryReduction(BigDecimal inventoryReduction) {
        this.inventoryReduction = inventoryReduction;
    }

    public BigDecimal getDecreaseOfOperatingReceivables() {
        return decreaseOfOperatingReceivables;
    }

    public void setDecreaseOfOperatingReceivables(BigDecimal decreaseOfOperatingReceivables) {
        this.decreaseOfOperatingReceivables = decreaseOfOperatingReceivables;
    }

    public BigDecimal getIncreaseInOperationalPayableItems() {
        return increaseInOperationalPayableItems;
    }

    public void setIncreaseInOperationalPayableItems(BigDecimal increaseInOperationalPayableItems) {
        this.increaseInOperationalPayableItems = increaseInOperationalPayableItems;
    }

    public BigDecimal getDecreaseCompletedAndUnsettledPayments() {
        return decreaseCompletedAndUnsettledPayments;
    }

    public void setDecreaseCompletedAndUnsettledPayments(BigDecimal decreaseCompletedAndUnsettledPayments) {
        this.decreaseCompletedAndUnsettledPayments = decreaseCompletedAndUnsettledPayments;
    }

    public BigDecimal getIncreaseSettledOutstandingWork() {
        return increaseSettledOutstandingWork;
    }

    public void setIncreaseSettledOutstandingWork(BigDecimal increaseSettledOutstandingWork) {
        this.increaseSettledOutstandingWork = increaseSettledOutstandingWork;
    }

    public BigDecimal getOther() {
        return other;
    }

    public void setOther(BigDecimal other) {
        this.other = other;
    }

    public BigDecimal getOtherNetCashFlowFromOperatingActivities() {
        return otherNetCashFlowFromOperatingActivities;
    }

    public void setOtherNetCashFlowFromOperatingActivities(BigDecimal otherNetCashFlowFromOperatingActivities) {
        this.otherNetCashFlowFromOperatingActivities = otherNetCashFlowFromOperatingActivities;
    }

    public BigDecimal getConversionOfDebtIntoCapital() {
        return conversionOfDebtIntoCapital;
    }

    public void setConversionOfDebtIntoCapital(BigDecimal conversionOfDebtIntoCapital) {
        this.conversionOfDebtIntoCapital = conversionOfDebtIntoCapital;
    }

    public BigDecimal getConvertibleBondsWithinOneYear() {
        return convertibleBondsWithinOneYear;
    }

    public void setConvertibleBondsWithinOneYear(BigDecimal convertibleBondsWithinOneYear) {
        this.convertibleBondsWithinOneYear = convertibleBondsWithinOneYear;
    }

    public BigDecimal getFinancingLeasedFixedAssets() {
        return financingLeasedFixedAssets;
    }

    public void setFinancingLeasedFixedAssets(BigDecimal financingLeasedFixedAssets) {
        this.financingLeasedFixedAssets = financingLeasedFixedAssets;
    }

    public BigDecimal getCashEndingBalance() {
        return cashEndingBalance;
    }

    public void setCashEndingBalance(BigDecimal cashEndingBalance) {
        this.cashEndingBalance = cashEndingBalance;
    }

    public BigDecimal getOpeningBalanceOfCash() {
        return openingBalanceOfCash;
    }

    public void setOpeningBalanceOfCash(BigDecimal openingBalanceOfCash) {
        this.openingBalanceOfCash = openingBalanceOfCash;
    }

    public BigDecimal getClosingBalanceOfCashEquivalents() {
        return closingBalanceOfCashEquivalents;
    }

    public void setClosingBalanceOfCashEquivalents(BigDecimal closingBalanceOfCashEquivalents) {
        this.closingBalanceOfCashEquivalents = closingBalanceOfCashEquivalents;
    }

    public BigDecimal getOpeningBalanceOfCashEquivalents() {
        return openingBalanceOfCashEquivalents;
    }

    public void setOpeningBalanceOfCashEquivalents(BigDecimal openingBalanceOfCashEquivalents) {
        this.openingBalanceOfCashEquivalents = openingBalanceOfCashEquivalents;
    }

    public BigDecimal getNetIncreaseCashAndEquivalents() {
        return netIncreaseCashAndEquivalents;
    }

    public void setNetIncreaseCashAndEquivalents(BigDecimal netIncreaseCashAndEquivalents) {
        this.netIncreaseCashAndEquivalents = netIncreaseCashAndEquivalents;
    }
}