<%--
  Created by IntelliJ IDEA.
  ����: ��С��
  ѧ�ţ�0436210140
  Date: 2024/6/12
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>�û�ע��</title>
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
<!-- ����һ��form�����ύ��ControllerServlet -->
<form action="${pageContext.request.contextPath}/ControllerServlet" method="post">
    <h3>�û�ע��</h3>
    <div id="outer">
        <!-- ��������� -->
        <div>
            <div class="ch">������</div>
            <div class="ip">
                <input type="text" name="name"
                       value="${formBean.name}"/>
                <span>${formBean.errors.name}${DBMes}</span>
            </div>
        </div>
        <!-- ��������� -->
        <div>
            <div class="ch">���룺</div>
            <div class="ip">
                <input type="text" name="password">
                <span>${formBean.errors.password}</span>
            </div>
        </div>
        <!-- ȷ����������� -->
        <div>
            <div class="ch">ȷ�����룺</div>
            <div class="ip">
                <input type="text" name="password2">
                <span>${formBean.errors.password2}</span>
            </div>
        </div>
        <!-- ��������� -->
        <div>
            <div class="ch">���䣺</div>
            <div class="ip">
                <input type="text" name="email">
                <span>${formBean.errors.email}</span>
            </div>
        </div>
        <!-- ע�ᰴť -->
        <div id="bt">
            <input type="reset" value="����"/>
            <input type="submit" value="ע��"/>
        </div>
    </div>
</form>
</body>
</html>
