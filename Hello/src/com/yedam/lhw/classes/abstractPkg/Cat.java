package com.yedam.lhw.classes.abstractPkg;

public class Cat extends Animal {
	Cat() {
		kind = " 포유류";

	}

	@Override
	void sound() {
		System.out.println(kind + " 야옹 ~");

	}

	@Override
	void sleep() {
		
		System.out.println("고양이가 잔당");
		// TODO Auto-generated method stub
		
	}

}
