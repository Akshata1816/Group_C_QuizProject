package com.velocity;

import java.util.Scanner;

public class MainOutput {

	public static void main(String[] args) {

		/*QuizInterface quiz = new QuizImplementation();
		
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
*/	
		
		int choice;
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		
		System.out.println("!!!........Welcome to Quiz Application........!!!");
		
		do {
			System.out.println("\n-------------------------------------------");
			System.out.println("Select Choice");
			System.out.println("1. New Student");
			System.out.println("2. Attempt Quiz");
			System.out.println("3. View Your Score");
			System.out.println("4. View Your Rank");
			System.out.println("5. Exit");
			System.out.println("-------------------------------------------");
			System.out.println();
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				quiz.addNewStudent();
				break;
			case 2:
				quiz.getQuiz();
				break;
			case 3:
				quiz.viewScore();
				break;
			case 4:
				quiz.viewRank();
				break;
			case 5:
				System.out.println("-------------------------------------------");
				System.out.println("!!!.......Thank You......!!!");
				System.out.println("-------------------------------------------");
				break;
			default:
				System.out.println("Invalid Choice...!!!");
			}
		} while (choice!=5);
	
	}

}


