package com.ps.tutorial.sj.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Hello extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "hello");
        req.setAttribute("servletParam1", getServletConfig().getInitParameter("servlet-param1"));
        req.setAttribute("contextParam2", getServletContext().getInitParameter("context-param2"));
        getServletContext().getRequestDispatcher("/hello.jspx").forward(req, resp);
    }

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
