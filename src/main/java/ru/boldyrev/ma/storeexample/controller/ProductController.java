package ru.boldyrev.ma.storeexample.controller;

import ru.boldyrev.ma.storeexample.dao.ProductDAO;
import ru.boldyrev.ma.storeexample.entity.Product;
import ru.boldyrev.ma.storeexample.interceptor.InterceptorLogger;

import javax.annotation.PostConstruct;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;

@Named
@ApplicationScoped
@Interceptors({InterceptorLogger.class})
public class ProductController extends AbstractController {

    private final Long id = Long.valueOf(getParamString("id"));

    @Inject
    private ProductDAO productDAO;

    private Product product;

    @PostConstruct
    private void init() {
        product = productDAO.getProductById(id);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void save() {
        productDAO.changeProduct(product);
    }
}
