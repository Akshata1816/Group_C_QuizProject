package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class QuizImplementation implements QuizInterface{

	//Implementation to ADD STUDENT
	@Override
	public boolean addStudent(StudentDetails s) {
		boolean flag = false;
		//Static class variable con
		try {
			Connection con = DatabaseConnection.getConnection();
			String query = "insert into student_record(Name, City, Username , Password) values (?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setString(3, s.getUsername());
			pst.setString(4, s.getPassword());
			pst.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	//IMPLMENTATION TO LOGIN FOR EXISTING STUDENT
	@Override
	public void studentLogin() {
	       Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();

	        try {
	          
	        	Connection con = DatabaseConnection.getConnection();
	            

	            // Create a statement
	            Statement stmt = con.createStatement();

	            // Execute the query
	            ResultSet rs = stmt.executeQuery("SELECT * FROM student_record WHERE username='" + username + "' AND password='" + password + "'");

	            // Check if a match was found
	            if (rs.next()) {
	                System.out.println("Welcome, " + rs.getString("Name") + "!");
	            } else {
	                System.out.println("Invalid username or password.");
	            }

	            // Close the connection
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	}
	

