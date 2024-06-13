package com.sxpi.dsj2201.yxx.practice04;
//0436210140于小翔

import com.sxpi.dsj2201.yxx.practice04.BookData.Book;
import com.sxpi.dsj2201.yxx.practice04.BookData.BookDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

// 声明一个ListBookServlet类，并使用@WebServlet注解设置其URL映射为/ListBookServlet
@WebServlet(name = "ListBookServlet", value = "/ListBookServlet")
public class ListBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 重写doGet方法，用于处理HTTP GET请求
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的内容类型为text/html,charset=utf-8
        response.setContentType("text/html,charset=utf-8");
        // 设置响应的字符编码为GBK
        response.setCharacterEncoding("GBK");
        // 设置响应的URL编码为UTF-8
        response.encodeURL("UTF-8");
        // 获取响应的打印写入器
        PrintWriter out = response.getWriter();
        // 获取所有图书
        Collection<Book> books = BookDB.getAll();
        // 输出所有图书
        out.write("本站提供的所有图书有：<br>");
        for (Book book : books) {
            // 为每本图书创建一个购买链接
            String url = "/0436210140/PurchaseServlet?id=" + book.getId();
            out.write(book.getName() + "<a href= '" + url + "'>点击购买</a><br>");
        }
    }
}
