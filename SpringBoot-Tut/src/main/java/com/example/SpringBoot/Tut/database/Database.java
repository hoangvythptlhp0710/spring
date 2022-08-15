package com.example.SpringBoot.Tut.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.domain.QAbstractAuditable;

import com.example.SpringBoot.Tut.models.Product;
import com.example.SpringBoot.Tut.repositories.ProductRepository;

@Configuration
public class Database {
    private final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception{
                Product product1 = new Product("Apple", "iPhone 13", 2021, 1399.0, "");
                Product product2 = new Product("Apple", "iPhone 12", 2020, 1399.0, "");
                logger.info("insert data: "+productRepository.save(product1));
                logger.info("insert data: "+productRepository.save(product2));
            }
        };
    }

}
