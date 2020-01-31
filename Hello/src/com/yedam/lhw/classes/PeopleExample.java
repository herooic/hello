package com.yedam.lhw.classes;

public class PeopleExample {

	public static void main(String[] args) {

		People p3 = new People ("lee", "대구시", "잘생겼다", 67);
		System.out.println(p3.name);
		System.out.println(p3.address);
		System.out.println(p3.face);
		System.out.println(p3.weight);
	
	
		  
		People pl = new People();

	    pl.name = "kim";
		pl.age = 31;
		pl.height = 188;
		pl.weight = 90;

		System.out.println(pl.name);
		System.out.println(pl.age);
		System.out.println(pl.height);
		System.out.println(pl.weight);
		
		
		pl.getheight();
		pl.face();
		pl.getweight();
		// System.out.println(pl.getAge());

//		Student p2 = new Student();
//  
//		p2.name = "park";
//		p2.age = 31;
//		p2.height = 172;
//		p2.weight = 86;
//
//		System.out.println(pl.name);
//		System.out.println(pl.age);		
//		System.out.println(pl.height);
//		System.out.println(pl.weight);
//		pl.getheight();
//		pl.face();
//		pl.getweight();
//		// System.out.println(pl.getAge());
//
//	}

	
	
}
}