package com.packtpub.designpatterns.creational;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class LifetimeMember extends Membership{

	@Override
	public void registerMember(String uname) {
		this.userId = UUID.randomUUID().toString();
		this.userName  = uname;
		this.subscriptionType = "Lifetime";
		this.startDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR, 60);
		this.endDate = c.getTime();
		this.discountPercentage = 90f;
		super.AddMember(this);
	}

}
