package com.sufies.shopping.service;


import com.sufies.shopping.model.Login;
import com.sufies.shopping.model.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    SignupService signupService;


    public boolean FetchingUsername(Login login) {
        String username = login.getLogname();
        Optional<Signup> signup = signupService.getUserBysusername(username);
        String password = login.getLogpassword();
        System.out.println(password);
        String dbpassword = signup.get().getSpassword();
        System.out.println(dbpassword);
        if (password.equals(dbpassword)) {

            System.out.println("password is equal");
            return true;
        }
        System.out.println("password is not equal");
        return false;
    }

}
