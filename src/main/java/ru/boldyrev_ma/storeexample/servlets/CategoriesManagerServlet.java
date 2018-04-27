package ru.boldyrev_ma.storeexample.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CategoriesManagerServlet", urlPatterns = {"/categoriesManager"})
public class CategoriesManagerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("type","categoriesManager");
        req.getRequestDispatcher("categoriesManager.xhtml").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("type","categoriesManager");
        req.getRequestDispatcher("categoriesManager.xhtml").forward(req, resp);
    }
}