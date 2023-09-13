package com.object;

public class Driver2 {

	public static void main(String[] args) {
		Driver2 d = new Driver2();

		Product p = new Product();
		p.pid = 101;
		p.pname = "Mouse";
		p.price = 450.00;

		d.print(p);

	}

	void print(Product p) {
		System.out.println(p.pid + " " + p.pname + " " + p.price);
	}
}
