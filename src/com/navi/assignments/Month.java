package com.navi.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(" Enter month number " );
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String result      = br.readLine();
		
		int month = Integer.parseInt(result );
		
		switch(month) {
		
		case 10:
			System.out.println("january");
			break;
		case 11:
			System.out.println("february");
		    break;
		case 12:
			System.out.println("march");
		    break;
		case 13:
			System.out.println("april");
		    break;
		case 14:
			System.out.println("may");
		    break;
		case 15:
			System.out.println("june");
		    break;
		case 16:
			System.out.println("july");
		    break;
		case 17:
			System.out.println("august");
		    break;
		case 18:
			System.out.println("september");
		    break;
		case 19:
			System.out.println("october");
		    break;
		case 20:
			System.out.println("november");
		    break;
		case 21:
			System.out.println("december");
		    break;
		    default:
		    	System.out.println("no month found");
			    
		}
	}

}
