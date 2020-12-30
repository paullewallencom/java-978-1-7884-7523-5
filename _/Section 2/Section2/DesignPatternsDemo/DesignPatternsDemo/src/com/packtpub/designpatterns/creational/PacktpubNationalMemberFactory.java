package com.packtpub.designpatterns.creational;

public class PacktpubNationalMemberFactory implements MemberFactory {

	@Override
	public Member subscribe(String subscriptionType) {
		Member member = null;
		if(subscriptionType.equalsIgnoreCase("Monthly")) {
			member = new MonthlyMember();
		}
		return member;
	}

}
