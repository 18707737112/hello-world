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
        账号：<input type="text" name="name" value="${emp.name}"><br/><br/>
        密码：<input type="password" name="pass" value="${emp.pass}"><br/><br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" value="登陆">
    </form>
</fieldset>

</body>
</html>

