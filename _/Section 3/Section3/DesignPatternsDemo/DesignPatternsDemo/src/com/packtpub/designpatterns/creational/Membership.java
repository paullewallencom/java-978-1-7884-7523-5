package com.packtpub.designpatterns.creational;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public abstract class Membership implements Member {

	public String userId;
	public String userName;
	public java.util.Date startDate;
	public java.util.Date endDate;
	public Float discountPercentage;
	public String subscriptionType;
	
	@Override
	public abstract void registerMember(String uname);

	@Override
	public void showMember() {
		System.out.println("User Id : " + this.userId
				+ "\nUser name : " + this.userName 
				+ "\nSubscription Type :" + this.subscriptionType
				+ "\nMembership Start Date : " + this.startDate
				+ "\nMembership End Date :" + this.endDate
				+ "\nDiscount Percentage : " + this.discountPercentage
				);
	}
	
	public boolean AddMember(Membership member) {
		//Connection cn = new ConnectionManager().getConnection();
		ConnectionManager cm = ConnectionManager.getInstance();
		Connection cn = cm.getConnection();
		System.out.println("Object Hash :" + cm.hashCode());
		boolean flag = false;
		String sql = "insert into members values (?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = cn.prepareStatement(sql);
			pstmt.setString(1, member.userId);
			pstmt.setString(2, member.userName);
			pstmt.setDate(3, new Date(member.startDate.getTime()));
			pstmt.setDate(4, new Date(member.endDate.getTime()));
			pstmt.setFloat(5, member.discountPercentage);
			pstmt.setString(6, member.subscriptionType);
			int result = pstmt.executeUpdate();
			if( result > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
