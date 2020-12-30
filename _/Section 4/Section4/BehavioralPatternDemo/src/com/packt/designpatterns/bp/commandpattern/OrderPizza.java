package com.packt.designpatterns.bp.commandpattern;

public class OrderPizza implements Order{
	Pizza pizza;
	
	public OrderPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public void execute() {
		pizza.makeOrder();
	}
}
