package com.packtpub.designpatterns.creational;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class TemporaryMember extends Membership{

	@Override
	public void registerMember(String uname) {
		this.userId = UUID.randomUUID().toString();
		this.userName  = uname;
		this.subscriptionType = "Temporary";
		this.startDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.HOUR, 24);
		this.endDate = c.getTime();
		this.discountPercentage = 10f;	
		super.AddMember(this);
	}

}
