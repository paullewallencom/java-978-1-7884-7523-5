package com.packt.designpatterns.bp.observerpattern;

public class PaymentObserver implements OrderObserver{

	Pizza pizza;
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg = "Payment is done for " + pizza.getName();
		System.out.println(msg);
	}

	@Override
	public void setSubject(Pizza pizza) {
		// TODO Auto-generated method stub
		this.pizza = pizza;
	}
	
}
