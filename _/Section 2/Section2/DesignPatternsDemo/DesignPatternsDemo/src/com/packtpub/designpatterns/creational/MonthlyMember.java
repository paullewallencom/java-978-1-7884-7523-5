package com.packtpub.designpatterns.creational;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class MonthlyMember extends Membership{

	@Override
	public void registerMember(String uname) {
		this.userId = UUID.randomUUID().toString();
		this.userName  = uname;
		this.subscriptionType = "Monthly";
		this.startDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.MONTH, 1);
		this.endDate = c.getTime();
		this.discountPercentage = 25f;
		super.AddMember(this);
	}

}
