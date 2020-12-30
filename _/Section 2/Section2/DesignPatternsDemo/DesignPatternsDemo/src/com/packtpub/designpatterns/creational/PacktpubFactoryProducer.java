package com.packtpub.designpatterns.creational;

public class PacktpubFactoryProducer {
	public static MemberFactory getMemberFactory(String nationality) {
		MemberFactory memberFactory = null;
		switch(nationality.toUpperCase()) {
		case "NATIONAL" :
			memberFactory = new PacktpubNationalMemberFactory();
			break;
		case "INTERNATIONAL" :
			memberFactory = new PacktpubInternationalMemberFactory();
			break;
		}
		return memberFactory;
	}
}
