package com.ninja.training;
import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int attemptCount=1 ; attemptCount<5 ; attemptCount++) {
			System.out.println("Attempt:"+attemptCount);
			System.out.println("Enter the number to know the pet:");
			int noOfLegs = input.nextInt();
			switch(noOfLegs) {
			case(0):
			System.out.println("The pet is fish");
			break;
			case(2):
			System.out.println("The pet is PArrot.");
			break;
			case(3):
			System.out.println("The pet is Bunny");
			break;
			case 4:
			System.out.println("The pet is Dog or Cat");
			break;
			default:
			System.out.println("Invalid entry");	
			
			}//end of switch
		
			
		}//endof for
		
       input.close();
       System.out.println("You passed maximum attempts.bbye!");
	}//end of main

}//end of class
