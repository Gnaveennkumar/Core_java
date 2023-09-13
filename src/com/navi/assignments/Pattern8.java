package com.navi.assignments;

public class Pattern8 {

	public static void main(String[] args) {
		
		int end = 5;
		
		for(int i = 1 ; i <= end ; i++) {
			
			for(int j=i;j<end;j++) {
				
				System.out.print(" ");
			}
			for(int k = 1; k <= i ; k++) {
				
					
				System.out.print(k+" ");
			}
			  System.out.println();
		}

	}

}
