<%--
  Created by IntelliJ IDEA.
  User: muyan
  Date: 2023/4/11
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="<%=request.getContextPath()%>"></c:set>
<html>
<head>
    <title>三级联动</title>
    <script src="${ctx}/js/jquery.min.js"></script>
    <script>
        window.onload = function () {
            check(-1, "province");
        }
        function check(value, elementId) {
            var element = document.getElementById(elementId);
            //发送异步请求拿数据
            $.ajax({
                url: "${ctx}/sysRegion.do",
                type: "get",
                data: {
                    parentId: value
                },
                success: function (resp) {
                    var parse = JSON.parse(resp);
                    if (parse.code == 200) {
                        //数据就拿到了
                        //创建option元素
                        let addressList = parse.data;
                        //把原有的市下拉框里的内容清掉
                        document.getElementById(elementId).innerHTML = "<option>请选择</option>";
                        if (elementId=="city"){
                            document.getElementById("area").innerHTML = "<option>请选择</option>";
                        }
                        for (let i = 0; i < addressList.length; i++) {
                            var optionElement = document.createElement("option");
                            optionElement.value = addressList[i].id;
                            optionElement.innerText = addressList[i].name;
                            element.appendChild(optionElement);
                        }
                    } else {
                        //输出 服务器返回的错误信息
                        alert(parse.message)
                    }
                },
                error: function () {
                    alert("网络通讯异常!请稍后再试")
                }
            })
        }
    </script>
</head>
<body>
省：<select id="province" onchange="check(this.value,'city')">
    <option>请选择</option>
</select>
市：<select id="city" onchange="check(this.value,'area')"></select>
区/县:<select id="area"></select>
</body>
</html>

