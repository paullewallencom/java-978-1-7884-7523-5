package com.packtpub.designpatterns.structural;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.UUID;

import com.packtpub.designpatterns.creational.ConnectionManager;

public class CabBooking {
	ConnectionManager instance = null;
	
	public CabBooking() {
		instance = ConnectionManager.getInstance();
	}
	
	public int BookCab(String guestName, String fromLocation,
			String toLocation,Date bookingDate, String cabNo) {
		int count = 0;
		try {
			String bookingId = UUID.randomUUID().toString();
			Connection conn = instance.getConnection();
			String sql = "insert into CabBooking values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookingId);
			pstmt.setString(2, guestName);
			pstmt.setString(3, fromLocation);
			pstmt.setString(4, toLocation);
			pstmt.setDate(5, bookingDate);
			pstmt.setString(6, cabNo);
			count = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			System.out.println("Cab Booking for " + guestName 
					+ " done.\n");
			System.out.println("Booking Details :\nFrom : " 
					+ fromLocation + ",Destination: " + toLocation 
					+ "Booking Date : " + bookingDate + "Cab No : " + cabNo + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
