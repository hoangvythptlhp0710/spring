package com.example.SpringBoot.Tut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.Tut.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
