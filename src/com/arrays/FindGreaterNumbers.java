package com.arrays;

import java.util.Arrays;

public class FindGreaterNumbers {
	public static void main(String[] args) {
		
	int arr[]= {2,56,78,45,24};
	int num = 50;
	int arr2[] = new int[arr.length];
	int j = 0;
	System.out.println("numbers: " );
	
	for(int i = 0;i<arr.length;i++)
	{
		if(arr[i]>num) {
			
			arr2[j] = arr[i];
			j++;
		}
	} 
	System.out.println(Arrays.toString(arr));

	for (int k = 0; k < j; k++) {
        System.out.print(arr2[k]+" ");
    }
	
	}
}
