package com.object;

public class Test {

	public static void main(String[] args) {
		Test d = new Test(); // obj creation

		int x = d.add(10, 20); // calling the method
		System.out.println(x); // printing the output
	}

	// instance method
	int add(int a, int b) {
		int c = a + b;
		return c;
	}
}
