package com.sufies.shopping.controller;

import com.sufies.shopping.model.CartInput;
import com.sufies.shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {
    @Autowired
    CartService cartService;
    @GetMapping("/cartproduct")
    public String getAllProducts(ModelMap model){
        model.put("getcart", new CartInput());
        model.put("getproduct",cartService.getAllproduct());
        model.put("getusers",cartService.getAlluser());
        return "cart";
    }
    @PostMapping("/cartsave")
       public  String saveCart(CartInput cartInput){
        cartService.cartsave(cartInput);
        return "cart";
    }

}
