package ru.boldyrev_ma.storeexample.dao;


import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private List<Product> products;
    private int indexOfProduct = -1;

    public ProductDAO() {
        this.products = new ArrayList<>();
        Product product1 = new Product(1, "present-box")
                .setPrice(100)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка")
                .setWeight(400)
                .setLength(20)
                .setWidth(20)
                .setHeight(10)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product2 = new Product(2, "present-box2")
                .setPrice(102)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 2")
                .setWeight(402)
                .setLength(22)
                .setWidth(22)
                .setHeight(12)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 2.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product3 = new Product(3, "present-box3")
                .setPrice(103)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 3")
                .setWeight(403)
                .setLength(23)
                .setWidth(23)
                .setHeight(13)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 3.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product4 = new Product(4, "present-box4")
                .setPrice(104)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 4")
                .setWeight(404)
                .setLength(24)
                .setWidth(24)
                .setHeight(14)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 4.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product5 = new Product(5, "present-box5")
                .setPrice(105)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 5")
                .setWeight(405)
                .setLength(25)
                .setWidth(25)
                .setHeight(15)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 5.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product6 = new Product(6, "present-box6")
                .setPrice(106)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 6")
                .setWeight(406)
                .setLength(26)
                .setWidth(26)
                .setHeight(16)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 6.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product7 = new Product(7, "present-box7")
                .setPrice(107)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 7")
                .setWeight(407)
                .setLength(27)
                .setWidth(27)
                .setHeight(17)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 7.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product8 = new Product(8, "present-box8")
                .setPrice(108)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 8")
                .setWeight(408)
                .setLength(28)
                .setWidth(28)
                .setHeight(18)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 8.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product9 = new Product(9, "present-box9")
                .setPrice(109)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 9")
                .setWeight(409)
                .setLength(29)
                .setWidth(29)
                .setHeight(19)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 9.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
        Product product10 = new Product(10, "present-box10")
                .setPrice(110)
                .setImgName()
                .setSmallImgName()
                .setImgCaption("Подарочная<br>коробка 10")
                .setWeight(410)
                .setLength(30)
                .setWidth(30)
                .setHeight(20)
                .setDescription("Коробка с&nbsp;цветами и&nbsp;сладостями 10.")
                .setDetailedDescription("Коробка выполнена из&nbsp;плотного картона с&nbsp;цветочным принтом. В&nbsp;состав коробки входят:<br> флористическая губка, живые цветы, сладости.");
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
}
