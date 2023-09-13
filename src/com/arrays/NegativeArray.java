package com.arrays;

public class NegativeArray {
	public static void main(String[] args) {
		

		int arr[] = {24,-9,-8,8,-2,28,-27};
		int i = 0;
	
		while(i < arr.length) 
		{
			if(arr[i] < 0) {
				System.out.println("List of Negative Numbers in NEG Array : " + arr[i]);
      }
			i++;
			}
		}
}

