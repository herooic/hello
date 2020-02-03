package com.yedam.lhw.classes.extendpkg;

public class Child extends Parent {

	String field2;

	@Override
	void method1() {
		super.method1();
		System.out.println("자식클래스의 매소드 1");

	}

	void method2() {
		System.out.println("자식클래스의 메소드2 ");
	}

	@Override
	public String toString() {
		return "Child [field2=" + field2 + "]";
	}

}
