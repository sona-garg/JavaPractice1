package com.ninja.training;

public class Movie_Array_Homework1 {

	public static void main(String[] args) {
	   int movieNumber[]= {1,2,3,4,5,6,7,8};
	   
	   int releaseYear[] = {2001,2002,2004,2005,2007,2009,2010,2011};
	   
	   String movieName[] = {"Harry Potter and Philospher's Stone","Harry Potter and the chamber of Secrets",
			   "Harry Potter and The Prisoner of Azkaban", "Harry Potter and The Goblet of Fire",
			   "Harry Potter and the Order of Phoenix","Harry Potter and The Half Blood Prince",
			   "Harry Potter and The Dealthy Hallows-Part 1","Harry Potter and The Dealthy Hallows-Part 2"};
	           //end of string array
	   
	   //For will print all the arrays at once
	   for (int number=0;number<movieNumber.length;number++) {
		   System.out.println("The movie at number "+movieNumber[number]+" is " +movieName[number]+
				   " which released in " +releaseYear[number]);
		   
		   }//end of for

	}//end of main

}//end of class
