package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnection {

	Connection con = null;
	public Connection connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	  }

	}


