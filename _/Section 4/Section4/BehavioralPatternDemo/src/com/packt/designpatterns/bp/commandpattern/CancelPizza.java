package com.packt.designpatterns.bp.commandpattern;

public class CancelPizza implements Order{
	Pizza pizza;
	
	public CancelPizza( Pizza pizza ) {
		this.pizza = pizza;
	}
	
	public void execute() {
		pizza.cancelOrder();
	}
}
