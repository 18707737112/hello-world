<%@ page import="java.util.List" %>
<%@ page import="com.iotek.model.Comment" %><%--
  Created by IntelliJ IDEA.
  User: 午月
  Date: 2019/8/19
  Time: 22:17
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
    <title>主页</title>

</head>
<body>
<div>
    <div><h1>学员交流论坛</h1></div>
    <div>欢迎【${user.name}】</div>
    <%
        List<Comment> commentList = (List<Comment>) request.getAttribute("commentAllList");
        Integer c = null;
        Comment comment = null;
        if (commentList!=null){
            c=commentList.size();
            if (commentList.size()!=0){
                comment = commentList.get(0);
            }
        }
    %>
    <span><%=c%></span>
    <span><%=comment.toString()%></span>
    <div>
        <hr>
        <div>
            <h3>发帖人：</h3>
        </div>
        <div>
            <h3>标题：</h3>
        </div>
        <hr>
    </div>
</div>
</body>
</html>
