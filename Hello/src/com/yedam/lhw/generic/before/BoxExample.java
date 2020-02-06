package com.yedam.lhw.generic.before;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box(); //
		box.set("hello");
		String str =(String) box.get();// 강제로 행변환 요청 
		
		Apple apple = new Apple ();
		
		box.set("apple");
//		Apple apple2 = (Apple ) box.get();
		String str2 = (String) box.get();
		
	
	}
}
