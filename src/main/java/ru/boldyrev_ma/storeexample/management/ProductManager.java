package ru.boldyrev_ma.storeexample.management;

import ru.boldyrev_ma.storeexample.dao.ProductDAO;
import ru.boldyrev_ma.storeexample.entity.Product;
import ru.boldyrev_ma.storeexample.interceptors.Logger;

import javax.annotation.PostConstruct;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;

@Named
@ApplicationScoped
public class ProductManager extends AbstractController {

    private final Long id = Long.valueOf(getParamString("id"));

    @Inject
    private ProductDAO productDAO;

    private Product product;

    @PostConstruct
    private void init() {
        product = productDAO.getProductById(id);
    }

    @Interceptors({Logger.class})
    public Product getProduct() {
        return product;
    }

    @Interceptors({Logger.class})
    public void setProduct(Product product) {
        this.product = product;
    }

    @Interceptors({Logger.class})
    public void save() {
        productDAO.changeProduct(product);
    }
}
