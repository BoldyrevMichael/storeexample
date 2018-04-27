package ru.boldyrev_ma.storeexample.management;

import ru.boldyrev_ma.storeexample.dao.CategoryDAO;
import ru.boldyrev_ma.storeexample.entity.Category;
import ru.boldyrev_ma.storeexample.interceptors.Logger;

import javax.annotation.PostConstruct;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;

@Named
@ApplicationScoped
public class CategoryManager extends AbstractController {

    private final Long id = Long.valueOf(getParamString("id"));

    @Inject
    private CategoryDAO categoryDAO;

    private Category category;

    @PostConstruct
    private void init() {
        category = categoryDAO.getCategoryById(id);
    }

    @Interceptors({Logger.class})
    public Category getCategory() {
        return category;
    }

    @Interceptors({Logger.class})
    public void setCategory(Category category) {
        this.category = category;
    }

    @Interceptors({Logger.class})
    public void save() {
        categoryDAO.changeCategory(category);
    }
}
