package ru.boldyrev_ma.storeexample.management;

import ru.boldyrev_ma.storeexample.dao.ProductDAO;
import ru.boldyrev_ma.storeexample.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ViewScoped
@ManagedBean
public class ProductsManagerCDI {
    @Inject
    private ProductDAO productDAO;

    public List<Product> getProductList() {
        return productDAO.getProducts();
    }

    public void removeProduct(Product product) {
        productDAO.removeProduct(product);
    }

    public void addProduct() {
        productDAO.addProduct(new Product(777,"Новый"));
    }
}
