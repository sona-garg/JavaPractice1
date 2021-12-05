package com.ninja.training;

public class Operations_Homework5 {

	public static void main(String[] args) {
		int releaseYear[] = {2001,2002,2004,2005,2007,2009,2010,2011};
		int years = 0;
		int yearElasped = releaseYear[7] - releaseYear[0];
		System.out.println("The difference between first and last year of release is:" +yearElasped);
		double approxYears =(releaseYear[7] - releaseYear[0])/8.0;
		System.out.println("The avaerage year of movie release is:"+approxYears );
		System.out.println(releaseYear.length);


	}

}
