package com.arrays;

import java.util.Arrays;

public class Mergesort {
	public static void main(String[] args) {
		
	
	 
    int arr1[] = {10, 20, 30, 40, 50};
    int arr2[] = {9, 18, 27, 36, 45};
    
   
    int newArray[] = new int[arr1.length + arr2.length];
    
    
    System.arraycopy(arr1, 0, newArray, 0, arr1.length);
    
    
    System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
    
    Arrays.sort(newArray);
    
   
    System.out.println("Array1 = " + Arrays.toString(arr1));
    System.out.println("Array2 = " + Arrays.toString(arr2));
    System.out.println("Merged Array = " 
                           + Arrays.toString(newArray));
 }


}
