import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        logined: false,
        user: null
    },
    getters: {
        logined(state) {
            return state.logined
        },
        user(state) {
            return state.user
        }
    },
    mutations: {
        setLogined(state, value) {
            state.logined = value
        },
        setUser(state, user) {
            state.user = user
        }
    },
    actions: {}
});
