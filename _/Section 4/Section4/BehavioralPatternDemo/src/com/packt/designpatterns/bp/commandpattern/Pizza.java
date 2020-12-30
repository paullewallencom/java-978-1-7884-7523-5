package com.packt.designpatterns.bp.commandpattern;

public class Pizza {
	private String name;
	private int qty;
	
	public Pizza(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	
	public void makeOrder() {
		System.out.println(qty + " " + name + " Pizzas Ordered");
	}
	
	public void cancelOrder() {
		System.out.println(qty + " " + name + " Pizzas Cancelled");
	}
}
