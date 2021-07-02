package com.sufies.shopping.controller;


import com.sufies.shopping.model.Login;
import com.sufies.shopping.model.Signup;
import com.sufies.shopping.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String LUseradd(ModelMap model) {
        model.addAttribute("login", new Login ());
        return "login";
    }


    @PostMapping ("/login")
    public String LUseradd(Login login) {
        boolean valid = loginService.FetchingUsername(login);
        if(valid){
            return "redirect:/list";
        }

        return "login";
    }



}
