package com.packtpub.designpatterns.structural;

import java.sql.Date;

public class TravelPackageFacade {
	public int BookPackage(String guestName, String fromLocation, String toLocation,
			Date fromDate, Date returnDate, String fromFlightNo, String returnFlightNo, 
			String hotelName, String cabNo) {
		
		int count =0;
		FlightBooking flightBooking = new FlightBooking();
		count = flightBooking.BookFlight(guestName, fromLocation, toLocation, fromDate, 
				fromFlightNo);

		if( count > 0 )
		{
			count = flightBooking.BookFlight(guestName, toLocation, fromLocation, returnDate, 
				returnFlightNo);
			if( count > 0 ) {
				HotelBooking hotelBooking = new HotelBooking();
				count = hotelBooking.BookHotel(guestName, fromDate, returnDate, hotelName);
				if( count > 0 ) {
					CabBooking cabBooking = new CabBooking();
					count = cabBooking.BookCab(guestName, toLocation, hotelName, fromDate, cabNo);
					if( count > 0 ) {
					count = cabBooking.BookCab(guestName, hotelName, toLocation, returnDate, cabNo);
					}
				}
			}
		}
		return count;
	}
}
