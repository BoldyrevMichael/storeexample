package ru.boldyrev_ma.storeexample.management;

import ru.boldyrev_ma.storeexample.dao.ProductDAO;
import ru.boldyrev_ma.storeexample.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ViewScoped
@ManagedBean(name = "exampleMB", eager = true)
public class ProductsManagerMB {
    String field = "Field in Bean!";

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
