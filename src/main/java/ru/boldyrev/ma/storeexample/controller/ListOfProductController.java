package ru.boldyrev.ma.storeexample.controller;

import ru.boldyrev.ma.storeexample.dao.ProductDAO;
import ru.boldyrev.ma.storeexample.interceptor.InterceptorLogger;
import ru.boldyrev.ma.storeexample.entity.Product;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.List;

@Named
@ApplicationScoped
@Interceptors({InterceptorLogger.class})
public class ListOfProductController {
    @Inject
    private ProductDAO productDAO;

    public List<Product> getProductList() {
        return productDAO.getProducts();
    }

    public void removeProduct(Product product) {
        productDAO.removeProduct(product.getId());
    }

    public void addProduct() {
        productDAO.addProduct(new Product());
    }
}
