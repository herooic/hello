package com.yedam.lhw.classes.extendpkg;

public class ExtendExample {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.field1 = "ooo";
		p1.method1();
		
		Child c1 = new Child ();
		c1.field1 = "ooo";
		c1.field2 = "ooo";
		c1.method1();
		c1.method2();
	
	} 
}
