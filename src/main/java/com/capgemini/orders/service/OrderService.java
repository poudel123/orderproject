package com.capgemini.orders.service;

import java.util.List;

import org.springframework.core.annotation.Order;

import com.capgemini.orders.entity.Orders;
import com.capgemini.orders.exception.OrderNotFoundException;

public interface OrderService {
	public Orders submitOrder(Orders orders);
	public Orders updateOrder(Orders orders);
	public Orders deleteOrderById(int orderId);
	public Orders cancelOrder(int orderId);
	public List<Orders> getOrders();
	public Orders getOrder(int orderId) throws OrderNotFoundException;
	public Orders changeStatus(int orderId, String status);

}
