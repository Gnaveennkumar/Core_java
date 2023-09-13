package com.object;

public class Driver1 {
	public static void main(String[] args) {
		Driver1 d = new Driver1();

		Employee e = new Employee();
		e.id = 101;
		e.salary = 15000.00;

		d.print(e);
	}

	void print(Employee e) {
		System.out.println(e.id + "--" + e.salary);
	}

}
