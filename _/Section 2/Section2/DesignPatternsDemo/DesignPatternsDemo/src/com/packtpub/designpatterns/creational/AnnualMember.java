package com.packtpub.designpatterns.creational;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class AnnualMember extends Membership{

	@Override
	public void registerMember(String uname) {
		this.userId = UUID.randomUUID().toString();
		this.userName  = uname;
		this.subscriptionType = "Annual";
		this.startDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR, 1);
		this.endDate = c.getTime();
		this.discountPercentage = 50f;
		super.AddMember(this);
	}

}
