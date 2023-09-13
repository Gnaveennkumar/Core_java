package com.object;

public class Driver3 {
	public static void main(String[] args) {
		Driver3 d = new Driver3();

		Doctor d1 = new Doctor();
		d1.name = "Rathod";
		d1.age = 21;
		d.print(d1);
	}

	void print(Doctor d) {
		System.out.println(d.name + " " + d.age);

	}
}
