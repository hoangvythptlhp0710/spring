package com.example.SpringBoot.Tut.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increment id
    private Long id;
    private String manufacture;
    private String productName;
    private Integer year;
    private Double price;
    private String url;

    public Product(){

    }

    public Product(String manufacture, String productName, Integer year, Double price, String url) {
        this.manufacture = manufacture;
        this.productName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
}
