package com.ninja.training;

import java.util.Arrays;

public class Pet_Array {

	public static void main(String[] args) {
	  int noOfLimbs[] = {0,2,3,4,4};
	  String[] petAnimal = {"Fish","Parrot","Bunny","Cat","Dog"};
	  int petWeight[] = {200,750,3500,5000,10000};
	  String[] petArrayName= {"Baby Shark","Evergreen","Hoppity","Meow","Spot"};
	  int index = Arrays.binarySearch(petAnimal, "Bunny");
	  System.out.println("The index is" +index);
	  int bunnyWeight = petWeight[index];
	  System.out.println("The weight of bunny is:"+bunnyWeight);
	  
	  for(int position=0; position<petArrayName.length; position++) {
		  System.out.println("The animal at " +position + " position is: "+petArrayName[position]);
		}//end of For
	  for(String eachPetName:petAnimal) {
		 
		  System.out.println("The pet Names are: "+eachPetName);
	  }//end of For each
	  

	}//end of main

}//end of class
