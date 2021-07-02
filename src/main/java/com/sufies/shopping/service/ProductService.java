package com.sufies.shopping.service;

import com.sufies.shopping.model.Product;
import com.sufies.shopping.model.User;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    void saveProduct (Product product);
    List<Product> getAllproducts();
    void  deleteProduct(long id);
    Optional<Product>findById(long id);
    void updateProduct(Product product);


}

