package com.gegaofeng.stock.service;

import com.gegaofeng.stock.mapper.AssetsMapper;
import com.gegaofeng.stock.mapper.CalculationGuideLineMapper;
import com.gegaofeng.stock.mapper.CashFlowMapper;
import com.gegaofeng.stock.mapper.ProfitMapper;
import com.gegaofeng.stock.model.Assets;
import com.gegaofeng.stock.model.CalculationGuideLine;
import com.gegaofeng.stock.model.CashFlow;
import com.gegaofeng.stock.model.Profit;
import com.gegaofeng.stock.utils.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * CalculationGuideLineService
 *
 * @author Feng
 * @version 1.0   2020-06-13 18:30
 */
@Service
public class CalculationGuideLineService {
    @Autowired
    CalculationGuideLineMapper calculationGuideLineMapper;
    @Autowired
    ProfitMapper profitMapper;
    @Autowired
    AssetsMapper assetsMapper;
    @Autowired
    CashFlowMapper cashFlowMapper;

    private final BigDecimal ONE_YEAR = new BigDecimal(360);
    private String GUIDE_LINE_ERROR_MSG = "对应财报不存在";

    public Object calculateGuideLine(String stockId, String reportDate) {
        CalculationGuideLine cg = new CalculationGuideLine();
        Profit p = new Profit();
        Assets a = new Assets();
        CashFlow c = new CashFlow();
        p = profitMapper.selectByStockIdAndReportDate(stockId, reportDate);
        a = assetsMapper.selectAssetsByStockIdAndReportDate(stockId, reportDate);
        c = cashFlowMapper.selectByStockIdAndReportDate(stockId, reportDate);
        if (null == p || null == a || null == c) {
            return GUIDE_LINE_ERROR_MSG;
        }
        //设置指标基本内容
        cg.setStockId(p.getStockId());
        cg.setReportType(p.getReportType());
        cg.setReportDate(p.getReportDate());
//        净利率（%）
        cg.setNetInterestRate(MathUtils.divide(p.getNetProfit(), p.getOperatingIncome()));
//        核心利润
        cg.setCoreProfit(MathUtils.subtract(p.getOperatingIncome(),
                MathUtils.sum(p.getOperatingCost(), p.getBusinessTaxSurcharges(), p.getSalesExpense(),
                        p.getManagementFees(), p.getFinancialExpenses())));
//        核心利润率（%）
        cg.setCoreProfitMargin(MathUtils.divide(cg.getCoreProfit(), p.getOperatingIncome()));
//        毛利率（%）
        cg.setGrossMargin(MathUtils.divide(MathUtils.subtract(p.getOperatingIncome(), p.getOperatingCost()),
                p.getOperatingIncome()));
//        净资产收益率（%）待定？？？？
        cg.setRoe(MathUtils.divide(p.getProfitsToOwner(), a.getTotalEquityToParent()));
//        总资产收益率（%）
        cg.setReturnOnTotalAssets(MathUtils.divide(p.getNetProfit(), a.getTotalAssets()));
//        股息率（%）
        cg.setDividendYield(null);
//        市盈率PE
        cg.setPeRatioPe(null);
//        市净率PB
        cg.setPb(null);
//        市销率PS
        cg.setPsRatio(null);
//        市现率PCF
        cg.setPcf(null);
//        速动比率（%）
        cg.setQuickRatio(MathUtils.divide(MathUtils.subtract(a.getTotalCurrentAssets(), a.getStock()),
                a.getTotalCurrentLiabilities()));
//        流动比率（%）
        cg.setCurrentRatio(MathUtils.divide(a.getCurrentAssets(), a.getTotalCurrentLiabilities()));
//        长期债务权益比
        cg.setLongTermDebtToEquityRatio(MathUtils.divide(a.getTotalNonCurrentLiabilities(), a.getTotalEquityToParent()));
//        现金比率（%）
        cg.setCashRatio(MathUtils.divide(a.getMoneyFunds(), a.getTotalCurrentLiabilities()));
//        已获利息倍数
        cg.setEarnedInterestMultiple(MathUtils.divide(MathUtils.add(p.getTotalProfit(), p.getFinancialExpenses()),
                p.getFinancialExpenses()));
//        股东权益比率（%）
        cg.setShareholdersEquityRatio(MathUtils.divide(a.getTotalEquity(), a.getTotalAssets()));
//        负债与所有者权益比率（%）
        cg.setDebtToOwnerEquityRatio(MathUtils.divide(a.getTotalLiabilities(), a.getTotalEquity()));
//        资本固定化比率（%）
        cg.setCapitalFixedRatio(null);
//        资产负债率（%）
        cg.setAssetsAndLiabilities(MathUtils.divide(a.getTotalLiabilities(), a.getTotalAssets()));
//        应收账款周转率（%）
        cg.setAccountsReceivableTurnoverRatio(MathUtils.divide(p.getOperatingIncome(), null));
//        应收款项天数
        cg.setDaysReceivable(MathUtils.divide(ONE_YEAR, cg.getAccountsReceivableTurnoverRatio()));
//        存货周转率（%）
        cg.setInventoryTurnover(null);
//        存货天数
        cg.setInventoryDays(MathUtils.divide(ONE_YEAR, cg.getInventoryTurnover()));
//        应付账款周转率（%）
        cg.setAccountsPayableTurnoverRate(null);
//        应付账款天数
        cg.setDaysPayable(MathUtils.divide(ONE_YEAR, cg.getAccountsPayableTurnoverRate()));
//        现金周转天数
        cg.setCashTurnoverDays(null);
//        流动资产周转率（%）
        cg.setTurnoverRateOfCurrentAssets(null);
//        总资产周转率（%）
        cg.setTurnoverOfTotalAssets(null);
//        销售现金比率（%）
        cg.setSalesCashRatio(MathUtils.divide(c.getNetCashFlowFromOperatingActivities(),
                p.getTotalOperatingIncome()));
//        净利润现金含量
        cg.setNetProfitCashContent(MathUtils.divide(c.getNetCashFlowFromOperatingActivities(),
                p.getNetProfit()));
//        现金经营指数
        cg.setCashManagementIndex(null);
//        现金满足比率（%）
        cg.setCashSatisfactionRatio(null);
//        现金流量净额增长率（%）
        cg.setNetCashFlowGrowthRate(null);
//        销售费用率（%）
        cg.setSellingExpenseRatio(MathUtils.divide(p.getSalesExpense(), p.getOperatingIncome()));
//        管理费用率（%）
        cg.setManagementExpenseRatio(MathUtils.divide(p.getManagementFees(), p.getOperatingIncome()));
//        核心利润产生现金流能力
        cg.setCoreProfitGeneratingCashFlowCapability(MathUtils.divide(cg.getCoreProfit(),
                c.getNetCashFlowFromOperatingActivities()));
//        经营资产报酬率（%）
        cg.setReturnOnOperatingAssets(null);
        return cg;
    }
}
