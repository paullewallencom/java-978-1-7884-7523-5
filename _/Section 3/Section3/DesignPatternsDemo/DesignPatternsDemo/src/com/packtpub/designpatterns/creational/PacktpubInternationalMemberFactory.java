package com.packtpub.designpatterns.creational;

public class PacktpubInternationalMemberFactory implements MemberFactory {

	@Override
	public Member subscribe(String subscriptionType) {
		Member member = null;
		switch(subscriptionType.toUpperCase()) {
		case "LIFETIME" :
			member = new LifetimeMember();
			break;
		case "ANNUAL" :
			member = new AnnualMember();
			break;
		case "TEMPORARY" :
			member = new TemporaryMember();
			break;
		}
		return member;
	}

}
