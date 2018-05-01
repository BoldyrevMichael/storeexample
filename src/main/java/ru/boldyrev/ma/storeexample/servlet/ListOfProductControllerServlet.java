package ru.boldyrev.ma.storeexample.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ListOfProductControllerServlet", urlPatterns = {"/list-of-product-controller"})
public class ListOfProductControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("type","listOfProductController");
        req.getRequestDispatcher("listOfProductController.xhtml").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("type","listOfProductController");
        req.getRequestDispatcher("listOfProductController.xhtml").forward(req, resp);
    }
}
