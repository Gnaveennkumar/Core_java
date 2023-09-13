package com.navi.assignments;

import java.util.Scanner;

public class Prime {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the  positive number");
		
	  int number= input.nextInt();
	  
	  boolean isprime = true;
	   if(number == 0||number==1) {
		   isprime=false;
	   }
	  for(int i=2;i<=number;i++) {
		  if(number%i == 0) {
			  isprime = false;
			  break;
		  }
	  }
		
		if(isprime) {
			
			System.out.println(number+" "+"is a primenumber");
			
		}
		else {
			System.out.println(number+""+"is not a primenumber");
		}
		
		
	}

}
 