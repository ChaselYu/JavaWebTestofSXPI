<%--
  Created by IntelliJ IDEA.
  User: 38977
  Date: 2024/6/12
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page errorPage="execp.jsp" %>
<%
    String strprice = request.getParameter("price");
    double price = Double.parseDouble(strprice);
    out.println("Total price = "+price * 3);
%>
