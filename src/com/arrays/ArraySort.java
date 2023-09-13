package com.arrays;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
	
		int arr[] = {5,7,9,27,28,4,23};
		
		Arrays.sort(arr);
		System.out.println("Ascending :" + Arrays.toString(arr));
		     
	        int temp = 0;    
	             
	        for (int i = 0; i < arr.length; i++) {     
	        	 for (int j = i+1; j < arr.length; j++) {     
	                 if(arr[i] < arr[j]) {    
	                     temp = arr[i];    
	                     arr[i] = arr[j];    
	                     arr[j] = temp;    
	                 }     
	              }     
	          }    
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	      }    
	}
	}


