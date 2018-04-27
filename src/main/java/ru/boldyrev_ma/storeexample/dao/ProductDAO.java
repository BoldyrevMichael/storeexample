package ru.boldyrev_ma.storeexample.dao;


import ru.boldyrev_ma.storeexample.entity.Product;
import ru.boldyrev_ma.storeexample.interceptors.Logger;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.ArrayList;
import java.util.List;

@Named
@Stateless
public class ProductDAO extends AbstractDAO {

    @Interceptors({Logger.class})
    public List<Product> getProducts() {
        return new ArrayList<>(em.createQuery("SELECT e FROM Product e", Product.class).getResultList());
    }

    @Interceptors({Logger.class})
    public List<Product> getProductsByCategoryId(Long categoryId) {
        if (categoryId != null) {
            return em.createQuery("SELECT e FROM Product e WHERE e.category.id = :categoryId", Product.class)
                    .setParameter("categoryId", categoryId).getResultList();
        }
        return getProducts();
    }

    @Interceptors({Logger.class})
    public Product getProductById(Long id) {
        return em.find(Product.class, id);
    }

    @Interceptors({Logger.class})
    public void addProduct(Product product) {
        if (product != null) {
            em.persist(product);
        }
    }

    @Interceptors({Logger.class})
    public void changeProduct(Product product) {
        if (product != null) {
            em.merge(product);
        }
    }

    @Interceptors({Logger.class})
    public void removeProduct(Product product) {
        em.remove(product);
    }

    @Interceptors({Logger.class})
    public void removeProduct(Long id) {
        if (id != null) {
            Product product = em.find(Product.class, id);
            em.remove(product);
        }
    }

    @Interceptors({Logger.class})
    public String getImgName(Product product) {
        if (product != null) {
            return product.getName().trim().replace(" ", "-").concat(".jpg");
        }
        return "imgName";
    }

    @Interceptors({Logger.class})
    public String getSmallImgName(Product product) {
        if (product != null) {
            return "small-" + product.getName().trim().replace(" ", "-").concat(".jpg");
        }
        return "small-imgName";
    }
}
