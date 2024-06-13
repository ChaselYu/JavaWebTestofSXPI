package com.sxpi.dsj2201.yxx.practice03;
//0436210140于小翔

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

//URL映射为/TestServlet3_5
@WebServlet(name = "TestServlet3_5", value = "/TestServlet3_5")
public class TestServlet3_5 extends HttpServlet {
    // 重写doGet方法，用于处理HTTP GET请求
    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        // 设置响应时的字符代码为UTF-8
        response.setCharacterEncoding("UTF-8");
        // 获取响应的打印写入器
        PrintWriter out = response.getWriter();
        // 输出"中国"
        out.println("中国" + "<br/>");
        // 输出请求的URL
        out.println("url" + request.getRequestURL() + "<br/>");
        // 输出查询字符串
        out.println("QueryString" + request.getQueryString() + "<br/>");
        // 输出参数p1的值
        out.println("parameter p1:" + request.getParameter("p1") + "<br/>");
    }

    // 重写doPost方法调用doGet方法
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
