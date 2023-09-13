package com.navi.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marriage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(isr);
		
		System.out.println("Enter Your Age");
		String str1 = br.readLine ( );
		int age = Integer.parseInt ( str1 );

		System.out.println("Enter Your Salary");
		String str2 = br.readLine ( );
		double salary = Double.parseDouble(str2);

		if ( age < 30 && salary > 100000 ) {
				System.out.println("You are eligible for marriage");
		} else {
				System.out.println("You are not eligible for marriage");
		}
   }


	}


