package com.packtpub.designpatterns.creational;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	static String userName = "root";
	static String password = "root";
	static String dbUrl = "jdbc:mysql://localhost:3306/packtpubdb?autoReconnect=true&useSSL=false";
	private static volatile ConnectionManager connectionManager =null;
	
	private ConnectionManager() {}
	
	public static ConnectionManager getInstance() {
		if( connectionManager == null) {
			synchronized(ConnectionManager.class) {
				if( connectionManager == null) {
					connectionManager = new ConnectionManager();
				}
			}
		}
		return connectionManager;
	}
	
	public Connection getConnection() {
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(dbUrl, userName, password);
		}catch(SQLException e) {
			System.err.println(e.getMessage());
		}
		return cn;
	}
}
