<%@ page import="com.iotek.model.Depart" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 午月
  Date: 2019/8/20
  Time: 15:09
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
<a href="delDepart?id=<%=depart.getId()%>">删除</a>
<br/>
<%
    }
%>
</body>
</html>

