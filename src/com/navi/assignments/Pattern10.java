package com.navi.assignments;

public class Pattern10 {

	public static void main(String[] args) {
		
		int size = 5;
		int alpha = 65;
		
		for(int i = 0 ; i <= size ; i++) {
			
			for(int j=i;j<size;j++) {
				
				System.out.print(" ");
			}
			for(int k = 0; k <= i ; k++) {
				
					
				System.out.print((char)(alpha+k)+" ");
			}
			  System.out.println();
		}

	}

}
