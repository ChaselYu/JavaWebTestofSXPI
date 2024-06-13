package com.sxpi.dsj2201.yxx.practice04;
//0436210140于小翔

import com.sxpi.dsj2201.yxx.practice04.BookData.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//URL映射为/CartServlet
@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {
    // 重写doGet方法，用于处理HTTP GET请求
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的内容类型为text/html;charset=utf-8
        response.setContentType("text/html;charset=utf-8");
        // 获取响应的打印写入器
        PrintWriter out = response.getWriter();
        // 获取购物车
        List<Book> cart = null;
        // 判断是否可以购买
        boolean purFlag = true;
        // 获取会话
        HttpSession session = request.getSession(false);
        // 如果会话为空，则不能购买
        if (session == null) {
            purFlag = false;
        } else {
            // 如果会话不为空，则获取购物车
            cart = (List) session.getAttribute("cart");
            // 如果购物车为空，则不能购买
            if (cart == null) {
                purFlag = false;
            }
        }
        // 如果不能购买，则输出购物车为空
        if (!purFlag) {
            out.write("购物车为空<br>");
        } else {
            // 如果可以购买，则输出购物车内容
            out.write("购物车内容如下<br>");
            double price = 0;
            // 遍历购物车，输出每本图书的名称，并计算总价
            for (Book book : cart) {
                out.write(book.getName() + "<br>");
            }
            // 输出总价
            out.write("总价：" + price + "<br>");
        }
    }
}
