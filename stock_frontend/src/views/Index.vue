<template>
    <div>
        <h1>Index</h1>
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
        <div id="myChart" :style="{width: '100%', height: '300px'}">
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
                stockList: [{value: 'aaa'}],
                msg: '123',
                xAxisData: ["衬衫111", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"],
                sedata: [15, 12, 30, -20, 15, 30],
                startTime: '2010-01-01',
                endTime: new Date(),
                state: '',
                timeout: null,
                reportType:'1'
            }
        },
        methods: {
            querySearchAsync(queryString, cb) {
                // var restaurants = this.restaurants;
                console.log(this.stockName);
                this.getStockList(this.stockName);
                // var results=[{value:"a"},{value:"b"}];
                // // 调用 callback 返回建议列表的数据
                // cb(results);
                // clearTimeout(this.timeout);
                let l = this;
                // console.log(results);
                this.timeout = setTimeout(() => {
                    cb(l.stockList);
                }, 300 * Math.random());
                // }, 3000 );
                console.log("++++++++++");
                // console.log(results);
            },

            handleSelect(item) {
                this.stockCode = item.code;
                console.log(item.code);
            },
            getStockList(stockName) {
                var param = {
                    'name': stockName
                };
                console.log("request");
                console.log(stockName);
                this.getRequest('/stock/getstocklistbyname', param).then(resp => {
                    if (resp) {
                        this.stockList = [];
                        for (var i = 0; i < resp.length; i++) {
                            this.stockList.push({value: resp[i].name, code: resp[i].code});
                        }
                        // console.log(this.stockList);
                        // console.log(Array.isArray(this.stockList));
                    }
                })
            },
            initData() {
                // alert("test");
                console.log(this.startTime);
                console.log(this.endTime);
                var param = {
                    'startTime': this.startTime,
                    'endTime': this.endTime,
                    'stockId': this.stockId,
                    'reportType':this.reportType
                };
                this.getRequest('/profit/getincome', param).then(resp => {
                    if (resp) {
                        this.profitData = resp;
                        this.sedata = [];
                        this.xAxisData = [];
                        console.log(this.sedata);
                        let self = this;
                        resp.forEach(function (i) {
                            self.sedata.push(i['totalOperatingIncome']);
                            self.xAxisData.push(i['reportDate'].substr(0, 10));
                            // console.log(i['reportDate'].substr(0,10));
                            console.log('==========');
                        });
                        console.log(this.sedata);
                        this.drawLine()
                    }
                })
            },
            drawLine() {
                // 基于准备好的dom，初始化echarts实例
                console.log('123');
                let myChart = this.$echarts.init(document.getElementById('myChart'));
                // 绘制图表
                myChart.setOption({
                    title: {text: this.stockName,
                    left:'center'},
                    tooltip: {
                        symbol: true
                    },
                    xAxis: {
                        data: this.xAxisData,
                        // type: time
                        nameTextStyle: {
                            fontSize: 40,
                        },
                        // show:false
                        axisLabel: {
                            interval: 0
                        }
                    },
                    yAxis: [{name: '销售额'},
                        {
                            type: 'value',
                            name: '同比增长',
                            axisLabel: {formatter: '{value}%'}
                        }],
                    series: [{
                        name: 'A公司',
                        type: 'bar',
                        data: this.sedata,
                        smooth: true,
                        yAxisIndex: 0
                        // symbol:'none'
                    },
                        // {
                        //     name: 'B',
                        //     type: 'bar',
                        //     yAxisIndex: 0,
                        //     data: [5, 20, 36, 10, 10, 20],
                        //     smooth: true,
                        // },

                    ],
                });
            }
        },
        //调用
        mounted() {
            this.$nextTick(function () {
                console.log('123');
                this.initData();
                this.drawLine();
            })
        }


    }
</script>

<style scoped>

</style>