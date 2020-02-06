package com.yedam.lhw.generic;

public class Box<T> {
	private  T obj; // T는 제레닉   ( 타입을 지정후 )
	public void set(T obj) { //obj 모든타입이 올수 있다 
		this.obj = obj;
		
		
	}
	public T get() {
		return obj ;
	
	}

}
