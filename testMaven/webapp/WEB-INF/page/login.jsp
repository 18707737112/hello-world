<%--
  Created by IntelliJ IDEA.
  User: 午月
  Date: 2019/8/23
  Time: 16:16
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
<div>
    <form method="post" action="loginC">
        <input type="text" name="c_account">
        <br/><br/>
        <input type="password" name="c_pass">
        <br/><br/>
        <input type="submit" value="登陆">
        <a href="index?str=null">
            <input type="button" value="退出">
        </a>
    </form>
</div>
</body>
</html>

