package com.object;

public class Driver4 {
	public static void main(String[] args) {
		Driver4 d = new Driver4();
		Player p = new Player();
		p.id = 7881;
		p.name = "Naveen";
		p.age = 26;
		d.print(p);
	}

	void print(Player p) {
		System.out.println(p.id +"--"+ p.name+" "+p.age);
	}

}
