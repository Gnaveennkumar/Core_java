package com.arrays;

public class SumMatchingPairs {

	public static void main(String[] args) {

		int arr[] = { 8, 5, 1, 6, 2, 7, 9 };

		int sum = 9;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] + arr[j] == sum) {
					
					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
				}
			}
		}
	}
}



