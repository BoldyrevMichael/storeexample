package ru.boldyrev_ma.storeexample.management;

import ru.boldyrev_ma.storeexample.dao.CategoryDAO;
import ru.boldyrev_ma.storeexample.entity.Category;
import ru.boldyrev_ma.storeexample.interceptors.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.List;

@Named
@ApplicationScoped
public class CategoriesManager {
    @Inject
    private CategoryDAO categoryDAO;

    @Interceptors({Logger.class})
    public List<Category> getCategoryList() {
        return categoryDAO.getCategories();
    }

    @Interceptors({Logger.class})
    public void removeCategory(Category category) {
        categoryDAO.removeCategory(category.getId());
    }

    @Interceptors({Logger.class})
    public void addCategory() {
        categoryDAO.addCategory(new Category());
    }
}
