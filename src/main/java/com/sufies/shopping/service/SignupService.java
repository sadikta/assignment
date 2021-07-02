package com.sufies.shopping.service;

import com.sufies.shopping.model.Signup;

import java.util.List;
import java.util.Optional;

public interface SignupService {
    List<Signup> getAllSignupUser();

    Signup save(Signup signup);

    public Optional<Signup> getUserBysusername(String susername);

}
