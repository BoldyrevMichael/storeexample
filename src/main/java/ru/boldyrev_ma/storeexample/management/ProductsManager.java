package ru.boldyrev_ma.storeexample.management;

import ru.boldyrev_ma.storeexample.dao.ProductDAO;
import ru.boldyrev_ma.storeexample.entity.Product;
import ru.boldyrev_ma.storeexample.interceptors.Logger;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.List;

@Named
@ApplicationScoped
public class ProductsManager {
    @Inject
    private ProductDAO productDAO;

    @Interceptors({Logger.class})
    public List<Product> getProductList() {
        return productDAO.getProducts();
    }

    @Interceptors({Logger.class})
    public void removeProduct(Product product) {
        productDAO.removeProduct(product.getId());
    }

    @Interceptors({Logger.class})
    public void addProduct() {
        productDAO.addProduct(new Product());
    }
}
