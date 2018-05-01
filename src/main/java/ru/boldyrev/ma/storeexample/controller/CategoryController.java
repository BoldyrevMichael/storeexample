package ru.boldyrev.ma.storeexample.controller;

import ru.boldyrev.ma.storeexample.dao.CategoryDAO;
import ru.boldyrev.ma.storeexample.entity.Category;
import ru.boldyrev.ma.storeexample.interceptor.InterceptorLogger;

import javax.annotation.PostConstruct;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;

@Named
@ApplicationScoped
@Interceptors({InterceptorLogger.class})
public class CategoryController extends AbstractController {

    private final Long id = Long.valueOf(getParamString("id"));

    @Inject
    private CategoryDAO categoryDAO;

    private Category category;

    @PostConstruct
    private void init() {
        category = categoryDAO.getCategoryById(id);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void save() {
        categoryDAO.changeCategory(category);
    }
}
