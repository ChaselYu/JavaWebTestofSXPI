package com.sxpi.dsj2201.yxx.practice03;
//0436210140于小翔

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

//URL映射为/TestServlet3_4
@WebServlet(name = "TestServlet3_4", value = "/TestServlet3_4")
public class TestServlet3_4 extends HttpServlet {
    // 重写doGet方法，用于处理HTTP GET请求
    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的内容类型为text/html;charset=UTF-8
        response.setContentType("text/html;charset=UTF-8");
        // 获取响应的打印写入器
        PrintWriter out = response.getWriter();
        // 获取请求分发器
        RequestDispatcher rd = request.getRequestDispatcher("TestServlet3_5?p1=abc");
        // 输出"before TestServlet3_4"
        out.println("before TestServlet3_4" + "<br>");
        // 调用请求分发器的include方法
        rd.include(request, response);
        // 输出"after TestServlet3_4"
        out.println("after TestServlet3_4" + "<br>");
    }

    // 重写doPost方法调用doGet方法
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
