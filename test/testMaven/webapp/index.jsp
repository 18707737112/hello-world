<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.iotek.model.Position" %>
<%@ page import="com.iotek.model.Recruit" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 11929
  Date: 2019/8/20
  Time: 10:52
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
    <title>招聘网首页</title>
</head>
<body>
<%
    List<Recruit> recruitList = (List<Recruit>) session.getAttribute("recruitList");
    if (recruitList==null || recruitList.size()==0){
%>
<script>
    window.location.href='index?str=first';
</script>
<%
    }else {
        pageContext.setAttribute("r",recruitList);
        System.out.println(recruitList.toString());
    }
%>
<div>
    <a href="index?str=loginC">游客登陆</a>
    <br/>
    <a href="index?str=registerC">游客注册</a>
    <br/>
    <a href="index?str=loginA">管理员登陆</a>
    <br/>
    <a href="index?str=loginE">员工登陆</a>

    <hr/>
</div>
<div>
    <div><h1>人才招聘网站</h1></div>
    <hr/>
    <hr/>
    <div>
        <c:if test="${r==null||r.size()==0}">
            <c:out value="空空如也"/>
        </c:if>
        <c:if test="${r!=null&&r.size()!=0}">
            <table border="1px solid black">
                <tr>
                    <td>主题：职位名称</td>
                    <td>职位描述</td>
                    <td>发布时间</td>
                    <td>地址</td>
                    <td>薪资</td>
                    <td>联系人</td>
                    <td>投递简历</td>
                </tr>
                <c:forEach items="${r}" var="i" begin="0">
                    <c:if test="${i.rct_is_publish==1}">
                        <tr>
                            <td>${i.rct_title}</td>
                            <td>${i.rct_introducation}</td>
                            <td>${i.rct_publish_time}</td>
                            <td>${i.rct_address}</td>
                            <td>${i.rct_salary}</td>
                            <td>
                                <c:out value="空空如也"/>
                            </td>
                            <td>
                                <form method="post" action="">
                                    <input type="submit" value="投递简历">
                                </form>
                            </td>
                        </tr>
                    </c:if>
                </c:forEach>
            </table>
        </c:if>
    </div>
</div>
</body>
</html>
