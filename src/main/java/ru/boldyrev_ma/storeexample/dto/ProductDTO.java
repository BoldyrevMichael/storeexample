package ru.boldyrev_ma.storeexample.dto;

import ru.boldyrev_ma.storeexample.entity.Product;

public class ProductDTO {
    private Long id;
    private String name;
    private Integer price;
    private Integer weight;
    private Integer length;
    private Integer width;
    private Integer height;
    private String imgName;
    private String smallImgName;
    private String description;
    private String detailedDescription;
    private String caption;

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        price = product.getPrice();
        weight = product.getWeight();
        length = product.getLength();
        width = product.getWidth();
        height = product.getHeight();
        description = product.getDescription();
        detailedDescription = product.getDetailedDescription();
        caption = product.getCaption();
        imgName = getImgName(product);
        smallImgName = getSmallImgName(product);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public String getImgName(Product product) {
        if (product != null) {
            return product.getName().trim().replace(" ", "-").concat(".jpg");
        }
        return "imgName";
    }

    public String getSmallImgName(Product product) {
        if (product != null) {
            return "small-" + product.getName().trim().replace(" ", "-").concat(".jpg");
        }
        return "small-imgName";
    }
}
