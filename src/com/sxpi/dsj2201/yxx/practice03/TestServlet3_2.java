package com.sxpi.dsj2201.yxx.practice03;
//0436220140于小翔

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//URL映射为/TestServlet3_2
@WebServlet(name = "TestServlet3_2", value = "/TestServlet3_2")
public class TestServlet3_2 extends HttpServlet {
    // 重写doGet方法，用于处理HTTP GET请求
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的内容类型为text/html;charset=utf-8
        response.setContentType("text/html;charset=utf-8");
        // 将数据储存在request对象中
        request.setAttribute("name", "于小翔");
        // 获取请求分发器
        RequestDispatcher dispatcher = request.getRequestDispatcher("/TestServlet3_3");
        // 使用请求分发器的forward方法转发请求
        dispatcher.forward(request, response);
    }

    // 重写doPost方法调用doGet方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
