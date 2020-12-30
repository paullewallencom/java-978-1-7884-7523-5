package com.packt.designpatterns.bp.observerpattern;

public interface OrderObserver {
	void update();
	void setSubject(Pizza pizza);
}
