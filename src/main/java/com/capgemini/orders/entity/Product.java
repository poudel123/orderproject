package com.capgemini.orders.entity;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

	@Id
	private int productId;
	private String productName;
	private double cost;
	HashMap<String, Object> Specifications = new HashMap<>();

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double cost, HashMap<String, Object> specifications) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		Specifications = specifications;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public HashMap<String, Object> getSpecifications() {
		return Specifications;
	}

	public void setSpecifications(HashMap<String, Object> specifications) {
		Specifications = specifications;
	}

}
