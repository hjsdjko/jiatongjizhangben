const base = {
    get() {
        return {
            url : "http://localhost:8080/jiatongjizhangben/",
            name: "jiatongjizhangben",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jiatongjizhangben/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家庭记账本"
        } 
    }
}
export default base
