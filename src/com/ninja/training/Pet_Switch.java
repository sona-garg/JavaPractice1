package com.ninja.training;
import java.util.Scanner;

public class Pet_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of limbs:");
		int noOfLegs=input.nextInt();
		input.close();
		switch(noOfLegs){
			case 0:
				System.out.println("The animal is Fish");
				break;
			case 2:
				System.out.println("The animal is Parrot");
				break;
			case 3:
				System.out.println("The animal is Bunny");
				break;
			case 4:
				System.out.println("The animal is dog or cat");
				break;
			default:
				System.out.println("The input is inavlid");
				
				
		}
		
	}

}
