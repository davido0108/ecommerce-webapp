package com.backend.ecommerceservice.repository;

import com.backend.ecommerceservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
