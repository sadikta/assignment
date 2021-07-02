package com.sufies.shopping.controller;

import com.sufies.shopping.model.Product;
import com.sufies.shopping.model.User;
import com.sufies.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/addProduct")
    public String addProduct(ModelMap model){
        model.addAttribute("product",new Product());
        return "addproduct";
    }
    @PostMapping("/addProduct")
    public String saveProduct(Product product){
        productService.saveProduct(product);
         return "redirect:/productlist";
    }
    @GetMapping("/productlist")
    public  String viewProductList(ModelMap model){
        model.put("product" , productService.getAllproducts());
        return "productlist" ;
    }

    @GetMapping("/deleteproduct")
    public String deleteProduct(long id){
        productService.deleteProduct(id);
        return "redirect:/productlist";

    }
    @GetMapping("/updateproduct")
    public String updateProduct(@RequestParam long id,ModelMap model){
        Product product = productService.findById(id).get();
        model.put("product",product);
        return "addproduct";
    }
    @PostMapping("/updateproduct")
    public  String updateProductSave(Product product){
        productService.updateProduct(product);
        return "redirect:/updateproduct";
    }



}
