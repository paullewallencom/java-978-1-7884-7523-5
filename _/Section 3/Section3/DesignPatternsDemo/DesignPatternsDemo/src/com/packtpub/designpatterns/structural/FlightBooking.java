package com.packtpub.designpatterns.structural;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.UUID;

import com.packtpub.designpatterns.creational.ConnectionManager;

public class FlightBooking {
	ConnectionManager instance = null;
	
	public FlightBooking() {
		instance = ConnectionManager.getInstance();
	}
	
	public int BookFlight(String guestName, String fromLocation,
			String toLocation,Date bookingDate,String flightNo) {
		int count = 0;
		try {
			String bookingId = UUID.randomUUID().toString();
			Connection conn = instance.getConnection();
			String sql = "insert into FlightBooking values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookingId);
			pstmt.setString(2, guestName);
			pstmt.setString(3, fromLocation);
			pstmt.setString(4, toLocation);
			pstmt.setDate(5, bookingDate);
			pstmt.setString(6, flightNo);
			count = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			System.out.println("Flight Booking for " + guestName 
					+ " done. \n");
			System.out.println("Travel Details :\nFrom Location: " 
					+ fromLocation 
					+ ",To Location: " + toLocation + "Travel Date : " +
					bookingDate + "\nFlight No : " + flightNo + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;


	}
}
