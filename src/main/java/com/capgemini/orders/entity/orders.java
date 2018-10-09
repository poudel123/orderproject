package com.capgemini.orders.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class orders {

	private int orderId;
	private int orderTotal;
	private LocalDate orderDate;
	private int ordercustomerId;
	@OneToMany
	private List<Item> orderLineItems=new ArrayList<Item>();
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orders(int orderId, int orderTotal, LocalDate orderDate, int ordercustomerId, List<Item> orderLineItems) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderDate = orderDate;
		this.ordercustomerId = ordercustomerId;
		this.orderLineItems = orderLineItems;
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
	public List<Item> getOrderLineItems() {
		return orderLineItems;
	}
	public void setOrderLineItems(List<Item> orderLineItems) {
		this.orderLineItems = orderLineItems;
	}
	@Override
	public String toString() {
		return "orders [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderDate=" + orderDate
				+ ", ordercustomerId=" + ordercustomerId + ", orderLineItems=" + orderLineItems + "]";
	}
	
	

}
