package com.velocity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Quiz {

	PreparedStatement ps = null;
	PreparedStatement ps1 = null;
	Connection connection = null;
	
	int correct = 0;
	int incorrect = 0;
	String Grade;
	int score = 0;
	

	public void getQuiz()
	{
		Scanner sc = new Scanner(System.in);
        
		try {
			GetConnection connectionProvider = new GetConnection();
			connection = connectionProvider.connection();
	
			Statement st1 = connection.createStatement();
			
			System.out.println("Please Enter Your ID : ");
			int id = sc.nextInt();
			
	        ResultSet rs2 = st1.executeQuery("SELECT * FROM student WHERE Id='" + id + "'");

	        // Check if a match was found
	        if (rs2.next()) {
	            System.out.println("Welcome, " + rs2.getString(2) + "!");
	            
	            ps = connection.prepareStatement("select * from questionlist order by RAND()");
				ResultSet rs = ps.executeQuery();
				
				
				System.out.println("\n");
				
				while (rs.next()) {
					
					System.out.println(rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n"+rs.getString(6)+"\n");
					String ans = sc.next();
					
					Statement stmt = connection.createStatement();

		            // Execute the query
		            ResultSet rs1 = stmt.executeQuery("SELECT * FROM questionlist WHERE Answer='" + ans + "' AND question='" +rs.getString(2)+ "'");

		            // Check if a match was found
		            if (rs1.next()) {
		            	System.out.println("Your Answer is Correct...!!!\n");
		                correct++;
		            } else {
		            	System.out.println("Your Answer is Incorrect...!!!\n");
		                incorrect++;
		            }
		            
				}
				System.out.println("Your Score is : "+correct);
				
				if (correct >= 8) {
					Grade = "A";
					System.out.println("Your Grade is : "+Grade);
				}else if(correct < 8 && correct >= 6) {
					Grade = "B";
					System.out.println("Your Grade is : "+Grade);
				}else if(correct < 6 && correct >= 5) {
					Grade = "C";
					System.out.println("Your Grade is : "+Grade);
				}else if(correct < 5) {
					Grade = "D";
					System.out.println("Your Grade is : "+Grade);
				}
				
				PreparedStatement stmt1 = connection.prepareStatement("update student set Score = ?, Grade= ? where Id='" +id + "'");
				stmt1.setInt(1, correct);
				stmt1.setString(2, Grade);
				
				int j = stmt1.executeUpdate();
	        } 
	        else {
                System.out.println("Invalid ID");
            }
		}catch (Exception e) {
				e.printStackTrace();
		}
		finally {
			try {
					connection.close();
					ps.close();
					sc.close();
			} catch (Exception e) {
					e.printStackTrace();
			}
		}

	}

	public void viewScore()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id : ");
		int id = sc.nextInt();
		
		try {
			GetConnection connectionProvider = new GetConnection();
			connection = connectionProvider.connection();
			
			ps = connection.prepareStatement("select * from student where Id = " +id);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("Id      Name       Address      Score      Grade");
				System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"       "+rs.getString(3)+"        "+rs.getInt(4)+"            "+rs.getString(5));	
			}
			else
			{
				System.out.println("Sorry Id is not available...!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void viewRank()
	{
		
	}
}