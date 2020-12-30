package com.packtpub.designpatterns.structural;

public class ProjectSupport extends ServiceDecorator {

	public ProjectSupport(Service _service) {
		super(_service);
	}
	@Override
	public String getDescription() {
		return super.service.getDescription() 
				+ "\nProject Support Service Consumed";
	}

	@Override
	public double getCost() {
		return super.service.getCost() + 60;
	}

}
