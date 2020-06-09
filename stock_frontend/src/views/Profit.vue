<template>
    <div>
        <el-header class="homeHeader">
            <div class="title">
                <router-link to="/" tag="div">
                    <i class="el-icon-s-home" style="cursor: pointer"></i>
                </router-link>
            </div>
        </el-header>
        <h1>利润详情页</h1>
        <div>
            <el-row>
                <el-col :span="3">
                    <label>股票名称</label>
                </el-col>
                <el-col :span="6">
                    <el-autocomplete
                            v-model="stockName"
                            :fetch-suggestions="querySearchAsync"
                            placeholder="请输入内容"
                            @select="handleSelect"
                    ></el-autocomplete>
                </el-col>
                <el-col :span="3">
                    <label>股票代码</label>
                </el-col>
                <el-col :span="6">
                    <el-autocomplete
                            v-model="stockId"
                            :fetch-suggestions="querySearchAsync"
                            placeholder="请输入内容"
                            @select="handleSelect"
                    ></el-autocomplete>
                </el-col>
            </el-row>
            <el-row>
            </el-row>
            <el-row>
                <el-col :span="3">
                    <label>时间范围</label>
                </el-col>
                <el-col :span="4">
                    <el-date-picker
                            v-model="startTime" type="date" placeholder="请选择开始日期"
                            value-format="yyyy-MM-dd" :style="{width: '130px'}"
                    />
                </el-col>
                <el-col :span="3">
                    <label>-------</label>
                </el-col>
                <el-col :span="4">
                    <el-date-picker
                            v-model="endTime" type="date" placeholder="请选择截至日期"
                            value-format="yyyy-MM-dd" :style="{width: '130px'}"
                    />
                </el-col>
            </el-row>
            <el-row>
                <el-col :span="3">
                    <label>报表类型</label>
                </el-col>
                <el-col :span="3">
                    <el-radio v-model="reportType" label="1">只显示年报</el-radio>
                    <el-radio v-model="reportType" label="2">显示所有</el-radio>
                </el-col>
            </el-row>
            <el-row :span="4">
                <el-button type="primary" @click="initData">确定</el-button>
            </el-row>
        </div>
        <div id="myChart" :style="{width: '100%', height: '300px',backgroundColor:'red'}">
        </div>
    </div>
</template>

