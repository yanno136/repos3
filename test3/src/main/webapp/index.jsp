<%--
  Created by IntelliJ IDEA.
  User: lpy
  Date: 2019/9/27
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<script>
    function transfer1(){
        alert("11111");
        $.ajax({
            url:"${pageContext.request.contextPath}/account/tranferA",
            data:{"name":"张三"},
            success:function (data) {
                if (data === '111') {

                }
            }
        });
        return false;
    }
</script>

<body>

<button type="button" value="4444" onclick="transfer1();">ooooo</button>

</body>
</html>
