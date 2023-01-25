package com.velocity;

import java.util.Scanner;

public class MainOutput {

	public static void main(String[] args) {

		QuizInterface quiz = new QuizImplementation();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WECOME TO CORE JAVA QUIZ\n");
		
		while(true) {
		
			//MENUS 1.New User , 2. Existing user login , 3. Attempt quiz , 4.Your ScoreCard , 5.Student List sorted,  6. Exit
			
			System.out.println("1. New User??? Please Sign-in!!!" +"\n2.Existing User??? Please Login and Enjoy the Quiz "+"\n3.Exit");
			
			System.out.println("\nEnter your Choice---->");
			int ch = sc.nextInt();
	
			switch(ch) {
			
			case 1 :
				System.out.println("Add Your Details: ");
				
				System.out.println("Enter your Name : ");
				String name= sc.next();
				System.out.println("Enter your City : ");
				String city= sc.next();
				System.out.println("Enter your UserName : ");
				String username= sc.next();
				System.out.println("Enter your Password : ");
				String password = sc.next();
				StudentDetails details = new StudentDetails(name,city,username,password);
				boolean output = quiz.addStudent(details);
					
				if(output){
						System.out.println("\nSign-up Successful\n");
					}else {
							System.out.println("Something went Wrong..!! Please Try Again..");
						}
						break;
			case 2:
				QuizImplementation q = new QuizImplementation();
				q.studentLogin() ;
				System.out.println("Login Successful...");
				break;
						
			case 3 :
				System.out.println("Thank you for being part of this amazing quiz...... see you soon!!");
				System.exit(0);
				
				default:
					System.out.println("Oops... You have entered a wrong input. please try again\n\n");
					 
				
				
		
		}
		
		}
		}

	}


