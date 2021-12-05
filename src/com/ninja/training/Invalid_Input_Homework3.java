package com.ninja.training;
import java.util.Scanner;

public class Invalid_Input_Homework3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 for(int i=1;i<=4;i++) {
			
		System.out.println("You have 4 attempts.Enter your choice: "+i);
		int entry = input.nextInt();
		if (entry ==1 || entry==2 || entry == 3 || entry==4 || entry ==5 || entry ==6 || entry == 7|| entry == 8)
		{
			switch(entry) {
			case 1:
				System.out.println("Harry Potter and Philospher's Stone");  
				break;
			case 2:
				System.out.println("Harry Potter and the chamber of Secrets");
				break;
			case 3:
				System.out.println("Harry Potter and The Prisoner of Azkaban");
				break;
			case 4:
				System.out.println("Harry Potter and The Goblet of Fire");
				break;
			case 5:
				System.out.println("Harry Potter and the Order of Phoenix");
				break;
			case 6:
				System.out.println("Harry Potter and The Half Blood Prince");
				break;
			case 7:
				System.out.println("Harry Potter and The Dealthy Hallows-Part 1");	
				break;
			case 8:
				System.out.println("Harry Potter and The Dealthy Hallows-Part 2");	
				break;
			}//end of switch
		}//end of if
			else {
				System.out.println("Invalid entry!");
				break;
			
		}//end of else
		
		}// end of for
	input.close();
		
	}//end of main

}//end of class
