package com.capgemini.orders.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
public class Orders  {

	private int orderId;
	private int orderTotal;
	private LocalDate orderDate;
	private int ordercustomerId;
	
	private Set<Item> items;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderId, int orderTotal, LocalDate orderDate, int ordercustomerId, Set<Item> items) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderDate = orderDate;
		this.ordercustomerId = ordercustomerId;
		this.items = items;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrdercustomerId() {
		return ordercustomerId;
	}
	public void setOrdercustomerId(int ordercustomerId) {
		this.ordercustomerId = ordercustomerId;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderDate=" + orderDate
				+ ", ordercustomerId=" + ordercustomerId + ", items=" + items + "]";
	}
	
}
