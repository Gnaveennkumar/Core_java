package com.arrays;

public class MinAndMax {

	public static void main(String[] args) {

		int arr [ ] = { 7, 27, 6, 8, 14, 19, 2, 5 };

		int min = arr [0] ;
		int max = arr [0] ;

		for (int i = 0; i < arr.length; i++) {

			if ( arr [i] > max) {
				max = arr [i] ;
			}
			if ( arr [i] < min) {
				min = arr [i] ;
			}
		}
			System.out.println( "MIN ELEMENT :: " + min);

				System.out.println( "MAX ELEMENT :: " + max);
			}
		}
	

