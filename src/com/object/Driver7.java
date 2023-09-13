package com.object;

public class Driver7 {
	public static void main(String[] args) {
		Driver7 d = new Driver7();

		// read id from keyboard

		Person person = d.m1(101);
		System.out.println(person.id + "--" + person.name);
	}

	Person m1(int id) {
		Person p = new Person();
		if (id == 101) {
			p.id = 101;
			p.name = "Raju";
			p.age = 30;
		} else if (id == 102) {
			p.id = 102;
			p.name = "Rani";
			p.age = 32;
		}
		return p;
	}
}
