package com.arrays;

public class SumOfPos {
	public static void main(String[] args) {
		
		int arr[] = {4,8,6,-1,-7,-9,5};
		int t = 0;
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>0) {
				//arr[i] = t;
				t = t+arr[i];
			}	
			}
			System.out.println("Sum of even is: "+t);
			
		
	}

}
