package com.sufies.shopping.controller;

import com.sufies.shopping.model.User;
import com.sufies.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
@Autowired
    UserService userService;


    @GetMapping("/add")
    public String adduser(ModelMap model){
        model.addAttribute("user",new User());
        return "add";
    }
    @PostMapping("/add")
    public  String saveUser(User user){
        userService.saveUser(user);
        return "redirect:/list";
    }
@GetMapping("/list")
    public String showUserList(ModelMap model){
        model.put("user",userService.getAllusers());
        return "userlist";
}

@GetMapping ("/delete")
    public  String userDelete(@RequestParam long id){
    userService.deleteUser(id);

    return "redirect:/list";
}
@GetMapping("/update")
    public String updateUser(@RequestParam long id,ModelMap model){
        User user = userService.findById(id).get();
        model.put("user",user);
        return "add";
}
@PostMapping("/update")
    public  String updateSave(User user){
        userService.updateUser(user);
        return "redirect:/list";
}


}
