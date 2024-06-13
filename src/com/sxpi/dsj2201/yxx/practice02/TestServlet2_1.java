package com.sxpi.dsj2201.yxx.practice02;
//0436210140于小翔
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "TestServlet2_1", value = "/TestServlet2_1")
public class TestServlet2_1 extends HttpServlet {
    //定义doGet方法
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
            //获取ServletContext对象
            ServletContext context = this.getServletContext();
            //通过setAttribute方法设置属性
            context.setAttribute("data", "this servlet save data");
    }
    //定义doPost方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        this.doGet(request, response);
    }
}
