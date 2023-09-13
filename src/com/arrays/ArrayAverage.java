package com.arrays;

public class ArrayAverage {
	public static void main(String[] args) {
		
			    double array[] = {10, 20, 30, 40, 50};
			    
			   double sum = 0.0;
			   
			    double avg = 0.0;

			    for (int i=0; i<array.length; i++) {
			     
			      sum = sum + array[i];
			    }

			  
			    avg = sum/array.length;

			   
			    System.out.println("Average: " + avg );
			    System.out.println("numbers:");
			    
		 for(int i =0 ;i<array.length;i++)
	      if(array[i]>avg) {
	    	  System.out.println(array[i] + " " );
		}
	}

}
