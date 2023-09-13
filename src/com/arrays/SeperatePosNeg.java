package com.arrays;

//import java.util.Arrays;

public class SeperatePosNeg {
	public static void main(String[] args) {

		int arr[] = {24,-9,-8,8,-2,28,-27};
		
		System.out.println("positive are:");
	       
	      for(int i=0; i<arr.length; i++){
	    	  
	         if(arr[i]>0){
	                 
	            System.out.print(arr[i]+" ");
	         }
	      }
	      
	      
	      System.out.println("\n negatvie numbers are:");
	      
	      for(int i=0; i<arr.length; i++){
	         if(arr[i]<1){
	         
	            
	            System.out.print(arr[i]+" ");
	         }
	      }
	   }
}

