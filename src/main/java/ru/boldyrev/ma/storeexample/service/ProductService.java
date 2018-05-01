package ru.boldyrev.ma.storeexample.service;


import ru.boldyrev.ma.storeexample.dao.ProductDAO;
import ru.boldyrev.ma.storeexample.dto.ProductDTO;
import ru.boldyrev.ma.storeexample.dto.ResultProductDTO;
import ru.boldyrev.ma.storeexample.entity.Product;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/ProductService")
@WebService
public class ProductService {

    @Inject
    private ProductDAO productDAO;

    @GET
    @Path("/addProduct")
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod
    public ResultProductDTO addProduct(
            @WebParam(name = "product", partName = "product")
            //@QueryParam(value = "product")
            Product product
    ) {
        if (product != null) productDAO.addProduct(product);
        return new ResultProductDTO();
    }

    @GET
    @Path("/removeProduct")
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod
    public ResultProductDTO removeProduct(
            @WebParam(name = "id", partName = "id")
            @QueryParam(value = "id")
            Long id
    ) {
        productDAO.removeProduct(id);
        return new ResultProductDTO();
    }

    @GET
    @Path("/getProductById")
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod
    public ProductDTO getProductById(
            @WebParam(name = "id", partName = "id")
            @QueryParam(value = "id")
            Long id
    ) {
        final Product product = productDAO.getProductById(id);
        if (product != null) return new ProductDTO(product);
        return null;
    }

    @GET
    @Path("/getProductByName")
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod
    public ProductDTO getProductByName(
            @WebParam(name = "name", partName = "name")
            @QueryParam(value = "name")
            String name
    ) {
        final Product product = productDAO.getProductByName(name);
        if (product != null) return new ProductDTO(product);
        return null;
    }

    @GET
    @Path("/getProducts")
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod
    public List<ProductDTO> getProducts() {
        return ProductDTO.toList(productDAO.getProducts());
    }

    @GET
    @Path("/getProductsByCategoryId")
    @Produces({MediaType.APPLICATION_JSON})
    @WebMethod
    public List<ProductDTO> getProductsByCategoryId(
            @WebParam(name = "categoryId", partName = "categoryId")
            @QueryParam(value = "categoryId")
            Long categoryId
    ) {
        final List<Product> productsByCategoryId = productDAO.getProductsByCategoryId(categoryId);
        if (productsByCategoryId != null) return ProductDTO.toList(productsByCategoryId);
        return null;
    }
}
