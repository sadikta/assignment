package com.sufies.shopping.controller;

import com.sufies.shopping.model.Login;
import com.sufies.shopping.model.Signup;
import com.sufies.shopping.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class SignupController {
    @Autowired
    SignupService signupService;

    @GetMapping("/signup")
    public String add(ModelMap model) {
        model.addAttribute("signup", new Signup());
        return "signup";
    }
    @PostMapping("/signup")
    public String RUsersave(Signup signup) {
        signupService.save(signup);
        return "redirect:/login ";
    }



}
