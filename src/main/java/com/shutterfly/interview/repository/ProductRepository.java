package com.shutterfly.interview.repository;

import com.shutterfly.interview.models.Product;
import com.shutterfly.interview.models.ProductType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findAllByType(ProductType type);
}
