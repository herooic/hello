package com.yedam.lhw.classes;

public class People {
	//필드 
	String name;
	int age;    
	String address;
	String face;
	int weight;
	int height;
	
	
	// 생성자 
	People(){	
	}
	
	
	People(String name) {
		this.name = name;
	}
	People(String name, String address, String face, int weight ) {
		this.name = name;
		this.address = address;
		this.face = face;
		this.weight = weight;
	}
	
	
	
	//메소드 
	
	
void face() {
	System.out.println("잘생겼다 ");
}
void getheight () {
	System.out.println("100 ");
}
void getweight () {
	System.out.println("70 ");
}
int getAge () {
	return age;	
}
}
