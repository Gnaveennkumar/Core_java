package com.arrays;

public class CumulativeSum {
	
	public static void main(String[] args) { 
		
		int arr[] = {2,8,27,19,10};
		
		int sum =0;
		
		for(int i =0;i<arr.length;i++) {
			
			sum = sum +arr[i];
		}
		
	System.out.println("Sum of arr is: " + sum);
}
}