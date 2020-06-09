<template>
    <div>
        <el-container>
            <el-header class="homeHeader">
                <div class="title">公司列表</div>
            </el-header>
            <el-container>
                <ul class="icon-list">
                    <v-profitLi v-for="profit in profits" v-bind:pprofit="profit">123</v-profitLi>
                    <li @mouseover="getStockList()">加载更多</li>
                </ul>
            </el-container>
        </el-container>
    </div>
</template>

<script>
    import ProfitLi from "../components/home/ProfitLi"

    export default {
        name: "Home",
        data() {
            return {
                currentPage: 1,
                pageSize: 10,
                profits: [],
                // user: JSON.parse(window.sessionStorage.getItem("user"))
            }
        },
        computed: {},
        methods: {
            goChat() {
            },
            commandHandler(cmd) {

            },
            getStockList() {
                let param = {
                    page: this.currentPage,
                    pageSize: this.pageSize
                };
                this.getRequest("/stock/getStockList", param).then(resp => {
                    this.profits.push(...resp.records);
                    this.currentPage++;
                })
            }
        },
        components: {
            'v-profitLi': ProfitLi
        },
        mounted() {
            this.$nextTick(function () {
                this.getStockList();
                console.log("123mounted")
            })
        }
    }
</script>

<style>
    .homeRouterView {
        margin-top: 10px;
    }

    .homeWelcome {
        text-align: center;
        font-size: 30px;
        font-family: 华文行楷;
        color: #409eff;
        padding-top: 50px;
    }

    .homeHeader {
        background-color: #409eff;
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 0px 15px;
        box-sizing: border-box;
    }

    .homeHeader .title {
        font-size: 30px;
        font-family: 华文行楷;
        color: #ffffff
    }

    .homeHeader .userInfo {
        cursor: pointer;
    }

    .el-dropdown-link img {
        width: 48px;
        height: 48px;
        border-radius: 24px;
        margin-left: 8px;
    }

    .el-dropdown-link {
        display: flex;
        align-items: center;
    }

    .icon-list {
        display: block;
        font-size: 32px;
        margin-bottom: 15px;
        color: #606266;
        transition: color .15s linear;
    }

    .icon-list li i {
        display: block;
        font-size: 32px;
        margin-bottom: 15px;
        color: #606266;
        transition: color .15s linear;
    }

    .icon-list li .icon-name {
        display: inline-block;
        padding: 0 3px;
        height: 1em;
    }

    .icon-list li {
        float: left;
        width: 150px;
        text-align: center;
        height: 120px;
        line-height: 120px;
        color: #666;
        font-size: 13px;
        border-right: 1px solid #eee;
        border-bottom: 1px solid #eee;
        margin-right: -1px;
        margin-bottom: -1px;
        list-style-type: none;
    }
</style>