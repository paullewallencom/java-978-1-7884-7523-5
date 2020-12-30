package com.packtpub.designpatterns.structural;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.UUID;

import com.packtpub.designpatterns.creational.ConnectionManager;

public class HotelBooking {
	ConnectionManager instance = null;
	
	public HotelBooking() {
		instance = ConnectionManager.getInstance();
	}
	
	public int BookHotel(String guestName,Date fromDate, Date toDate, 
			String hotelName) {
		int count = 0;
		try {
			String bookingId = UUID.randomUUID().toString();
			Connection conn = instance.getConnection();
			String sql = "insert into HotelBooking values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookingId);
			pstmt.setString(2, guestName);
			pstmt.setDate(3, fromDate);
			pstmt.setDate(4, toDate);
			pstmt.setString(5, hotelName);
			count = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			System.out.println("Hotel Booking for " + guestName 
					+ " done.\n");
			System.out.println("Booking Details :\nHotel Name : " 
					+ hotelName + ",From Date: " + fromDate 
					+ "To Date : " + toDate + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
