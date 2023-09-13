package com.navi.assignments;

public class Pattern9 {

	public static void main(String[] args) {
		
		int end = 5;
		int alpha = 65;
		
		for(int i = 1 ; i <= end ; i++) {
			
			for(int j=i;j<end;j++) {
				
				System.out.print(" ");
			}
			//for(int k = 0; k <= i ; k++) {
			for(int k = i; k > 0 ; k--) {
				
					
				//System.out.print((char)('E'-k)+" ");
				System.out.print((char)(alpha+end-k)+" ");
			}
			  System.out.println();
		}

	}

}
