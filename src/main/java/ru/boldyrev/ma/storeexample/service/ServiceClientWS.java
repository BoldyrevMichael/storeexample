package ru.boldyrev.ma.storeexample.service;

import ru.boldyrev.ma.storeexample.serviceclient.ProductDTO;
import ru.boldyrev.ma.storeexample.serviceclient.ProductService;
import ru.boldyrev.ma.storeexample.serviceclient.ProductServiceService;

import javax.xml.ws.WebServiceRef;

public class ServiceClientWS {
@WebServiceRef(wsdlLocation = "http://localhost:8080/store-example/ProductService?wsdl")
    private static ProductServiceService productServiceService;

    public static void main(String[] args) {
        ProductService productService = productServiceService.getProductServicePort();
        for (ProductDTO product:productService.getProducts()) {
            System.out.println(product.getId());
        }
    }
}
