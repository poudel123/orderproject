package com.capgemini.orders.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.capgemini.orders.entity.Orders;
import com.capgemini.orders.exception.OrderNotFoundException;
import com.capgemini.orders.repository.OrdersRepository;
import com.capgemini.orders.service.OrderService;
@Service
class OrderServiceImpl implements OrderService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	

	@Override
	public void updateOrder(Orders orders) {
		ordersRepository.save(orders);

	}

	@Override
	public void deleteOrderById(int orderId) {
		ordersRepository.deleteById(orderId);

	}

	@Override
	public void cancelOrder(int orderId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		return ordersRepository.findAll();
	}

	@Override
	public Orders getOrder(int orderId) throws OrderNotFoundException {
		try
		{
			Optional<Orders> optionalOrder = ordersRepository.findById(orderId);
			if(optionalOrder.isPresent())
				return optionalOrder.get();
			else
				return null;

		}
		catch(IllegalArgumentException e) {
			OrderNotFoundException orderNotFoundException = new OrderNotFoundException("order not found");
			orderNotFoundException.initCause(e);
			throw orderNotFoundException;
			
		}
	}

	@Override
	public Orders submitOrder(Orders orders) {
		// TODO Auto-generated method stub
		
		orders.setOrderDate(LocalDate.now());
	return	ordersRepository.save(orders);
	}

}
