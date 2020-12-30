package com.packt.designpatterns.bp.commandpattern;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Veg Supreme Pizza",10);
		
		Order orderPizza = new OrderPizza(pizza);
		
		pizza = new Pizza("Veg Supreme Pizza",5);
		
		Order cancelPizza = new CancelPizza(pizza);
		
		Waiter waiter = new Waiter();
		waiter.takeOrder(orderPizza);
		waiter.takeOrder(cancelPizza);
		waiter.placeOrders();

	}

}
