<%--
  Created by IntelliJ IDEA.
  姓名: 于小翔
  学号：0436210140
  Date: 2024/6/12
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <style type="text/css">
        h3 {
            margin-left: 100px;
        }
        #outer {
            width: 750px;
        }
        span{
            color: #ff0000
        }
        div{
            height: 20px;
            margin-bottom: 10px;
        }
        .ch{
            width:80px;
            text-align: right;
            float: left;
        }
        .ip{
            width: 500px;
            float: left;
        }
        .ip>input{
            margin-right: 20px;
        }
        #bt {
            margin-right: 50px;
        }
        #bt > input{
            margin-right: 20px;
        }
    </style>
</head>
<body>
<!-- 创建一个form表单，提交到ControllerServlet -->
<form action="${pageContext.request.contextPath}/ControllerServlet" method="post">
    <h3>用户注册</h3>
    <div id="outer">
        <!-- 姓名输入框 -->
        <div>
            <div class="ch">姓名：</div>
            <div class="ip">
                <input type="text" name="name"
                       value="${formBean.name}"/>
                <span>${formBean.errors.name}${DBMes}</span>
            </div>
        </div>
        <!-- 密码输入框 -->
        <div>
            <div class="ch">密码：</div>
            <div class="ip">
                <input type="text" name="password">
                <span>${formBean.errors.password}</span>
            </div>
        </div>
        <!-- 确认密码输入框 -->
        <div>
            <div class="ch">确认密码：</div>
            <div class="ip">
                <input type="text" name="password2">
                <span>${formBean.errors.password2}</span>
            </div>
        </div>
        <!-- 邮箱输入框 -->
        <div>
            <div class="ch">邮箱：</div>
            <div class="ip">
                <input type="text" name="email">
                <span>${formBean.errors.email}</span>
            </div>
        </div>
        <!-- 注册按钮 -->
        <div id="bt">
            <input type="reset" value="重置"/>
            <input type="submit" value="注册"/>
        </div>
    </div>
</form>
</body>
</html>
