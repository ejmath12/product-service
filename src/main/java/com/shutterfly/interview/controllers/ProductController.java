package com.shutterfly.interview.controllers;

import com.shutterfly.interview.models.Product;
import com.shutterfly.interview.models.ProductType;
import com.shutterfly.interview.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/{type}")
    public List<Product> retrieveProducts(@PathVariable String type) {
        List<Product> products;
        if(type.equals(ProductType.all.toString())) {
            products = productRepository.findAll();
        } else
            products = productRepository.findAllByType(ProductType.valueOf(type));
        return products;
    }
}
