package com.gegaofeng.stock.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Assets implements Serializable {
    private Integer no;

    private Date updateDate;

    private String stockId;

    private Date reportDate;

    private String unit;

    private BigDecimal currentAssets;

    private BigDecimal moneyFunds;

    private BigDecimal tradingFinancialAssets;

    private BigDecimal derivativeFinancialAssets;

    private BigDecimal billsAccountsReceivable;

    private BigDecimal billReceivable;

    private BigDecimal accountsReceivable;

    private BigDecimal receivableFinancing;

    private BigDecimal prepayments;

    private BigDecimal totalOtherReceivables;

    private BigDecimal interestReceivable;

    private BigDecimal dividendReceivable;

    private BigDecimal otherReceivables;

    private BigDecimal resaleFinancialAssets;

    private BigDecimal stock;

    private BigDecimal assetsHeldForSale;

    private BigDecimal nonCurrentAssetsOneYear;

    private BigDecimal prepaidExpenses;

    private BigDecimal pendingCurrentAssets;

    private BigDecimal otherCurrentAssets;

    private BigDecimal totalCurrentAssets;

    private BigDecimal nonCurrentAssets;

    private BigDecimal loansAndAdvances;

    private BigDecimal availableSaleFinancialAssets;

    private BigDecimal heldToMaturityInvestments;

    private BigDecimal longTermReceivables;

    private BigDecimal longTermEquityInvestment;

    private BigDecimal investmentRealEstate;

    private BigDecimal totalConstructionInProgress;

    private BigDecimal constructionInProgress;

    private BigDecimal engineerMaterial;

    private BigDecimal totalFixedAssetsLiquidation;

    private BigDecimal netFixedAssets;

    private BigDecimal fixedAssetsClearance;

    private BigDecimal productiveBiologicalAssets;

    private BigDecimal welfareBiologicalAssets;

    private BigDecimal oilGasAsset;

    private BigDecimal rightOfUseAsset;

    private BigDecimal intangibleAssets;

    private BigDecimal developmentExpenditure;

    private BigDecimal goodwill;

    private BigDecimal longTermPrepaidExpenses;

    private BigDecimal deferredTaxAssets;

    private BigDecimal otherNonCurrentAssets;

    private BigDecimal totalNonCurrentAssets;

    private BigDecimal totalAssets;

    private BigDecimal currentLiabilities;

    private BigDecimal shortTermLoan;

    private BigDecimal transactionalFinancialLiabilities;

    private BigDecimal billsAccountsPayable;

    private BigDecimal billsPayable;

    private BigDecimal accountsPayable;

    private BigDecimal advancePayment;

    private BigDecimal feesCommissions;

    private BigDecimal staffPayable;

    private BigDecimal taxesPayable;

    private BigDecimal totalOtherPayables;

    private BigDecimal interestPayable;

    private BigDecimal dividendPayable;

    private BigDecimal otherPayables;

    private BigDecimal withholdingFees;

    private BigDecimal deferredIncomeWithinOneYear;

    private BigDecimal payableShortTermBonds;

    private BigDecimal nonCurrentLiabilitiesWithinOne;

    private BigDecimal otherCurrentLiabilities;

    private BigDecimal totalCurrentLiabilities;

    private BigDecimal nonCurrentLiabilities;

    private BigDecimal longTermLoan;

    private BigDecimal bondsPayable;

    private BigDecimal leaseLiability;

    private BigDecimal longTermCompensation;

    private BigDecimal totalLongTermPayables;

    private BigDecimal longTermPayables;

    private BigDecimal specialPayables;

    private BigDecimal estimatedNonCurrentLiabilities;

    private BigDecimal deferredIncomeTaxLiabilities;

    private BigDecimal longTermDeferredIncome;

    private BigDecimal otherNonCurrentLiabilities;

    private BigDecimal totalNonCurrentLiabilities;

    private BigDecimal totalLiabilities;

    private BigDecimal ownersEquity;

    private BigDecimal shareCapital;

    private BigDecimal capitalReserve;

    private BigDecimal treasuryShares;

    private BigDecimal otherComprehensiveIncome;

    private BigDecimal specialReserves;

    private BigDecimal surplusReserve;

    private BigDecimal generalRiskPreparation;

    private BigDecimal undistributedProfit;

    private BigDecimal totalEquityToParent;

    private BigDecimal minorityInterest;

    private BigDecimal totalEquity;

    private BigDecimal totalLiabilitiesEquity;

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

    public BigDecimal getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(BigDecimal currentAssets) {
        this.currentAssets = currentAssets;
    }

    public BigDecimal getMoneyFunds() {
        return moneyFunds;
    }

    public void setMoneyFunds(BigDecimal moneyFunds) {
        this.moneyFunds = moneyFunds;
    }

    public BigDecimal getTradingFinancialAssets() {
        return tradingFinancialAssets;
    }

    public void setTradingFinancialAssets(BigDecimal tradingFinancialAssets) {
        this.tradingFinancialAssets = tradingFinancialAssets;
    }

    public BigDecimal getDerivativeFinancialAssets() {
        return derivativeFinancialAssets;
    }

    public void setDerivativeFinancialAssets(BigDecimal derivativeFinancialAssets) {
        this.derivativeFinancialAssets = derivativeFinancialAssets;
    }

    public BigDecimal getBillsAccountsReceivable() {
        return billsAccountsReceivable;
    }

    public void setBillsAccountsReceivable(BigDecimal billsAccountsReceivable) {
        this.billsAccountsReceivable = billsAccountsReceivable;
    }

    public BigDecimal getBillReceivable() {
        return billReceivable;
    }

    public void setBillReceivable(BigDecimal billReceivable) {
        this.billReceivable = billReceivable;
    }

    public BigDecimal getAccountsReceivable() {
        return accountsReceivable;
    }

    public void setAccountsReceivable(BigDecimal accountsReceivable) {
        this.accountsReceivable = accountsReceivable;
    }

    public BigDecimal getReceivableFinancing() {
        return receivableFinancing;
    }

    public void setReceivableFinancing(BigDecimal receivableFinancing) {
        this.receivableFinancing = receivableFinancing;
    }

    public BigDecimal getPrepayments() {
        return prepayments;
    }

    public void setPrepayments(BigDecimal prepayments) {
        this.prepayments = prepayments;
    }

    public BigDecimal getTotalOtherReceivables() {
        return totalOtherReceivables;
    }

    public void setTotalOtherReceivables(BigDecimal totalOtherReceivables) {
        this.totalOtherReceivables = totalOtherReceivables;
    }

    public BigDecimal getInterestReceivable() {
        return interestReceivable;
    }

    public void setInterestReceivable(BigDecimal interestReceivable) {
        this.interestReceivable = interestReceivable;
    }

    public BigDecimal getDividendReceivable() {
        return dividendReceivable;
    }

    public void setDividendReceivable(BigDecimal dividendReceivable) {
        this.dividendReceivable = dividendReceivable;
    }

    public BigDecimal getOtherReceivables() {
        return otherReceivables;
    }

    public void setOtherReceivables(BigDecimal otherReceivables) {
        this.otherReceivables = otherReceivables;
    }

    public BigDecimal getResaleFinancialAssets() {
        return resaleFinancialAssets;
    }

    public void setResaleFinancialAssets(BigDecimal resaleFinancialAssets) {
        this.resaleFinancialAssets = resaleFinancialAssets;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getAssetsHeldForSale() {
        return assetsHeldForSale;
    }

    public void setAssetsHeldForSale(BigDecimal assetsHeldForSale) {
        this.assetsHeldForSale = assetsHeldForSale;
    }

    public BigDecimal getNonCurrentAssetsOneYear() {
        return nonCurrentAssetsOneYear;
    }

    public void setNonCurrentAssetsOneYear(BigDecimal nonCurrentAssetsOneYear) {
        this.nonCurrentAssetsOneYear = nonCurrentAssetsOneYear;
    }

    public BigDecimal getPrepaidExpenses() {
        return prepaidExpenses;
    }

    public void setPrepaidExpenses(BigDecimal prepaidExpenses) {
        this.prepaidExpenses = prepaidExpenses;
    }

    public BigDecimal getPendingCurrentAssets() {
        return pendingCurrentAssets;
    }

    public void setPendingCurrentAssets(BigDecimal pendingCurrentAssets) {
        this.pendingCurrentAssets = pendingCurrentAssets;
    }

    public BigDecimal getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    public void setOtherCurrentAssets(BigDecimal otherCurrentAssets) {
        this.otherCurrentAssets = otherCurrentAssets;
    }

    public BigDecimal getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    public void setTotalCurrentAssets(BigDecimal totalCurrentAssets) {
        this.totalCurrentAssets = totalCurrentAssets;
    }

    public BigDecimal getNonCurrentAssets() {
        return nonCurrentAssets;
    }

    public void setNonCurrentAssets(BigDecimal nonCurrentAssets) {
        this.nonCurrentAssets = nonCurrentAssets;
    }

    public BigDecimal getLoansAndAdvances() {
        return loansAndAdvances;
    }

    public void setLoansAndAdvances(BigDecimal loansAndAdvances) {
        this.loansAndAdvances = loansAndAdvances;
    }

    public BigDecimal getAvailableSaleFinancialAssets() {
        return availableSaleFinancialAssets;
    }

    public void setAvailableSaleFinancialAssets(BigDecimal availableSaleFinancialAssets) {
        this.availableSaleFinancialAssets = availableSaleFinancialAssets;
    }

    public BigDecimal getHeldToMaturityInvestments() {
        return heldToMaturityInvestments;
    }

    public void setHeldToMaturityInvestments(BigDecimal heldToMaturityInvestments) {
        this.heldToMaturityInvestments = heldToMaturityInvestments;
    }

    public BigDecimal getLongTermReceivables() {
        return longTermReceivables;
    }

    public void setLongTermReceivables(BigDecimal longTermReceivables) {
        this.longTermReceivables = longTermReceivables;
    }

    public BigDecimal getLongTermEquityInvestment() {
        return longTermEquityInvestment;
    }

    public void setLongTermEquityInvestment(BigDecimal longTermEquityInvestment) {
        this.longTermEquityInvestment = longTermEquityInvestment;
    }

    public BigDecimal getInvestmentRealEstate() {
        return investmentRealEstate;
    }

    public void setInvestmentRealEstate(BigDecimal investmentRealEstate) {
        this.investmentRealEstate = investmentRealEstate;
    }

    public BigDecimal getTotalConstructionInProgress() {
        return totalConstructionInProgress;
    }

    public void setTotalConstructionInProgress(BigDecimal totalConstructionInProgress) {
        this.totalConstructionInProgress = totalConstructionInProgress;
    }

    public BigDecimal getConstructionInProgress() {
        return constructionInProgress;
    }

    public void setConstructionInProgress(BigDecimal constructionInProgress) {
        this.constructionInProgress = constructionInProgress;
    }

    public BigDecimal getEngineerMaterial() {
        return engineerMaterial;
    }

    public void setEngineerMaterial(BigDecimal engineerMaterial) {
        this.engineerMaterial = engineerMaterial;
    }

    public BigDecimal getTotalFixedAssetsLiquidation() {
        return totalFixedAssetsLiquidation;
    }

    public void setTotalFixedAssetsLiquidation(BigDecimal totalFixedAssetsLiquidation) {
        this.totalFixedAssetsLiquidation = totalFixedAssetsLiquidation;
    }

    public BigDecimal getNetFixedAssets() {
        return netFixedAssets;
    }

    public void setNetFixedAssets(BigDecimal netFixedAssets) {
        this.netFixedAssets = netFixedAssets;
    }

    public BigDecimal getFixedAssetsClearance() {
        return fixedAssetsClearance;
    }

    public void setFixedAssetsClearance(BigDecimal fixedAssetsClearance) {
        this.fixedAssetsClearance = fixedAssetsClearance;
    }

    public BigDecimal getProductiveBiologicalAssets() {
        return productiveBiologicalAssets;
    }

    public void setProductiveBiologicalAssets(BigDecimal productiveBiologicalAssets) {
        this.productiveBiologicalAssets = productiveBiologicalAssets;
    }

    public BigDecimal getWelfareBiologicalAssets() {
        return welfareBiologicalAssets;
    }

    public void setWelfareBiologicalAssets(BigDecimal welfareBiologicalAssets) {
        this.welfareBiologicalAssets = welfareBiologicalAssets;
    }

    public BigDecimal getOilGasAsset() {
        return oilGasAsset;
    }

    public void setOilGasAsset(BigDecimal oilGasAsset) {
        this.oilGasAsset = oilGasAsset;
    }

    public BigDecimal getRightOfUseAsset() {
        return rightOfUseAsset;
    }

    public void setRightOfUseAsset(BigDecimal rightOfUseAsset) {
        this.rightOfUseAsset = rightOfUseAsset;
    }

    public BigDecimal getIntangibleAssets() {
        return intangibleAssets;
    }

    public void setIntangibleAssets(BigDecimal intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
    }

    public BigDecimal getDevelopmentExpenditure() {
        return developmentExpenditure;
    }

    public void setDevelopmentExpenditure(BigDecimal developmentExpenditure) {
        this.developmentExpenditure = developmentExpenditure;
    }

    public BigDecimal getGoodwill() {
        return goodwill;
    }

    public void setGoodwill(BigDecimal goodwill) {
        this.goodwill = goodwill;
    }

    public BigDecimal getLongTermPrepaidExpenses() {
        return longTermPrepaidExpenses;
    }

    public void setLongTermPrepaidExpenses(BigDecimal longTermPrepaidExpenses) {
        this.longTermPrepaidExpenses = longTermPrepaidExpenses;
    }

    public BigDecimal getDeferredTaxAssets() {
        return deferredTaxAssets;
    }

    public void setDeferredTaxAssets(BigDecimal deferredTaxAssets) {
        this.deferredTaxAssets = deferredTaxAssets;
    }

    public BigDecimal getOtherNonCurrentAssets() {
        return otherNonCurrentAssets;
    }

    public void setOtherNonCurrentAssets(BigDecimal otherNonCurrentAssets) {
        this.otherNonCurrentAssets = otherNonCurrentAssets;
    }

    public BigDecimal getTotalNonCurrentAssets() {
        return totalNonCurrentAssets;
    }

    public void setTotalNonCurrentAssets(BigDecimal totalNonCurrentAssets) {
        this.totalNonCurrentAssets = totalNonCurrentAssets;
    }

    public BigDecimal getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(BigDecimal totalAssets) {
        this.totalAssets = totalAssets;
    }

    public BigDecimal getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(BigDecimal currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public BigDecimal getShortTermLoan() {
        return shortTermLoan;
    }

    public void setShortTermLoan(BigDecimal shortTermLoan) {
        this.shortTermLoan = shortTermLoan;
    }

    public BigDecimal getTransactionalFinancialLiabilities() {
        return transactionalFinancialLiabilities;
    }

    public void setTransactionalFinancialLiabilities(BigDecimal transactionalFinancialLiabilities) {
        this.transactionalFinancialLiabilities = transactionalFinancialLiabilities;
    }

    public BigDecimal getBillsAccountsPayable() {
        return billsAccountsPayable;
    }

    public void setBillsAccountsPayable(BigDecimal billsAccountsPayable) {
        this.billsAccountsPayable = billsAccountsPayable;
    }

    public BigDecimal getBillsPayable() {
        return billsPayable;
    }

    public void setBillsPayable(BigDecimal billsPayable) {
        this.billsPayable = billsPayable;
    }

    public BigDecimal getAccountsPayable() {
        return accountsPayable;
    }

    public void setAccountsPayable(BigDecimal accountsPayable) {
        this.accountsPayable = accountsPayable;
    }

    public BigDecimal getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(BigDecimal advancePayment) {
        this.advancePayment = advancePayment;
    }

    public BigDecimal getFeesCommissions() {
        return feesCommissions;
    }

    public void setFeesCommissions(BigDecimal feesCommissions) {
        this.feesCommissions = feesCommissions;
    }

    public BigDecimal getStaffPayable() {
        return staffPayable;
    }

    public void setStaffPayable(BigDecimal staffPayable) {
        this.staffPayable = staffPayable;
    }

    public BigDecimal getTaxesPayable() {
        return taxesPayable;
    }

    public void setTaxesPayable(BigDecimal taxesPayable) {
        this.taxesPayable = taxesPayable;
    }

    public BigDecimal getTotalOtherPayables() {
        return totalOtherPayables;
    }

    public void setTotalOtherPayables(BigDecimal totalOtherPayables) {
        this.totalOtherPayables = totalOtherPayables;
    }

    public BigDecimal getInterestPayable() {
        return interestPayable;
    }

    public void setInterestPayable(BigDecimal interestPayable) {
        this.interestPayable = interestPayable;
    }

    public BigDecimal getDividendPayable() {
        return dividendPayable;
    }

    public void setDividendPayable(BigDecimal dividendPayable) {
        this.dividendPayable = dividendPayable;
    }

    public BigDecimal getOtherPayables() {
        return otherPayables;
    }

    public void setOtherPayables(BigDecimal otherPayables) {
        this.otherPayables = otherPayables;
    }

    public BigDecimal getWithholdingFees() {
        return withholdingFees;
    }

    public void setWithholdingFees(BigDecimal withholdingFees) {
        this.withholdingFees = withholdingFees;
    }

    public BigDecimal getDeferredIncomeWithinOneYear() {
        return deferredIncomeWithinOneYear;
    }

    public void setDeferredIncomeWithinOneYear(BigDecimal deferredIncomeWithinOneYear) {
        this.deferredIncomeWithinOneYear = deferredIncomeWithinOneYear;
    }

    public BigDecimal getPayableShortTermBonds() {
        return payableShortTermBonds;
    }

    public void setPayableShortTermBonds(BigDecimal payableShortTermBonds) {
        this.payableShortTermBonds = payableShortTermBonds;
    }

    public BigDecimal getNonCurrentLiabilitiesWithinOne() {
        return nonCurrentLiabilitiesWithinOne;
    }

    public void setNonCurrentLiabilitiesWithinOne(BigDecimal nonCurrentLiabilitiesWithinOne) {
        this.nonCurrentLiabilitiesWithinOne = nonCurrentLiabilitiesWithinOne;
    }

    public BigDecimal getOtherCurrentLiabilities() {
        return otherCurrentLiabilities;
    }

    public void setOtherCurrentLiabilities(BigDecimal otherCurrentLiabilities) {
        this.otherCurrentLiabilities = otherCurrentLiabilities;
    }

    public BigDecimal getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    public void setTotalCurrentLiabilities(BigDecimal totalCurrentLiabilities) {
        this.totalCurrentLiabilities = totalCurrentLiabilities;
    }

    public BigDecimal getNonCurrentLiabilities() {
        return nonCurrentLiabilities;
    }

    public void setNonCurrentLiabilities(BigDecimal nonCurrentLiabilities) {
        this.nonCurrentLiabilities = nonCurrentLiabilities;
    }

    public BigDecimal getLongTermLoan() {
        return longTermLoan;
    }

    public void setLongTermLoan(BigDecimal longTermLoan) {
        this.longTermLoan = longTermLoan;
    }

    public BigDecimal getBondsPayable() {
        return bondsPayable;
    }

    public void setBondsPayable(BigDecimal bondsPayable) {
        this.bondsPayable = bondsPayable;
    }

    public BigDecimal getLeaseLiability() {
        return leaseLiability;
    }

    public void setLeaseLiability(BigDecimal leaseLiability) {
        this.leaseLiability = leaseLiability;
    }

    public BigDecimal getLongTermCompensation() {
        return longTermCompensation;
    }

    public void setLongTermCompensation(BigDecimal longTermCompensation) {
        this.longTermCompensation = longTermCompensation;
    }

    public BigDecimal getTotalLongTermPayables() {
        return totalLongTermPayables;
    }

    public void setTotalLongTermPayables(BigDecimal totalLongTermPayables) {
        this.totalLongTermPayables = totalLongTermPayables;
    }

    public BigDecimal getLongTermPayables() {
        return longTermPayables;
    }

    public void setLongTermPayables(BigDecimal longTermPayables) {
        this.longTermPayables = longTermPayables;
    }

    public BigDecimal getSpecialPayables() {
        return specialPayables;
    }

    public void setSpecialPayables(BigDecimal specialPayables) {
        this.specialPayables = specialPayables;
    }

    public BigDecimal getEstimatedNonCurrentLiabilities() {
        return estimatedNonCurrentLiabilities;
    }

    public void setEstimatedNonCurrentLiabilities(BigDecimal estimatedNonCurrentLiabilities) {
        this.estimatedNonCurrentLiabilities = estimatedNonCurrentLiabilities;
    }

    public BigDecimal getDeferredIncomeTaxLiabilities() {
        return deferredIncomeTaxLiabilities;
    }

    public void setDeferredIncomeTaxLiabilities(BigDecimal deferredIncomeTaxLiabilities) {
        this.deferredIncomeTaxLiabilities = deferredIncomeTaxLiabilities;
    }

    public BigDecimal getLongTermDeferredIncome() {
        return longTermDeferredIncome;
    }

    public void setLongTermDeferredIncome(BigDecimal longTermDeferredIncome) {
        this.longTermDeferredIncome = longTermDeferredIncome;
    }

    public BigDecimal getOtherNonCurrentLiabilities() {
        return otherNonCurrentLiabilities;
    }

    public void setOtherNonCurrentLiabilities(BigDecimal otherNonCurrentLiabilities) {
        this.otherNonCurrentLiabilities = otherNonCurrentLiabilities;
    }

    public BigDecimal getTotalNonCurrentLiabilities() {
        return totalNonCurrentLiabilities;
    }

    public void setTotalNonCurrentLiabilities(BigDecimal totalNonCurrentLiabilities) {
        this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
    }

    public BigDecimal getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(BigDecimal totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public BigDecimal getOwnersEquity() {
        return ownersEquity;
    }

    public void setOwnersEquity(BigDecimal ownersEquity) {
        this.ownersEquity = ownersEquity;
    }

    public BigDecimal getShareCapital() {
        return shareCapital;
    }

    public void setShareCapital(BigDecimal shareCapital) {
        this.shareCapital = shareCapital;
    }

    public BigDecimal getCapitalReserve() {
        return capitalReserve;
    }

    public void setCapitalReserve(BigDecimal capitalReserve) {
        this.capitalReserve = capitalReserve;
    }

    public BigDecimal getTreasuryShares() {
        return treasuryShares;
    }

    public void setTreasuryShares(BigDecimal treasuryShares) {
        this.treasuryShares = treasuryShares;
    }

    public BigDecimal getOtherComprehensiveIncome() {
        return otherComprehensiveIncome;
    }

    public void setOtherComprehensiveIncome(BigDecimal otherComprehensiveIncome) {
        this.otherComprehensiveIncome = otherComprehensiveIncome;
    }

    public BigDecimal getSpecialReserves() {
        return specialReserves;
    }

    public void setSpecialReserves(BigDecimal specialReserves) {
        this.specialReserves = specialReserves;
    }

    public BigDecimal getSurplusReserve() {
        return surplusReserve;
    }

    public void setSurplusReserve(BigDecimal surplusReserve) {
        this.surplusReserve = surplusReserve;
    }

    public BigDecimal getGeneralRiskPreparation() {
        return generalRiskPreparation;
    }

    public void setGeneralRiskPreparation(BigDecimal generalRiskPreparation) {
        this.generalRiskPreparation = generalRiskPreparation;
    }

    public BigDecimal getUndistributedProfit() {
        return undistributedProfit;
    }

    public void setUndistributedProfit(BigDecimal undistributedProfit) {
        this.undistributedProfit = undistributedProfit;
    }

    public BigDecimal getTotalEquityToParent() {
        return totalEquityToParent;
    }

    public void setTotalEquityToParent(BigDecimal totalEquityToParent) {
        this.totalEquityToParent = totalEquityToParent;
    }

    public BigDecimal getMinorityInterest() {
        return minorityInterest;
    }

    public void setMinorityInterest(BigDecimal minorityInterest) {
        this.minorityInterest = minorityInterest;
    }

    public BigDecimal getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(BigDecimal totalEquity) {
        this.totalEquity = totalEquity;
    }

    public BigDecimal getTotalLiabilitiesEquity() {
        return totalLiabilitiesEquity;
    }

    public void setTotalLiabilitiesEquity(BigDecimal totalLiabilitiesEquity) {
        this.totalLiabilitiesEquity = totalLiabilitiesEquity;
    }
}