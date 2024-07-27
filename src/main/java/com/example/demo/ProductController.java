package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {

    ArrayList<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1, "Iphone", "Iphone Mobile"));
        products.add(new Product(2, "Samsung", "Samsung Mobile"));
        products.add(new Product(3, "Flipflop", "Sha7at bi 2osba3"));
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/products/all")
    public ArrayList<Product> products() {
        return products;
    }

    @GetMapping("/products/{id}")
    public Product products(@PathVariable int id) {
        return products.get(id);
    }

}