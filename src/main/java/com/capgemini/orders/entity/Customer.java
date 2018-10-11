package com.capgemini.orders.entity;



import org.springframework.data.annotation.Id;


public class Customer {

	private int customerId;
	private String customerPassword;
	private String firstName;
	private String lastName;
	private Address address;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerPassword, String firstName, String lastName, Address address) {
		super();
		this.customerId = customerId;
		this.customerPassword = customerPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerPassword=" + customerPassword + ", firstName="
				+ firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

	
}
