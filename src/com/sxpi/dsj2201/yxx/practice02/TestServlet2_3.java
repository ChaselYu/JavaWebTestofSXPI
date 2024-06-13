package com.sxpi.dsj2201.yxx.practice02;
//0436210140于小翔
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.Properties;

@WebServlet(name = "TestServlet2_3", value = "/TestServlet2_3")
public class TestServlet2_3 extends HttpServlet {
    //doGet方法
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //设置响应的MIME类型
        ServletContext context = this.getServletContext();
        //获取ServletContext对象
        PrintWriter out = response.getWriter();
        //获取输出流
        InputStream in = context
                .getResourceAsStream("/WEB-INF/classes/itcast.properties");
        //获取资源文件
        Properties pros = new Properties();
        pros.load(in);
        out.println("班级: " + pros.getProperty("class")+"<br/>");
        out.println("姓名: " + pros.getProperty("name")+"<br/>");
        out.println("学号: " + pros.getProperty("stuId")+"<br/>");
    }
    //doPost方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
        this.doGet(request, response);
        //调用doGet方法
    }
}
