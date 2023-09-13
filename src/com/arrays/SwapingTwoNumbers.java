package com.arrays;

public class SwapingTwoNumbers {
	public static void main(String[] args) {
		 int arr[] = { 10, 2, 3, -5, 99, 12, 0, -1 };
	      
	      
	      System.out.println("The array elements before swapping are-");
	      for (int i = 0;i<arr.length;i++) {
	         System.out.print(arr[i]+ " ");
	      }
	      
	     
	      int firstIndex = 2;
	    	int	secondIndex = 4;
	         
	      int temp = arr[firstIndex];
	    
	      arr[firstIndex] = arr[secondIndex];
	      
	      arr[secondIndex] = temp;
	           
	      System.out.println("\nThe array elements after swapping are-");
	      
	      for (int i = 0;i<arr.length;i++) {
	         System.out.print(arr[i]+ " ");
	      }
	}

}
