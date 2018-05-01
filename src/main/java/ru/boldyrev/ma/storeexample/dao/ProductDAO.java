package ru.boldyrev.ma.storeexample.dao;


import ru.boldyrev.ma.storeexample.entity.Product;
import ru.boldyrev.ma.storeexample.interceptor.InterceptorLogger;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.ArrayList;
import java.util.List;

@Named
@Stateless
@Interceptors({InterceptorLogger.class})
public class ProductDAO extends AbstractDAO {

    public List<Product> getProducts() {
        return new ArrayList<>(em.createQuery("SELECT e FROM Product e", Product.class).getResultList());
    }

    public List<Product> getProductsByCategoryId(Long categoryId) {
        if (categoryId != null) {
            return em.createQuery("SELECT e FROM Product e WHERE e.category.id = :categoryId", Product.class)
                    .setParameter("categoryId", categoryId).getResultList();
        }
        return getProducts();
    }

    public Product getProductById(Long id) {
        return em.find(Product.class, id);
    }

    public Product getProductByName(String name) {
        return em.find(Product.class, name);
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

    public String getImgNameSmall(Product product) {
        if (product != null) {
            return "small-" + product.getName().trim().replace(" ", "-").concat(".jpg");
        }
        return "small-imgName";
    }
}
