import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Profit from './views/Profit'

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/',
            name: 'Home',
            component: Home,
            hidden: true
        },
        {
            path:'/profit',
            name:'Profit',
            component:Profit,
            hidden:true
        },
        {
            path: '/home',
            name: 'Home',
            component: Home,
            hidden: true,
        }, {
            path: '*',
            redirect: '/'
        }
    ],
    // mode:'history'
})