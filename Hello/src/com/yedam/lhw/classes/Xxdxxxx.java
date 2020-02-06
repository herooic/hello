package com.yedam.lhw.classes;

public class Xxdxxxx {

	public static void main(String[] args) {
		System.out.println(getDigitNumber(64));

	}

	static String getDigitNumber(int num) {
			
		String result = "";
		int num2 = 0; //몫을 담으려 한다 
		int num1 = num; // 나머지를 도출 
		while (true) {
			num2 = num1 % 2;
			result = num2 + result;
			num1 = num1 /2;
			if (num1 == 0) {
				break;
			}
			}
		return result;
	}
	
}// class