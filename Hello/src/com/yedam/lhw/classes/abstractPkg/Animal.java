package com.yedam.lhw.classes.abstractPkg;

public abstract class Animal {
	// 필드
	String kind;

	// 기본 생성자 존재

	// 메소드
	void breathe() {
		System.out.println("  숨을 쉽니다.");
	}

	// 추상 메소드
	abstract void sound();
	abstract void sleep();
	
}// class
