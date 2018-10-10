package com.capgemini.orders.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.orders.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
