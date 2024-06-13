<%--
  Created by IntelliJ IDEA.
  User: 38977
  Date: 2024/6/13
  Time: 7:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Title here</title>
</head>
<body>
<%
    pageContext.setAttribute("name","于小翔",pageContext.PAGE_SCOPE);
    Object name = pageContext.findAttribute("name",pageContext.PAGE_SCOPE);
    out.println("我的名字是:" + name);
%>
</body>
</html>
