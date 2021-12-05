package com.ninja.training;

import java.util.Scanner;

public class Loops_Demo {
	public static void for_Loop(){
		System.out.println("<!!!!-For Loop-!!!>");
		Scanner input = new Scanner(System.in);
		
	for(int attemptCount=1 ; attemptCount<=3 ; attemptCount++) {
	
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
		
	}//end of for
	
	System.out.println("You passed maximum for_Loop attempts.bbye!");
	}//end of forLoop method
	
	public static void While_Loop() {
		Scanner input = new Scanner(System.in);
		int attemptCount=1;
		System.out.println("<!!!- While Loop -!!!"); 
		
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
	
		System.out.println("Maximum attempts  for While_Loop done!Bbye"); 
		
	}//end of While Loop
	public static void DoWhile_Loop() {
		Scanner input = new Scanner(System.in);
		System.out.println("<!!! - Do While Loop -!!!");
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
			
		}while(attemptCount<=3);//end of do while
	     System.out.println("Done with maximum attempts in all the loops");
		input.close();
	}
	  
	      

	public static void main(String[] args) {
		for_Loop();
		While_Loop();
		DoWhile_Loop();
		
	 }//end of main

}//end of class
