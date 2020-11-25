package com.macdit;

public class Order {
	private int id;
	//private DATE joined_date;
	private double amount;
	
	
	public Order(int id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}


	public Order() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", amount=" + amount + "]";
	}
	
	
	

}
