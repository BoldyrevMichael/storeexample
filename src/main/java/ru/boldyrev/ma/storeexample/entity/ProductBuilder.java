package ru.boldyrev.ma.storeexample.entity;

public class ProductBuilder {
    private final Product product;

    public ProductBuilder() {
        product = new Product();
    }

    public ProductBuilder setId(Long id) {
        product.setId(id);
        return this;
    }

    public ProductBuilder setName(String name) {
        product.setName(name);
        return this;
    }

    public ProductBuilder setPrice(Integer price) {
        product.setPrice(price);
        return this;
    }

    public ProductBuilder setWeight(Integer weight) {
        product.setWeight(weight);
        return this;
    }

    public ProductBuilder setLength(Integer length) {
        product.setLength(length);
        return this;
    }

    public ProductBuilder setWidth(Integer width) {
        product.setWidth(width);
        return this;
    }

    public ProductBuilder setHeight(Integer height) {
        product.setHeight(height);
        return this;
    }

    public ProductBuilder setDescription(String description) {
        product.setDescription(description);
        return this;
    }

    public ProductBuilder setDetailedDescription(String detailedDescription) {
        product.setDetailedDescription(detailedDescription);
        return this;
    }

    public ProductBuilder setCaption(String caption) {
        product.setCaption(caption);
        return this;
    }

    public Product build() {
        return product;
    }
}
