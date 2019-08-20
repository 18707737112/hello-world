<%@ page import="java.util.List" %>
<%@ page import="com.iotek.model.Emp" %>
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
<%
    List<Emp> empList = (List<Emp>) request.getAttribute("empList");
%>
<div>
    <div><h1>OA系统</h1></div>
    <div>欢迎【${emp.name}】</div>
    <hr/>
    <%
        if (empList==null||empList.size()==0){
    %>
    <span>空空如也！！！！！！！！！！</span>
    <%
        }else {
    %>
    <table border="1px solid black">
        <tr>
            <td>ID</td>
            <td>名字</td>
            <td>年龄</td>
            <td>部门</td>
            <td>薪水</td>
        </tr>
        <%
            for (Emp emp : empList) {
        %>
        <tr>
            <td><%=emp.getId()%></td>
            <td><%=emp.getName()%></td>
            <td><%=emp.getAge()%></td>
            <td><%=emp.getDepart()%></td>
            <td><%=emp.getMoney()%></td>
        </tr>
        <%
            }
        %>
    </table>
    <%
        }
    %>
    <a href="addEmp.jsp">添加员工</a>
    <a href="delDepart.jsp">删除部门</a>
</div>
</body>
</html>
