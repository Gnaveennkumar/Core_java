package com.arrays;

public class EvenAndOdd {
	public static void main(String[] args) {
		  int[] arr = {23, 93, 56, 92, 39};
	      System.out.println("Even numbers in the given array are:: ");

	      for (int i=0; i<arr.length; i++){
	         if(arr[i]%2 == 0){
	            System.out.println(arr[i]);
	         }
	      }
	      System.out.println("Odd numbers in the given array are:: ");

	      for (int i=0; i<arr.length; i++){
	         if(arr[i]%2 != 0){
	            System.out.println(arr[i]);
	         }
	      }
	   }
	
	}


