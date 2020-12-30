package com.packtpub.designpatterns.structural;

public class OneToOneTraining extends ServiceDecorator {

	public OneToOneTraining(Service _service) {
		super(_service);
	}
	@Override
	public String getDescription() {
		return super.service.getDescription() 
				+ "\nOne-To-One Training Service Consumed";
	}

	@Override
	public double getCost() {
		return super.service.getCost() + 50;
	}

}
