package com.packt.designpatterns.bp.observerpattern;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Veg Supreme Pizza");
		OrderObserver observer = new PaymentObserver();
		pizza.register(observer);
		observer = new OrderDispatcher();
		pizza.register(observer);
		pizza.placeOrder();
	}

}
