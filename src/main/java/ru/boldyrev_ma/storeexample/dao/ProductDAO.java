package ru.boldyrev_ma.storeexample.dao;


import ru.boldyrev_ma.storeexample.entity.Product;

import javax.ejb.Stateless;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@Stateless
public class ProductDAO extends AbstractDAO {

    public List<Product> getProducts() {
        return new ArrayList<>(em.createQuery("SELECT e FROM Product e", Product.class).getResultList());
    }

    public Product getProductById(Long id) {
        return em.find(Product.class, id);
    }

    public void addProduct(Product product) {
        if (product != null) {
            em.persist(product);
        }
    }

    public void changeProduct(Product product) {
        if (product != null) {
            em.merge(product);
        }
    }

    public void removeProduct(Product product) {
        em.remove(product);
    }

    public void removeProduct(Long id) {
        if (id != null) {
            Product product = em.find(Product.class, id);
            em.remove(product);
        }
    }

    public String getImgName(Product product) {
        if (product != null) {
            return product.getName().trim().replace(" ", "-").concat(".jpg");
        }
        return "imgName";
    }

    public String getSmallImgName(Product product) {
        if (product != null) {
            return "small-" + product.getName().trim().replace(" ", "-").concat(".jpg");
        }
        return "small-imgName";
    }
}
