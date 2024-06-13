package com.sxpi.dsj2201.yxx.practice04;
//0436210140于小翔
import com.sxpi.dsj2201.yxx.practice04.BookData.Book;
import com.sxpi.dsj2201.yxx.practice04.BookData.BookDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// 声明一个PurchaseServlet类，并使用@WebServlet注解设置其URL映射为/PurchaseServlet
@WebServlet(name = "PurchaseServlet", value = "/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 重写doGet方法，用于处理HTTP GET请求
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的内容类型为text/html;charset=UTF-8
        response.setContentType("text/html;charset=UTF-8");
        // 获取请求参数id
        String id = request.getParameter("id");
        // 如果id为null，则重定向到ListBookServlet
        if (id == null){
            String url = "/0436210140/ListBookServlet";
            response.sendRedirect(url);
            return;
        }
        // 根据id获取Book对象
        Book book = BookDB.getById(id);
        // 获取当前会话
        HttpSession session = request.getSession();
        // 获取名为cart的属性，如果为null，则创建一个新的ArrayList并将其设置为会话属性
        List<Book> cart = (List)session.getAttribute("cart");
        if (cart == null){
            cart = new ArrayList<Book>();
            session.setAttribute("cart", cart);
        }
        // 将Book对象添加到cart中
        cart.add(book);
        // 创建一个名为JSESSIONID的Cookie，其值为当前会话的ID，并将该Cookie添加到响应中
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setMaxAge(30 * 60);
        response.addCookie(cookie);
        // 重定向到CartServlet
        String url = "/0436210140/CartServlet";
        response.sendRedirect(url);
    }

    // 重写doPost方法调用doGet方法
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
