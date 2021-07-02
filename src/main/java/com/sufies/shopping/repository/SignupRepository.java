package com.sufies.shopping.repository;

import com.sufies.shopping.model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SignupRepository extends JpaRepository<Signup,Long> {
    Optional<Signup> findUserBySusername(String username);
}
