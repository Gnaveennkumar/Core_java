package com.arrays;

import java.util.Arrays;

public class AddElement {
	public static void main(String[] args) {
		
		int arr1[] = {10,28,93,67,30};
		int arr2[] = new int[arr1.length + 1];
		
	int addElement = 77;
	
	System.out.println("arr1:" + Arrays.toString(arr1));
	
	for(int i = 0; i<arr1.length; i++) {
		arr2[i] = arr1[i];
	}
	arr2[arr1.length] = addElement;
	System.out.println("arr2:" + Arrays.toString(arr2));
	}
	} 