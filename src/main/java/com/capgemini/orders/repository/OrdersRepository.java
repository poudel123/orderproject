package com.capgemini.orders.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.orders.entity.Orders;

public interface OrdersRepository extends MongoRepository<Orders, Integer> {
	/*@Query("{'customerId': ?0}")
	public List<Orders> findByCustomerId(int customerId);*/

}
