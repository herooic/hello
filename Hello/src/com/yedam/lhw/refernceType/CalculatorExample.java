package com.yedam.lhw.refernceType;

public class CalculatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		sum(1, 2);
		int r = sum2(1, 2);
		System.out.println("r 의 값은 " + r);
		String ret = welcome(" 이현우");
		System.out.println( ret);
		System.out.println(welcome("이현우"));
		print(5, "&&&");
		printStar(7, "+");
		sum(num1, num2);
		minus(num1, num2);
		multi(20, 20);
		divide(7, 3);

	}// main
	public static String welcome(String name) {
		return " hello " + name ;
	}

	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result;

	}

	public static void print(int a, String str) {
		for (int i = 0; i < a; i++)
			System.out.println(str);
	}

	public static void printStar(int x, String s) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(s);
			System.out.println();
		}
	}

	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println(" 두수의 합은 " + result);
	}

	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println(" 두수의 차이는  " + result);
	}

	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println(" 두수의 곱은 " + result);
	}

	public static void divide(int x, int y) {
		double result = (double) x / y;
		System.out.println("두수의 나누기는 " + result);

	}

}// class
