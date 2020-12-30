package com.packtpub.designpatterns.structural;

public class GuestMemberService implements Service {

	@Override
	public String getDescription() {
		return "Additional Services for Packtpub Guest Members";
	}

	@Override
	public double getCost() {
		return 25;
	}

}
