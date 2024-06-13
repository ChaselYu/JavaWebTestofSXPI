package com.sxpi.dsj2201.yxx.practice03;
//0436210140于小翔

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//URL映射为/TestServlet3_3
@WebServlet(name = "TestServlet3_3", value = "/TestServlet3_3")
public class TestServlet3_3 extends HttpServlet {
    // 重写doGet方法，用于处理HTTP GET请求
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的内容类型为text/html;charset=utf-8
        response.setContentType("text/html;charset=utf-8");
        // 获取响应的打印写入器
        PrintWriter out = response.getWriter();
        // 获取名为name的属性
        String name = (String) request.getAttribute("name");
        // 如果属性不为空，则输出姓名
        if (name != null) {
            out.println("姓名：" + name + "<br>");
        }
    }

    // 重写doPost方法调用doGet方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
