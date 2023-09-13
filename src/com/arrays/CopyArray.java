package com.arrays;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		
		 
		      int arr[] = {10, 20, 30, 40, 50};
		      
		      
		      int newArr[] = arr;
		      
		      
		      System.out.println("Original Array = " 
		                        + Arrays.toString(arr));
		      
		      System.out.println(arr);
		      
		      System.out.println("Copied Array = " 
		                        + Arrays.toString(newArr));
	}

}
