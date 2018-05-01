package ru.boldyrev.ma.storeexample.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterUTF8", urlPatterns = {"/*"})
public class FilterUTF8 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //if(request.getAttribute("type")!=null&&request.getAttribute("type").equals("exampleMB")){return;}
        if ((request.getAttribute("type") != null) &&
                (request.getAttribute("type").equals("productController") ||
                 request.getAttribute("type").equals("listOfProductController") ||
                 request.getAttribute("type").equals("categoryController") ||
                 request.getAttribute("type").equals("listOfCategoryController"))) {
            return;
        }

        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
