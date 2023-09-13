package com.navi.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shoes {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Brand Name");
		String brand  = br.readLine();
		
		switch(brand) {
		
		case "Nike" :
			System.out.println("Just do it");
			break;
		case "Adidas" :
			System.out.println("Impossible is nothing");
			break;
		case "Puma" :
			System.out.println("Forever faster");
			break;
		case "Reebok" :
			System.out.println("I am what i am");
			break;
			default:
				System.out.println("Brand not found");
		}

	}

}
