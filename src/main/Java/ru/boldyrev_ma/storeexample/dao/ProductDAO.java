package ru.boldyrev_ma.storeexample.dao;


import ru.boldyrev_ma.storeexample.entity.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class ProductDAO {
    private List<Product> products;
    private int indexOfProduct = -1;

    public ProductDAO() {
        this.products = new ArrayList<>();
        Product product1 = new Product(1, "present-box")
                .setPriceA(100)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка")
                .setWeightA(400)
                .setLengthA(20)
                .setWidthA(20)
                .setHeightA(10)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product2 = new Product(2, "present-box2")
                .setPriceA(102)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 2")
                .setWeightA(402)
                .setLengthA(22)
                .setWidthA(22)
                .setHeightA(12)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 2.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product3 = new Product(3, "present-box3")
                .setPriceA(103)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 3")
                .setWeightA(403)
                .setLengthA(23)
                .setWidthA(23)
                .setHeightA(13)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 3.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product4 = new Product(4, "present-box4")
                .setPriceA(104)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 4")
                .setWeightA(404)
                .setLengthA(24)
                .setWidthA(24)
                .setHeightA(14)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 4.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product5 = new Product(5, "present-box5")
                .setPriceA(105)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 5")
                .setWeightA(405)
                .setLengthA(25)
                .setWidthA(25)
                .setHeightA(15)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 5.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product6 = new Product(6, "present-box6")
                .setPriceA(106)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 6")
                .setWeightA(406)
                .setLengthA(26)
                .setWidthA(26)
                .setHeightA(16)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 6.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product7 = new Product(7, "present-box7")
                .setPriceA(107)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 7")
                .setWeightA(407)
                .setLengthA(27)
                .setWidthA(27)
                .setHeightA(17)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 7.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product8 = new Product(8, "present-box8")
                .setPriceA(108)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 8")
                .setWeightA(408)
                .setLengthA(28)
                .setWidthA(28)
                .setHeightA(18)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 8.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product9 = new Product(9, "present-box9")
                .setPriceA(109)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 9")
                .setWeightA(409)
                .setLengthA(29)
                .setWidthA(29)
                .setHeightA(19)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 9.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product10 = new Product(10, "present-box10")
                .setPriceA(110)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 10")
                .setWeightA(410)
                .setLengthA(30)
                .setWidthA(30)
                .setHeightA(20)
                .setDescriptionA("Коробка с&nbsp;цветами и&nbsp;сладостями 10.")
                .setDetailedDescriptionA("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getIndexOfProduct(String id) {
        for (Product product : products) {
            if (product.getId().equals(Integer.valueOf(id))) {
                indexOfProduct = products.indexOf(product);
                break;
            }
        }
        return indexOfProduct;
    }

    public Product getProductById(String id) {
        return products.get(getIndexOfProduct(id));
    }

    public void addProduct(Product product) {
        if (product == null) return;
        products.add(product);
    }

    public void changeProduct(Product product) {
        if (product == null) return;
        products.remove(getIndexOfProduct(product.getId().toString()));
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(getIndexOfProduct(product.getId().toString()));
    }
}
