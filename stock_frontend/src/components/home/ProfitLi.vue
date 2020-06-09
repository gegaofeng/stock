<template>
    <li>
        <router-link  :to="{ name: 'Profit', params: {stockId: pprofit.code,stockName:pprofit.name}}">
            {{pprofit.name}}
        </router-link>
    </li>
</template>
<script>
    export default {
        name:"ProfitLi",
        props:['pprofit'],
        data(){
            return{

            }
        }
    }
</script>