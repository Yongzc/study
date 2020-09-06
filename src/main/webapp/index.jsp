<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/8/25
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jquery.min.js"></script>
<script>
    $(function () {
        $("#btn1").click(function () {
            $.ajax({
                type: "post",
                url: "/user/findAll",
                data: "",
                contentType: "application/json;charset=utf-8",
                success: function (data) {
                    console.log(data)
                },
                dataType: "json"
            })
        })
        var user = {"username":"zs","password":"123","sex":"男","birthday":"1999/01/01"}
        $("#btn2").click(function () {
            $.ajax({
                type: "post",
                url: "/user/addUser",
                data: "{\"username\":\"zs\",\"password\":\"123\",\"sex\":\"男\",\"birthday\":\"1999/01/01\"}",
                contentType: "application/json;charset=utf-8",
                success: function (data) {
                    console.log(data)
                },
                dataType: "json"
            })
        })
    })
</script>
<body>
<button id="btn1">查询</button>
<button id="btn2">添加</button>
</body>
</html>
