package com.geekbank.stage1.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author chenjun
 * @description myServlet
 * @date 2021/7/7 14:44
 */
public class MyServlet extends HttpServlet {

    private String message = "";

    @Override
    public void init() throws ServletException {
        message = "my first servlet";
    }

    @Override
    public void destroy() {
        System.out.println("myServlet destroy");
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/myJsp.jsp");
        requestDispatcher.forward(req,resp);
    }
}
