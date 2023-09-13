package com.arrays;



import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
			int[] arr = {23,45,23,76,87,9,48,9,5};
			
			Arrays.sort(arr);
			
		        int target = 91;
		        int first = 0;
		        int last = arr.length - 1;
		        int found = 0;
		        
		        while (first <= last) {
		            int mid = (first + last) / 2;
		            
		            if (arr[mid] == target) {
		                System.out.println(mid);
		                found = 1;
		                break;
		            } else if (arr[mid] > target) {
		                last = mid - 1;
		            } else {
		                first = mid + 1;
		            }
		        }
		        
		         if ((found == 0) && (first > last))
		         {      	
		            System.out.println("the element" + target + "is not found.");
		 }
		        
	}
}
