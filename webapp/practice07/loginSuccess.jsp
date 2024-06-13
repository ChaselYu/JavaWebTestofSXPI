<%--
  Created by IntelliJ IDEA.
  姓名: 于小翔
  学号：0436210140
  Date: 2024/6/13
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java"
         import="com.sxpi.dsj2201.yxx.practice07.domain.UserBean"
%>
<html>
<head>
    <title>登陆成功</title>
    <style type="text/css">
        #main{
            width: 500px;
            height: auto;
        }
        #main div{
            width: 200px;
            height: auto;
        }
        ul {
            padding-top: 1px;
            padding-left: 1px;
            list-style: none;
        }
    </style>
</head>
<body>
<!-- 如果session中没有userBean，则重定向到register.jsp页面 -->
<%
    if (session.getAttribute("userBean")==null){
%>
<jsp:forward page="register.jsp"/>
<%
        return;
    }
%>
<!-- 使用useBean获取session中的userBean -->
<jsp:useBean id="userBean"
             class="com.sxpi.dsj2201.yxx.practice07.domain.UserBean"
             scope="session"/>
<!-- 输出欢迎信息 -->
<div id="welcome">恭喜你！登陆成功</div>
<!-- 输出分割线 -->
<hr />
<!-- 输出用户信息 -->
<div>您的信息</div>
<div>
    <ul>
        <!-- 输出用户姓名 -->
        <li>您的姓名：${userBean.name}</li>
        <!-- 输出用户邮箱 -->
        <li>您的邮箱：${userBean.email}</li>
    </ul>
</div>
</body>
</html>
