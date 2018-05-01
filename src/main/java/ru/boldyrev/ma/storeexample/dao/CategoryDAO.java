package ru.boldyrev.ma.storeexample.dao;

import ru.boldyrev.ma.storeexample.entity.Category;
import ru.boldyrev.ma.storeexample.interceptor.InterceptorLogger;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.ArrayList;
import java.util.List;

@Named
@Stateless
@Interceptors({InterceptorLogger.class})
public class CategoryDAO extends AbstractDAO {

    public List<Category> getCategories() {
        return new ArrayList<>(em.createQuery("SELECT e FROM Category e", Category.class).getResultList());
    }

    public Category getCategoryById(Long id) {
        return em.find(Category.class, id);
    }

    public void addCategory(Category category) {
        if (category != null) {
            em.persist(category);
        }
    }

    public void changeCategory(Category category) {
        if (category != null) {
            em.merge(category);
        }
    }

    public void removeCategory(Category category) {
        em.remove(category);
    }

    public void removeCategory(Long id) {
        if (id != null) {
            Category category = em.find(Category.class, id);
            em.remove(category);
        }
    }
}
