<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/14
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
</head>
<body>
<script src="js/jquery-3.1.0.js"></script>
<form action="register" method="post">
    账号<input id="name" type="text" name="tName" required onblur="name"><br>
    <span id="name_span"></span>
    密码<input id="pass" type="text" name="tPass" required><br>
    <span id="pass_span"></span>
    <input type="submit" value="注册">
</form>
</body>
</html>