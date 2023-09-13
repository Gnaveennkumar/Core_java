package com.arrays;

public class Palindrome {
	public static void main(String[] args) {
		   int arr[] = { 1, 2, 3, 2, 1 };
	        int n = arr.length;
		int temp = 0;
		 
       
        for (int i = 0; i <= n / 2 && n != 0; i++) {
 
            
            if (arr[i] != arr[n - i - 1]) {
                temp = 1;
                break;
            }
        }
 
        
        if (temp == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }
 
    

}
