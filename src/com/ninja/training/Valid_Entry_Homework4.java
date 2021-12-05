package com.ninja.training;
import java.util.Scanner;

public class Valid_Entry_Homework4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int entry = input.nextInt();
		switch(entry) {
		case 1:
			System.out.println("The movie for your choice is: Harry Potter and Philospher's Stone");  
			break;
		case 2:
			System.out.println("The movie for your choice is: Harry Potter and the chamber of Secrets");
			break;
		case 3:
			System.out.println("The movie for your choice is: Harry Potter and The Prisoner of Azkaban");
			break;
		case 4:
			System.out.println("The movie for your choice is: Harry Potter and The Goblet of Fire");
			break;
		case 5:
			System.out.println("The movie for your choice is: Harry Potter and the Order of Phoenix");
			break;
		case 6:
			System.out.println("The movie for your choice is: Harry Potter and The Half Blood Prince");
			break;
		case 7:
			System.out.println("The movie for your choice is: Harry Potter and The Dealthy Hallows-Part 1");	
			break;
		case 8:
			System.out.println("The movie for your choice is: Harry Potter and The Dealthy Hallows-Part 2");	
			break;
		default:
			System.out.println("No Movie Found!");
		
		}
		
	}

}
