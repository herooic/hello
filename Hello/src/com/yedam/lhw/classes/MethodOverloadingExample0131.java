package com.yedam.lhw.classes;

public class MethodOverloadingExample0131 {
	public static void main(String[] args) {		
		
		Student sl = new Student();
		System.out.println(sl);

		
		int num1= 10, num2 = 20;
		double d1 = 1.5, d2= 2.5;
		print (sum (d1, d2)); 
		// 더블타입은 출력 이안됨
		// static void print (double d) 을 해줘야지 싱핼이 됨 
		print(sum(num1, num2)) ;// int 타입을 받아서 실행 할수 있도록 메소드 가 정의 
		print();
	}
	static void print () {
		
	}
	
	static void print (double d) {
		System.out.println();
		// 더블타입을 출력하기위함 
	}
	static void print(String str) {
		System.out.println(str);
	}
	static void print(int str) {
		System.out.println(str);
	}
	static int sum (int a, int b) { 
		return a+ b;		
	}
	static int sum (int c, int d, int a) { 
		return c + d+ a;
	}// 동일 한 메소드를 사용  
	static double sum(double a, double b) {
		return (double) (a+b);
	}
	
	static double sum(double a, int b) {
		return a + b ;
	}
}//class


