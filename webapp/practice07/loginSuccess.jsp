<%--
  Created by IntelliJ IDEA.
  ����: ��С��
  ѧ�ţ�0436210140
  Date: 2024/6/13
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java"
         import="com.sxpi.dsj2201.yxx.practice07.domain.UserBean"
%>
<html>
<head>
    <title>��½�ɹ�</title>
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
<!-- ���session��û��userBean�����ض���register.jspҳ�� -->
<%
    if (session.getAttribute("userBean")==null){
%>
<jsp:forward page="register.jsp"/>
<%
        return;
    }
%>
<!-- ʹ��useBean��ȡsession�е�userBean -->
<jsp:useBean id="userBean"
             class="com.sxpi.dsj2201.yxx.practice07.domain.UserBean"
             scope="session"/>
<!-- �����ӭ��Ϣ -->
<div id="welcome">��ϲ�㣡��½�ɹ�</div>
<!-- ����ָ��� -->
<hr />
<!-- ����û���Ϣ -->
<div>������Ϣ</div>
<div>
    <ul>
        <!-- ����û����� -->
        <li>����������${userBean.name}</li>
        <!-- ����û����� -->
        <li>�������䣺${userBean.email}</li>
    </ul>
</div>
</body>
</html>
