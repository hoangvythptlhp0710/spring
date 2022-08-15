package com.example.SpringBoot.Tut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Tut.models.Product;
import com.example.SpringBoot.Tut.repositories.ProductRepository;

@RestController
@RequestMapping(path="api/v1")
public class ProductController {
    //DI = Dependency Injection
    @Autowired
    private ProductRepository repository;


    @GetMapping("")
    List<Product> getAllProducts(){
        return repository.findAll();
    }
}
