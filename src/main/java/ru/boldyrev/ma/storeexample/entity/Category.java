package ru.boldyrev.ma.storeexample.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category extends AbstractEntity {

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "category")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
