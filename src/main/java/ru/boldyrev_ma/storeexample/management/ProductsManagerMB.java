package ru.boldyrev_ma.storeexample.management;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


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
