package com.packtpub.designpatterns.creational;

public class ManagePacktpubMembers {

	public static void main(String[] args) {
		//PacktpubInternationalMemberFactory factory = new PacktpubInternationalMemberFactory();
		MemberFactory international = PacktpubFactoryProducer.getMemberFactory("International");
		Member member1 = international.subscribe("Annual");
		member1.registerMember("Sekhar");
		member1.showMember();
		System.out.println("--------------------");
		
		Member member2 = international.subscribe("Lifetime");
		member2.registerMember("Raghu");
		member2.showMember();
		System.out.println("----------");
		
		MemberFactory national = PacktpubFactoryProducer.getMemberFactory("National");		
		Member member3 = national.subscribe("Monthly");
		member3.registerMember("Srinivas");
		member3.showMember();
		System.out.println("----------");
	}

}
