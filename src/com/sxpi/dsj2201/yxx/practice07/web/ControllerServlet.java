package com.sxpi.dsj2201.yxx.practice07.web;
//0436210140于小翔
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sxpi.dsj2201.yxx.practice07.util.DBUtil;
import com.sxpi.dsj2201.yxx.practice07.domain.RegisterFromBean;
import com.sxpi.dsj2201.yxx.practice07.domain.UserBean;

import java.io.IOException;

// 定义一个ControllerServlet，用于处理用户注册请求
@WebServlet(name = "ControllerServlet",value = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    // doGet方法用于处理GET请求
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        // 设置响应内容类型为text/html;charset=GBK，并设置字符编码为GBK
        response.setCharacterEncoding("GBK");
        response.setHeader("Content-Type","text/html;charset=GBK");

        // 获取用户输入的注册信息

        //强制转换字符串 由于当利用request.getParameter得到Form元素的时候，默认情况的
        //字符编码为ISO-8859-1，这种编码不能正确地显示汉字
        String strName = request.getParameter("name");
        byte c[] = strName.getBytes("ISO-8859-1");
        strName = new String(c);
        String name = strName;

        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        String email = request.getParameter("email");

        // 创建RegisterFromBean对象，用于存储注册信息
        RegisterFromBean fromBean = new RegisterFromBean();
        fromBean.setUsername(name);
        fromBean.setPassword(password);
        fromBean.setPassword2(password2);
        fromBean.setEmail(email);

        // 验证注册信息
        if(!fromBean.validate()){
            // 如果注册信息不合法，将fromBean对象存入request，跳转到register.jsp页面
            request.setAttribute("formBean",fromBean);
            request.getRequestDispatcher("register.jsp")
                    .forward(request,response);
            return;
        }

        // 创建UserBean对象，用于存储注册用户信息
        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setPassword(password);
        userBean.setEmail(email);

        // 将注册用户信息插入数据库
        boolean b = DBUtil.getInstance().insertUser(userBean);

        // 判断是否插入成功
        if(!b){
            // 如果插入失败，设置错误信息，将fromBean对象存入request，跳转到register.jsp页面
            fromBean.setErrorMsg("DBMes","用户名已存在");
            request.setAttribute("formBean",fromBean);
            request.getRequestDispatcher("register.jsp")
                    .forward(request,response);
            return;
        }

        // 如果插入成功，输出注册成功信息，并将userBean对象存入session，跳转到loginSuccess.jsp页面
        response.getWriter().print("恭喜你注册成功，三秒钟后自动跳转");
        request.getSession().setAttribute("userBean",userBean);
        response.setHeader("refresh","3;url=/0436210140/practice07/loginSuccess.jsp");
    }

    // doPost方法用于处理POST请求，直接调用doGet方法
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        this.doGet(request,response);
    }
}
