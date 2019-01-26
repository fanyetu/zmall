import Vue from 'vue';
import Router from 'vue-router';
import paths from './paths';
import NProgress from 'nprogress';
import 'nprogress/nprogress.css';
import store from '../store'

Vue.use(Router);
const router = new Router({
    base: '/',
    mode: 'hash',
    linkActiveClass: 'active',
    routes: paths
});
// router gards
router.beforeEach((to, from, next) => {
    NProgress.start();
    next();
});

router.beforeEach((to, from, next) => {
    // 如果没有登录，就跳转到登录界面
    if (!store.getters.logined && to.path !== '/login') {
        next('/login')
        return
    }
    next()
})

router.afterEach((to, from) => {
    NProgress.done();
});

export default router;
