package com.arrays;

import java.util.Arrays;

public class MinAndMaxProgramme {
	
	public static void main(String[] args) {
		
		int[] arr = {15,7,9,3,27,26,6};
		
		System.out.println("Before sorting");
		
		for(int i = 0 ; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
			System.out.println();
			
		
		Arrays.sort(arr);
		
		System.out.println("After sorting");
		
	
	for(int i = 0;i<arr.length;i++) {
		
		System.out.print(arr[i]+" ");

	}
	System.out.println("Min element :" +arr[0]);
	System.out.println("max element :" +arr[arr.length-1]);
	
	System.out.println();
}

}
