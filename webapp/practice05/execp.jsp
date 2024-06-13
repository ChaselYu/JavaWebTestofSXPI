<%--
  Created by IntelliJ IDEA.
  User: 38977
  Date: 2024/6/12
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<%
    out.println("exception.toString:");
    out.println("<br>");
    out.println(exception.toString());
    out.println("<p>");
    out.println("exception.getMessage:");
    out.println("<br>");
    out.println(exception.getMessage());
%>
