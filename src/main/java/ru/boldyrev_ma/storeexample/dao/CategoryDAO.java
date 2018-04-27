package ru.boldyrev_ma.storeexample.dao;

import ru.boldyrev_ma.storeexample.entity.Category;
import ru.boldyrev_ma.storeexample.interceptors.Logger;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.ArrayList;
import java.util.List;

@Named
@Stateless
public class CategoryDAO extends AbstractDAO {

    @Interceptors({Logger.class})
    public List<Category> getCategories() {
        return new ArrayList<>(em.createQuery("SELECT e FROM Category e", Category.class).getResultList());
    }

    @Interceptors({Logger.class})
    public Category getCategoryById(Long id) {
        return em.find(Category.class, id);
    }

    @Interceptors({Logger.class})
    public void addCategory(Category category) {
        if (category != null) {
            em.persist(category);
        }
    }

    @Interceptors({Logger.class})
    public void changeCategory(Category category) {
        if (category != null) {
            em.merge(category);
        }
    }

    @Interceptors({Logger.class})
    public void removeCategory(Category category) {
        em.remove(category);
    }

    @Interceptors({Logger.class})
    public void removeCategory(Long id) {
        if (id != null) {
            Category category = em.find(Category.class, id);
            em.remove(category);
        }
    }
}
