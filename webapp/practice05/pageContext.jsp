<%--
  Created by IntelliJ IDEA.
  User: 38977
  Date: 2024/6/12
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<%
    HttpServletRequest re = (HttpServletRequest) pageContext.getRequest();
    String ip = re.getRemoteAddr();
    out.println("<h1>IP地址为：" + ip + "</h1>");
%>
</body>
</html>
