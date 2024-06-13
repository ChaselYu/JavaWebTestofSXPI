package com.sxpi.dsj2201.yxx.practice03;
//0436210140于小翔

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//URL映射为/TestServlet3_1
@WebServlet(name = "TestServlet3_1", value = "/TestServlet3_1")
public class TestServlet3_1 extends HttpServlet {
    // 重写doGet方法，用于处理HTTP GET请求
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的字符编码为UTF-8
        //response.setCharacterEncoding("Utf-8");
        // 设置响应的内容类型为text/html;charset=UTF-8
        response.setContentType("text/html;charset=UTF-8");
        // 获取响应的打印写入器
        PrintWriter out = response.getWriter();

        // 获取请求参数username和password
        String name = request.getParameter("username");
        String password = request.getParameter("password");

        // 输出用户名和密码
        out.print("用户名：" + name + "<br>");
        out.print("密码：" + password + "<br>");

        // 获取名为hobby的值
        String[] hobbies = request.getParameterValues("hobby");
        // 输出爱好
        out.println("爱好：");
        for (String hobby : hobbies) {
            out.println(hobby);
        }
    }
    // 重写doPost方法调用doGet方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
