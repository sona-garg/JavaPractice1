package com.ninja.training;
import java.util.Scanner;
public class ForNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int maxAttempts = 3; 
		System.out.println("\n\n FOR LOOP");
		
		// Using Scanner for Getting Input from User
		Scanner input = new Scanner(System.in);
		for (int attemptCount = 1; attemptCount <= 3; attemptCount++) {
		
		System.out.println("\n Attempt # = " + attemptCount);
		
		System.out.println("Enter the number of limbs and I will guess your pet (0-4) : ");
		int noOfLegs = input.nextInt();
		switch (noOfLegs) {
		case 0:
		System.out.println("Let me Guess! You have A pet Fish!");
		break;
		case 2:
		System.out.println("Let me Guess! You have A pet Parrot!");
		break;
		case 3:
		System.out.println("Let me Guess! You have A pet Bunny!");
		break;
		case 4:
		System.out.println("Let me Guess! You have A pet Dog or Cat!");
		break;
		default:
		System.out.println("Let me Guess! I think You DO NOT have A pet!");
		
		} // End of Switch
		} // End of For Loop
		input.close();
		//System.out.println("You have completed Max attempts : " + maxAttempts);


	}

}
