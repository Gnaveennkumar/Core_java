package com.arrays;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int arr[][] = { { 100, 200 }, { 300, 400 } };

		for (int[] ar : arr) {
			System.out.println(Arrays.toString(ar));
		}
	}
}


