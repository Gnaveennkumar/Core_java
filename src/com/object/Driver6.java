package com.object;

public class Driver6 {
	College m1() {

		College c = new College();
		c.id = 101;
		c.name = "HITM";

		return c;
	}

	public static void main(String[] args) {
		Driver6 d = new Driver6();
		College c = d.m1();
		System.out.println(c.id + "--" + c.name);
	}

}



