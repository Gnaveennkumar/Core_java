package com.arrays;

public class FindGreaterNo {
	public static void main(String[] args) {
		
	
	int arr[] = {2,8,7,9,20,26,28};
	
	int num = 20;

	System.out.println("numbers :" );
	for(int i = 0;i<arr.length;i++) {
		if(arr[i]>num) {
			System.out.println(arr[i] + " ");
		}
	}
	
	}
}

