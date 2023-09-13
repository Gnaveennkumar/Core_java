package com.arrays;

import java.util.Arrays;

    public class SmallestNumber {
	
        public static void main(String[] args) {
        	
	int [] arr= {3,5,9,16,21,2,17,14,89};
	
	int temp=0;
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				 
			}
		}
	}
	System.out.println(Arrays.toString(arr));
    System.out.println(" Smallest Number is:"+arr[arr.length-1]);

}

}

