package com.yedam.lhw.classes.abstractPkg;

public class Dog extends Animal{

	Dog() {
		kind = " 포유류";

	}

	@Override
	void sound() {
		System.out.println(kind + " 왈왈!! " );

	}

	@Override
	void sleep() {
		System.out.println("강아지가 잔당 ~");
		// TODO Auto-generated method stub
		
	}

}
