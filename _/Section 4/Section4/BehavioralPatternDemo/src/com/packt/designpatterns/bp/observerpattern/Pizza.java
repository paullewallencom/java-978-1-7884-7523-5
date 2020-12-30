package com.packt.designpatterns.bp.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	String name;
	List<OrderObserver> observers = new ArrayList<OrderObserver>();
	
	public Pizza(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void placeOrder() {
		System.out.println(name + " is ready");
		notifyAllObservers();
	}
	
	private void notifyAllObservers() {
		for(OrderObserver observer: observers) {
			observer.update();
		}
	}
	
	public void register(OrderObserver observer) {
		observers.add(observer);
		observer.setSubject(this);
	}
	
}
