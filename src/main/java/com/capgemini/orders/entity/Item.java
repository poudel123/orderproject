package com.capgemini.orders.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	
	@Id
	private int itemId;
	private int itemQuantity;
	private int itemProductId;
	private double itemTotal;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, int itemQuantity, int itemProductId, double itemTotal) {
		super();
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.itemProductId = itemProductId;
		this.itemTotal = itemTotal;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getItemProductId() {
		return itemProductId;
	}
	public void setItemProductId(int itemProductId) {
		this.itemProductId = itemProductId;
	}
	public double getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemQuantity=" + itemQuantity + ", itemProductId=" + itemProductId
				+ ", itemTotal=" + itemTotal + "]";
	}
	
	

}
