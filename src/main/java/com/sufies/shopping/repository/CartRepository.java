package com.sufies.shopping.repository;

import com.sufies.shopping.model.CartInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartInput,Long> {
}
