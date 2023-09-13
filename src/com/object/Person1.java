package com.object;

public class Person1 {
	
		int id;
		String name;

		Person1[] m2() {

			Person1 p1 = new Person1();
			p1.id = 101;
			p1.name = "Raju";

			Person1 p2 = new Person1();
			p2.id = 102;
			p2.name = "Rani";

			Person1 p3 = new Person1();
			p3.id = 103;
			p3.name = "Anil";

			Person1[] arr = { p1, p2, p3 };

			return arr;

		}

		void m1(Person1 p1, Person1 p2) {
			System.out.println(p1.id + "--" + p1.name);
			System.out.println(p2.id + "--" + p2.name);
		}

		public static void main(String[] args) {
			Person1 p = new Person1(); // obj1 created

			Person1 p1 = new Person1(); // obj2 created
			p1.id = 101;
			p1.name = "Raju";

			Person1 p2 = new Person1(); // obj3 created
			p2.id = 102;
			p2.name = "Rani";

			p.m1(p1, p2);

			Person1[] arr = p.m2();

			for (Person1 person1 : arr) {
				System.out.println(person1.id + "--" + person1.name);
			}

		}
	}