<script>
    export default {
        name: "Profit",
        data() {
            return {
                stockName: '',
                stockId: '',
                stockList: [],
                msg: '123',
                xAxisData: [],
                sedata: [15, 12, 30, -20, 15, 30],
                totalProfit: [],
                netProfit: [],
                totalIncomeGrowth: [],
                totalProfitGrowth: [],
                netProfitGrowth: [],
                startTime: '2010-01-01',
                endTime: new Date(),
                state: '',
                timeout: null,
                reportType: '1',
                myChat: null,
                screenWidth: document.documentElement.clientWidth
            }
        },
        watch: {
            'screenWidth': function () {
                this.myChat.resize();
                // console.log(this.screenWidth)
            }
        },
        methods: {
            querySearchAsync(queryString, cb) {
                // var restaurants = this.restaurants;
                console.log(this.stockName);
                // let wait=this.getStockList(this.stockName);
                // // 调用 callback 返回建议列表的数据
                // cb(results);
                // clearTimeout(this.timeout);
                let l = this;
                // console.log(results);
                // if (wait){
                //     console.log(wait);
                //     console.log(l.stockList);
                //     cb(l.stockList);
                // }
                // this.timeout = setTimeout(() => {
                //     cb(l.stockList);
                // }, 300 * Math.random());
                // }, 3000 );
                // console.log("++++++++++");
                // console.log(results);
                let param = {
                    'name': this.stockName
                };
                this.getRequest('/stock/getstocklistbyname', param).then(resp => {
                    if (resp) {
                        l.stockList = [];
                        for (let i = 0; i < resp.length; i++) {
                            this.stockList.push({value: resp[i].name, code: resp[i].code});
                        }
                        cb(l.stockList);
                    }
                });
            },

            handleSelect(item) {
                this.stockId = item.code;
                // console.log(item.code);
            },
            getStockList(stockName) {
                let param = {
                    'name': stockName
                };
                this.getRequest('/stock/getstocklistbyname', param).then(resp => {
                    if (resp) {
                        this.stockList = [];
                        for (var i = 0; i < resp.length; i++) {
                            this.stockList.push({value: resp[i].name, code: resp[i].code});
                        }
                    }
                });
                return true;
            },
            initData() {
                // alert("test");
                // console.log(this.startTime);
                // console.log(this.endTime);
                var param = {
                    'startTime': this.startTime,
                    'endTime': this.endTime,
                    'stockId': this.stockId,
                    'reportType': this.reportType
                };
                this.getRequest('/profit/getincome', param).then(resp => {
                    if (resp) {
                        this.profitData = resp;
                        // 清空原有数据
                        this.sedata = [];
                        this.xAxisData = [];
                        this.totalProfit = [];
                        this.netProfit = [];
                        this.netProfitGrowth = [];
                        // console.log(this.sedata);
                        let self = this;
                        resp.forEach(function (i) {
                            let income = i['totalOperatingIncome'] / 10000;
                            let profit = i['totalProfit'] / 10000;
                            let netProfit = i['netProfit'] / 10000;
                            self.sedata.push(income.toFixed(2));
                            self.totalProfit.push(profit.toFixed(2));
                            self.netProfit.push(netProfit.toFixed(2));
                            if (self.reportType == '1') {
                                self.xAxisData.push(i['reportDate'].substr(0, 4));
                            } else {
                                let year = i['reportDate'].substr(0, 4);
                                // console.log(year)
                                let month = i['reportDate'].substr(5, 2);
                                // console.log(month);
                                switch (month) {
                                    case '01':
                                    case '02':
                                    case '03':
                                        self.xAxisData.push(year + 'Q1');
                                        break;
                                    case '04':
                                    case '05':
                                    case '06':
                                        self.xAxisData.push(year + 'Q2');
                                        break;
                                    case '07':
                                    case '08':
                                    case '09':
                                        self.xAxisData.push(year + 'Q3');
                                        break;
                                    case '10':
                                    case '11':
                                    case '12':
                                        self.xAxisData.push(year + 'Q4');
                                        break;
                                }

                            }
                            // console.log(i['reportDate'].substr(0,10));
                            // console.log('==========');
                        });
                        // console.log(this.xAxisData);
                        if (self.reportType == '1') {
                            this.totalIncomeGrowth = this.calculateYYGrowth2(this.xAxisData, this.sedata);
                            this.totalProfitGrowth = this.calculateYYGrowth2(this.xAxisData, this.totalProfit);
                            this.netProfitGrowth = this.calculateYYGrowth2(this.xAxisData, this.netProfit);
                            // this.calculateYYGrowth();
                        } else {
                            self.totalIncomeGrowth = [];
                            self.totalProfitGrowth = [];
                        }
                        this.drawLine()
                    }
                })
            },
            drawLine() {
                // 基于准备好的dom，初始化echarts实例
                // console.log('123');
                let myChart = this.myChat;

                // 绘制图表
                myChart.setOption({
                    title: {
                        text: this.stockName,
                        left: 'center',
                        show: false
                    },
                    tooltip: {
                        symbol: true
                    },
                    dataZoom: [
                        {
                            type: 'slider',
                            xAxisIndex: [0]
                        },
                        {
                            yAxisIndex: [1],
                            type: 'slider',
                        },
                        {
                            yAxisIndex: [0],
                            type: 'slider',
                            left: '01%'
                        }
                    ],

                    legend: {
                        data: [
                            {
                                name: '营业总收入'
                            },
                            {
                                name: '利润总额'
                            },
                            {
                                name: '净利润'
                            },
                            {
                                name: '营业总收入同比增长'
                            },
                            {
                                name: '总利润同比增长'
                            },
                            {
                                name: '净利润同比增长'
                            }]
                    },
                    xAxis: {
                        data: this.xAxisData,
                        type: 'category',
                        nameTextStyle: {
                            fontSize: 40,
                        },
                        // show:false
                        axisLabel: {
                            interval: 0,
                            rotate: 90
                        }
                    },
                    yAxis: [
                        {
                            name: '金额/万元'
                        },
                        {
                            type: 'value',
                            name: '同比增长',
                            axisLabel: {formatter: '{value}%'}
                        }],
                    series: [
                        {
                            name: '营业总收入',
                            type: 'bar',
                            data: this.sedata,
                            smooth: true,
                            yAxisIndex: 0,
                            // symbol:'none'
                            show: false
                        },
                        {
                            name: '利润总额',
                            type: 'bar',
                            data: this.totalProfit,
                            smooth: true,
                            yAxisIndex: 0
                            // symbol:'none'
                        },
                        {
                            name: '净利润',
                            type: 'bar',
                            data: this.netProfit,
                            smooth: true,
                            yAxisIndex: 0
                            // symbol:'none'
                        },
                        {
                            name: '营业总收入同比增长',
                            type: 'line',
                            yAxisIndex: 1,
                            data: this.totalIncomeGrowth,
                            smooth: true,
                            itemStyle: {
                                normal: {
                                    label: {
                                        show: true
                                    }
                                }
                            }
                        },
                        {
                            name: '总利润同比增长',
                            type: 'line',
                            yAxisIndex: 1,
                            data: this.totalProfitGrowth,
                            smooth: true,
                            itemStyle: {
                                normal: {
                                    label: {
                                        show: true
                                    }
                                }
                            }
                        },
                        {
                            name: '净利润同比增长',
                            type: 'line',
                            yAxisIndex: 1,
                            data: this.netProfitGrowth,
                            smooth: true,
                            itemStyle: {
                                normal: {
                                    label: {
                                        show: true
                                    }
                                }
                            }
                        },
                    ],
                });
            },
            calculateYYGrowth() {
                this.totalIncomeGrowth = [];
                this.totalIncomeGrowth.push(0);
                let _this = this;
                for (let i = 0; i < this.xAxisData.length - 1; i++) {
                    let index = i + 1;
                    let lastYear = _this.xAxisData[i].toString().substr(0, 4);
                    let year = _this.xAxisData[index].toString().substr(0, 4);
                    if (year - lastYear == 1) {
                        let growth = (_this.sedata[index] - _this.sedata[i]) / _this.sedata[i] * 100;
                        growth = growth.toFixed(2);
                        _this.totalIncomeGrowth.push(growth);
                        console.log(_this.totalIncomeGrowth);
                    }
                }
            },
            calculateYYGrowth2(year, data) {
                let growth = [];
                growth.push(0);
                // console.log(year[0]);
                for (let i = 0; i < year.length - 1; i++) {
                    let index = i + 1;
                    let lastYear = parseInt(year[i]);
                    let thisYear = parseInt(year[i + 1]);
                    // console.log(i);
                    // console.log(lastYear);
                    // console.log(thisYear);
                    // console.log("===========");
                    if (thisYear - lastYear == 1) {
                        let _growth = (data[index] - data[i]) / Math.abs(data[i]) * 100;
                        _growth = _growth.toFixed(2);
                        growth.push(_growth);
                        // console.log(growth);
                    }
                }
                return growth;
            }
        },
        //调用
        mounted() {
            var _this = this;
            this.$nextTick(function () {
                this.myChat = this.$echarts.init(document.getElementById('myChart'));
                this.stockId = this.$route.params.stockId;
                this.stockName = this.$route.params.stockName;
                // console.log('profit mounted');
                this.initData();
                this.drawLine();
            });
            window.onresize = function () {
                _this.screenWidth = document.documentElement.clientWidth;
            }
        }


    }
</script>

<style scoped>

</style>