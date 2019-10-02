<%--
  Created by IntelliJ IDEA.
  User: lpy
  Date: 2019/9/28
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转账</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <%--<script src="https://unpkg.com/axios/dist/axios.min.js"></script>--%>

</head>
<script>
    function button1(){
        alert("1111111");
        $.ajax({
            url:"${pageContext.request.contextPath}/account/tranferA",
            data:{"input1Money":$("#input1").val(),"id1":$("#id1").val(),"id2":$("#id2").val()},
            success:function (data) {
                if (data === 'success') {
                    alert("进入跳转");
                    location.href="${pageContext.request.contextPath}/account/accountList";
                }
                if (data === 'enough') {
                    $("#msg").text("您的余额不足,充值去吧！").css("color","red");
                }
            }

        });}
        

        function button2(){
            alert("222222");
            $.ajax({
                url:"${pageContext.request.contextPath}/account/tranferB",
                data:{"input1Money":$("#input2").val(),"id1":$("#id1").val(),"id2":$("#id2").val()},
                success:function (data) {
                    if (data === 'success') {

                        location.href="${pageContext.request.contextPath}/account/accountList";
                    }
                    if (data === 'enough') {
                        $("#msg1").text("您的余额不足,充值去吧！").css("color","red");
                    }
                }

            });

        }


</script>
<body style="background-color: #3e8f3e">
<br>
<br>
<br>
<br>
<br>
<br>
<center>
<div class="container">
    <div class="row">
        <div class="col-md-2"></div>

        <div class="col-md-4">
           <h3> <span id = "name1">姓名:${account1.name}&nbsp;&nbsp;</span>
            <span id = "money1">账户金额:${account1.money}</span></h3><Br>
            <input type="hidden" id="id1" value="${account1.id}">
            <input type="text" class="form-control" id="input1" name="input1" placeholder="请输入要转账的金额">
           <br> <span id = "msg"></span>
            <br>
            <button type="submit" id = "button1" class="btn btn-primary" onclick="button1()">转账</button>
        </div>

        <div class="col-md-4">
            <h3><span id = "name2">姓名:${account2.name}&nbsp;&nbsp;</span>
            <span id = "money2">账户金额:${account2.money}</span></h3><br>
            <input type="hidden" id="id2" value="${account2.id}">
            <input type="text" class="form-control" id="input2" name="input2" placeholder="请输入要转账的金额">
<br>        <span id = "msg1"></span>
            <br>
            <button type="button" id = "button2" class="btn btn-primary" onclick="button2()">转账</button>
        </div>


        <div class="col-md-2"></div>
</center>
<form>
</form>
    </div>
</div>
</body>
</html>
