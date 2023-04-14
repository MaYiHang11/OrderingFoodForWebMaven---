function aaa(){
    console.log(111)
}

cancelOrder=()=>{

}
function  takeOrders(orderId){
    //订单id

    //发送异步请求
    $.ajax({
        url:"/OrderingFoodForWeb/takeOrder.do",//请求地址,
        type:"post",//请求方式
        data:{
            orderId:orderId
        },//请求参数
        success:function (resp){
            //c成功回调
            console.log(orderId);
            let  res =JSON.parse(resp);
            if (res.code === 200) {
                // 页面刷新
                location.reload();
            }else {
                alert(res.message)
            }

        },
        error:function (){
            //失败回调
            alert("服务器异常")
        }
    })



}