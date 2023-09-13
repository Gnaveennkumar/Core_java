package com.navi.assignments;

public class Pattern11 {

	public static void main(String[] args) {

		int size = 5;

		for (int i = 1; i <= size; i++) {

			for (int j = i; j < size; j++) {
				System.out.print(" ");
			}
			for (int k = i; k > 0; k--) {

				System.out.print(k+ " ");
			}
			System.out.println();
		}

	}

}
