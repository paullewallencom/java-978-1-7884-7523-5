package com.packtpub.designpatterns.structural;

public class SubscribeAdditionalServices {
	public static void main(String[] args) {
		Service guestMemberService = new GuestMemberService();
		guestMemberService = new OneToOneTraining(guestMemberService);
		
		Service registeredMemberService = new RegisteredMemberService();
		registeredMemberService = new OneToOneTraining(registeredMemberService);
		registeredMemberService = new ProjectSupport(registeredMemberService);
		
		System.out.println("Guest Member Details : \n"
		+ guestMemberService.getDescription() +
		"\nCost :" + guestMemberService.getCost());
		
		System.out.println("Registered Member Details : \n"
				+ registeredMemberService.getDescription()
				+ "\nCost :" + registeredMemberService.getCost());
	}
}
