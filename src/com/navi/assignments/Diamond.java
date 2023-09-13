package com.navi.assignments;

public class Diamond {

	public static void main(String[] args) {
		
		int size = 5;
	    // upper pyramid
	    for (int i = 1; i <= size; i++) {
	      // print spaces
	      for (int k = size; k > i; k--) {
	        System.out.print(" ");
	      }
	      // print star
	      for (int j = 0; j < i * 2 - 1; j++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    // lower pyramid
	    for (int i = 1; i <= size - 1; i++) {
		      // print spaces
		      for (int k = 0; k < i; k++) {
		        System.out.print(" ");
		      }
		      // print star
		      for (int j = (size - i) * 2 - 1; j > 0; j--) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }




	}
}
