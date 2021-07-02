package com.sufies.shopping.service;

import com.sufies.shopping.model.CartInput;
import com.sufies.shopping.model.Product;
import com.sufies.shopping.model.User;

import java.util.List;

public interface CartService {
    List<Product> getAllproduct();
    List<User> getAlluser();
    void cartsave(CartInput cartInput);
}
