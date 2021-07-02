package com.sufies.shopping.service;

import com.sufies.shopping.model.CartInput;
import com.sufies.shopping.model.Product;
import com.sufies.shopping.model.User;
import com.sufies.shopping.repository.CartRepository;
import com.sufies.shopping.repository.ProductRepository;
import com.sufies.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CartServiceImpl implements  CartService{
    @Autowired
    CartRepository cartRepository;
   @Autowired
   ProductRepository productRepository;
@Autowired
UserRepository userRepository;
    @Override
    public List<Product> getAllproduct() {
        return productRepository.findAll();
    }

    @Override
    public List<User> getAlluser() {
        return userRepository.findAll();
    }

    @Override
    public void cartsave(CartInput cartInput) {


       cartRepository.save(cartInput);
    }
}
