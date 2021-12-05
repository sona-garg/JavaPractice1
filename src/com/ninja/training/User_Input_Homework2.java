package com.ninja.training;
import java.util.Scanner;

public class User_Input_Homework2 {

	public static void main(String[] args) {
		 
		   Scanner input = new Scanner(System.in);
		   String customerArray[] = new String[5];
		   int x=1;
		   System.out.println("You can enter 5 entries:");
		   for (int userInput=0;userInput<5;++userInput) {
			   
			   
			   System.out.println("Enter number "+x+" entry:");
			     customerArray[userInput] = input.next();
			     x++;
			     
			   }//end of for
		   for (String entry:customerArray) {
			   System.out.println("The enteries are:"+entry);
			   
			   
		   }//end of second for to print the user entries
		   
		   
		   input.close();
		   

	}//end of main

}//end of class
