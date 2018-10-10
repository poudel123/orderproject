package com.capgemini.orders.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orders.entity.Item;
import com.capgemini.orders.entity.Orders;
import com.capgemini.orders.service.OrderService;

@RestController
public class OrdersController {
	@Autowired
	private OrderService orderService;

	private HashMap<Integer, Set<Item>> cartItems;

	public OrdersController() {
		cartItems = new HashMap<>();
	}

	@PostMapping("/cart/{customerId}")
	public ResponseEntity<Set<Item>> addToCart(@RequestBody Item item, @PathVariable int customerId) {
		Set<Item> Items = cartItems.get(customerId);
		if (Items == null) {

			Items = new HashSet<>();
			Items.add(item);
			cartItems.put(customerId, Items);
		} else {
			Items.add(item);
			cartItems.put(customerId, Items);
		}
		return new ResponseEntity<Set<Item>>(Items, HttpStatus.OK);
	}
	
	@PostMapping("/submit")
	public ResponseEntity<Orders> placeOrder( @RequestBody Orders orders){
		orderService.submitOrder(orders);
		
		ResponseEntity<Orders> submitOrder= new ResponseEntity<Orders>(orders,HttpStatus.OK);
		return submitOrder;
		
		
//	@GetMapping("/cart/{customerId}")
//	public ResponseEntity<Set<Item>> getCartItems(@PathVariable int customerId) {
//		Set<Item> Items = cartItems.get(customerId);
//
//		return new ResponseEntity<Set<Item>>(Items, HttpStatus.OK);
//	}
//
//	
//	@GetMapping("/order/{orderId}")
//	public ResponseEntity<Orders> getOrderByOrderId(@PathVariable int orderId) throws OrderNotFoundException {
//
//		ResponseEntity<Orders> responseEntity = new ResponseEntity<Orders>(orderService.getOrder(orderId),
//				HttpStatus.OK);
//		return responseEntity;
//	}
//
//	@DeleteMapping("/order/{orderId}")
//	public void deleteOrderById(@PathVariable int orderId) {
//		orderService.deleteOrderById(orderId);
//	}
//
//	@GetMapping("/order")
//	public List<Orders> getAllOrders() {
//		return orderService.getOrders();
//	}
//
	
	}
	
}
