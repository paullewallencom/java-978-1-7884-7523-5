package com.packtpub.designpatterns.structural;

public abstract class ServiceDecorator implements Service{
	
	Service service;
	public ServiceDecorator(Service _service) {
		service = _service;
	}
}
