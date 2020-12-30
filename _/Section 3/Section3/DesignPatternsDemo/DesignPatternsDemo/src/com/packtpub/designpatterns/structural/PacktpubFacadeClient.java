package com.packtpub.designpatterns.structural;

import java.sql.Date;
import java.util.Scanner;

public class PacktpubFacadeClient {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Guest Name : ");
	String guestName = scanner.nextLine();
	
	System.out.print("Enter From Location : ");
	String fromLocation = scanner.nextLine();
	
	System.out.print("Enter To Location : ");
	String toLocation = scanner.nextLine();
	
	System.out.print("Enter From Date : ");
	Date fromDate = java.sql.Date.valueOf(scanner.nextLine());
	
	System.out.print("Enter To Date : ");
	Date returnDate = java.sql.Date.valueOf(scanner.nextLine());
	
	System.out.print("Enter From Flight No : ");
	String fromFlightNo = scanner.nextLine();
	
	System.out.print("Enter Return Flight No : ");
	String returnFlightNo = scanner.nextLine();
	
	System.out.print("Enter Hotel Name : ");
	String hotelName = scanner.nextLine();
	
	System.out.print("Enter Cab Number : ");
	String cabNo =  scanner.nextLine();
	
	TravelPackageFacade tpf = new TravelPackageFacade();
	int count = tpf.BookPackage(guestName, fromLocation, toLocation, fromDate,returnDate, 
			fromFlightNo,returnFlightNo, hotelName, cabNo);
	
	if(count > 0)
		System.out.println("Travel Package Successfully booked for the guest " + guestName);
	else
		System.out.println("Error while booking travel package for the guest " + guestName);
	
	scanner.close();
	

}
}
