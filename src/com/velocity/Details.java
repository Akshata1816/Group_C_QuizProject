package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Details {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
			Statement st=con.createStatement();
			System.out.println("Connection successful..");
			con.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

