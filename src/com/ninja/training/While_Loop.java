package com.ninja.training;
import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int attemptCount=1;
		System.out.println("You have 3 attempts to try"); 
		
		while(attemptCount<=3){
			System.out.println("Enter First attempt:"+attemptCount); 
			int noOfLegs = input.nextInt();
			
			switch(noOfLegs) {
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
			
		}//end of while
	
		System.out.println("Maximum attempts done!Bbye"); 
		input.close();

	}//end of main 

}//end of class
