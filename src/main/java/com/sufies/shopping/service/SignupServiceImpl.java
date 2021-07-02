package com.sufies.shopping.service;

import com.sufies.shopping.repository.SignupRepository;
import com.sufies.shopping.model.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SignupServiceImpl implements SignupService {
    @Autowired
    SignupRepository signupRepository;


    @Override
    public List<Signup> getAllSignupUser() {
        return signupRepository.findAll();
    }

    @Override
    public Signup save(Signup signup) {
        return signupRepository.save(signup);
    }



    @Override
    public Optional<Signup> getUserBysusername(String susername) {
        return signupRepository.findUserBySusername(susername);

    }


}
