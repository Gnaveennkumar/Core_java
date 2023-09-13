package com.arrays;

public class MissingNumber {
	public static void main(String[] args) {
		
		
		   int[] arr = {1,3,4,6,7};
		  int n = arr.length;
		   int sum = n * ((n + 1) / 2);
		   int tem = 0;
		   for (int i:arr) {
		    tem+=i;
		   }
		       System.out.print(tem-sum);
			   System.out.print("\n");
		  }
		 }
	


