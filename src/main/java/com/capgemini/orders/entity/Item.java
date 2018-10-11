package com.capgemini.orders.entity;

import java.util.Objects;

public class Item {
	private int itemId;
	private int itemQuantity;
	private int itemProductId;
	private double itemTotal;
	@Override
	public int hashCode() {
		return Objects.hash(itemId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;
		if (itemProductId != other.itemProductId)
			return false;
		if (itemQuantity != other.itemQuantity)
			return false;
		if (Double.doubleToLongBits(itemTotal) != Double.doubleToLongBits(other.itemTotal))
			return false;
		return true;
	}
	
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
