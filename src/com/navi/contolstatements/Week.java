package com.navi.contolstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(" Enter the day number " );
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String result      = br.readLine();
		
		int day = Integer.parseInt(result );
		
		switch(day) {
		
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
		    break;
		case 3:
			System.out.println("WEDNESDAY");
		    break;
		case 4:
			System.out.println("thursday");
		    break;
		case 5:
			System.out.println("friday");
		    break;
		case 6:
			System.out.println("saturday");
		    break;
		case 7:
			System.out.println("sunday");
		    break;
		    default:
		    	System.out.println("no day found");
			    
		}
	}

}
