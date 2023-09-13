package com.arrays;

public class FindIndex {
	public static void main(String[] args) {
		int arr[] = {7,8,9,24,15,16};
		int element =24;
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == element) {
				index = i;
			break;	
			}
		}
			System.out.println("element of 24located at :" +index +"index");
			}
			}
	


