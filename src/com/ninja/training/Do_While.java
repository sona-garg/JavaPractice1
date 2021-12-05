package com.ninja.training;
import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("You have 3 attempts:");
		int attemptCount=1;
		do {
			
			
			System.out.println("Enter attempt:"+attemptCount);
			int noOfLimbs = input.nextInt();
			switch(noOfLimbs) {
			case 0:
				System.out.println("The animal is fish");
				break;		
			case 2:
				System.out.println("The animal is Parrot");
				break;	
			case 3:
				System.out.println("The animal is Bunny");
				break;	
			case 4:
				System.out.println("The animal is Cat or Dog");
				break;	
			default:
				System.out.println("Invalid entry!");
				
			}//end of switch
			attemptCount++;
			
		}while(attemptCount<=3);//end of dowhile
	     System.out.println("Done with maximum attempts.");
		input.close();

	}//end of main

}//end of class
