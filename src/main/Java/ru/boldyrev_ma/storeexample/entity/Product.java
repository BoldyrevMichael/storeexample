package ru.boldyrev_ma.storeexample.entity;

public class Product {
    private Integer id;
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
    private String imgCaption;

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Product setPriceA(Integer price) {
        this.price = price;
        return this;
    }

    public String getImgName() {
        return imgName;
    }

    public Product setImgName() {
        StringBuilder stringBuilder = new StringBuilder(name.trim().replace(" ", "-"));
        this.imgName = stringBuilder.append(".jpg").toString();
        return this;
    }

    public String getSmallImgName() {
        return smallImgName;
    }

    public Product setSmallImgName() {
        StringBuilder stringBuilder = new StringBuilder(imgName);
        this.smallImgName = stringBuilder.insert(0, "small-").toString();
        return this;
    }

    public String getImgCaption() {
        return imgCaption;
    }

    public Product setImgCaption(String imgCaption) {
        this.imgCaption = imgCaption;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Product setWeightA(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Product setLengthA(Integer length) {
        this.length = length;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Product setWidthA(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Product setHeightA(Integer height) {
        this.height = height;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product setDescriptionA(String description) {
        this.description = description;
        return this;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public Product setDetailedDescriptionA(String detailedDescription) {
        this.detailedDescription = detailedDescription;
        return this;
    }
}
