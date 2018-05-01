package ru.boldyrev.ma.storeexample.controller;

import ru.boldyrev.ma.storeexample.dao.CategoryDAO;
import ru.boldyrev.ma.storeexample.entity.Category;
import ru.boldyrev.ma.storeexample.interceptor.InterceptorLogger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import java.util.List;

@Named
@ApplicationScoped
@Interceptors({InterceptorLogger.class})
public class ListOfCategoryController {
    @Inject
    private CategoryDAO categoryDAO;

    public List<Category> getCategoryList() {
        return categoryDAO.getCategories();
    }

    public void removeCategory(Category category) {
        categoryDAO.removeCategory(category.getId());
    }

    public void addCategory() {
        categoryDAO.addCategory(new Category());
    }
}
