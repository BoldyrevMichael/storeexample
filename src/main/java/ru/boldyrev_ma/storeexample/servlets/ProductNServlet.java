package ru.boldyrev_ma.storeexample.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductNServlet", urlPatterns = {"/goods/*"})
public class ProductNServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().endsWith(".jpg")) {
            req.getRequestDispatcher("../../").forward(req, resp);
        } else {
            String attr = req.getRequestURI().substring(req.getRequestURI().indexOf("/goods/") + 7);
            req.setAttribute("idProduct", attr);
            req.getRequestDispatcher("../../productn.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
