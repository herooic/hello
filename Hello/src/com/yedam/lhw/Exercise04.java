package com.yedam.lhw;

public class Exercise04 {
	public static void main(String[] args) {

		int num1, num2;

		while (true) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			if (num1 + num2 == 5) {
				break;
			} //if 구문
			System.out.println("(" + num1 + "," + num2 + ")");

		} // while

	}// main
}// class