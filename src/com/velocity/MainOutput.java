package com.velocity;

import java.util.Scanner;

public class MainOutput {

	public static void main(String[] args) {
		
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
	sc.close();
	}

}


