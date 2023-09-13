package com.arrays;

public class EvenAndOddSeperate {
	public static void main(String[] args) {
		
		 
	      
	      int arr[] = { 21, 53, 99, 9, 67, 66, 2, 91 };
	    
	      System.out.println("Even numbers are:");
	      
	      for(int i=0; i<arr.length; i++){
	         if(arr[i]%2==0){
	         
	            
	            System.out.print(arr[i]+" ");
	         }
	      }
	      
	      
	      System.out.println("\nOdd numbers are:");
	      
	      for(int i=0; i<arr.length; i++){
	         if(arr[i]%2==1){
	         
	           
	            System.out.print(arr[i]+" ");
	         }
	      }
	   }
}
