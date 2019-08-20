<%--
  Created by IntelliJ IDEA.
  User: 午月
  Date: 2019/8/19
  Time: 21:03
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
    <title>首页</title>
</head>
<body>
<fieldset>
    <legend>登陆界面</legend>
    <form method="post" action="login">
        账号：<input type="text" name="name" value="${user.name}"><br/><br/>
        密码：<input type="password" name="pass" value="${user.pass}"><br/><br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" value="登陆">
    </form>
</fieldset>

</body>
</html>

