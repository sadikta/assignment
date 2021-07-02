package com.sufies.shopping.repository;

import com.sufies.shopping.model.Product;
import com.sufies.shopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
