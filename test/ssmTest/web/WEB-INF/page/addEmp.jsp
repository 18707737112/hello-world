<%@ page import="java.util.List" %>
<%@ page import="com.iotek.model.Depart" %><%--
  Created by IntelliJ IDEA.
  User: 午月
  Date: 2019/8/20
  Time: 15:07
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
<%
    List<Depart> departList = (List<Depart>) session.getAttribute("dList");
    for (Depart depart : departList) {
%>

    <span>ID:【<%=depart.getId()%>】</span>
    <span>Name:【<%=depart.getDname()%>】</span>
    <br/>
<%
    }
%>
<form method="post" action="addEmp">
    <input name="name"><br/>
    <input name="pass"><br/>
    <input name="age"><br/>
    <input name="money"><br/>
    <input name="number"><br/>
    <input type="submit" value="添加">
</form>
</body>
</html>

