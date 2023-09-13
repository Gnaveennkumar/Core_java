package com.arrays;

public class EvenPostion {
	public static void main(String[] args) {
		
		      int num[] = {12, 5 , 77, 14, 91, 21, 1};
		      System.out.println("Even position of elements present in an array are: ");
		      
		      for (int i = 2; i < num.length; i = i+2){  
		         System.out.print(num[i]+" ");  
		      }  
	}
}
