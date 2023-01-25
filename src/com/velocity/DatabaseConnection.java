package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	
	static Connection connect;
	
	public static Connection getConnection() {
		
		try {
			//Load the driver and Get the Connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp","root","root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connect;
	}
	
}
