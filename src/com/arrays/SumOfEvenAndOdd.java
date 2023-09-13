package com.arrays;

public class SumOfEvenAndOdd {
	
		public static void main(String args[]){
			
		int arr[]={12,43,57,66,69,84};
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0; i<arr.length; i++){
			
		if(arr[i]%2==0){
			
		evenSum=evenSum+arr[i];
		}
		else{
		oddSum=oddSum+arr[i];
		}

		}
		System.out.println("Sum of even is: "+evenSum);
		System.out.println("Sum of odd is: "+oddSum);
		}

		}


