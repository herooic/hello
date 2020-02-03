package com.yedam.lhw.classes.extendpkg;

public class Parent {
	String field1;

	void method1() {
		System.out.println("부모의 클래스의 매소드 1");

	}

	@Override
	public String toString() {
		return "Parent [field1=" + field1 + "]";
	}

}
