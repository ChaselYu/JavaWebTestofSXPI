package com.sxpi.dsj2201.yxx.practice02;
//0436210140于小翔
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet2_2", value = "/TestServlet2_2")
public class TestServlet2_2 extends HttpServlet {
    //定义doGet方法
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        //获取输出流
        PrintWriter out = response.getWriter();
            //获取ServletContext对象
            ServletContext context = this.getServletContext();
            //获取属性值
            String data = (String)context.getAttribute("data");
            out.println(data);//输出属性值
    }
    // 重写doPost方法调用doGet方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        this.doGet(request, response);
    }
}
