package com.arrays;

public class CountPosNegZero {
	
	public static void main(String[] args) {
		
	  int[] arr = {-1, 2, 0, 10, -4, 2, 5, -5};
	  
      int positive = 0;
      int negative = 0;
      int zero  = 0;
      
      for (int i : arr) {
         if (i < 0) {
            negative++;
         } else if (i == 0) {
            zero++;
         } else {
            positive++;
         }
      }
      System.out.println("positives: " + positive);
      System.out.println("negatives: " + negative);
      System.out.println("zeros: " + zero);
 
   }
}


