package com.yedam.lhw;

public class Test07 {
	public static void main(String[] args) {
		// 1 배열 크기가 100인 배열 num
		// ( 1~100 값을 담아주세요)
		int[] num = new int[100];
		// 0의 값으로 초기화
		for (int i = 0; i < 100; i++) {
			num[i] = i + 1;
		}
		System.out.println(num[1]);

		// 2) 배열의 홀수번째 위치에 있는 값을 합하는 FOR 구문
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (num[i] % 2 == 1) {
				sum += num[i];
				
			}
		}
		System.out.println("홀수값의 합은 : " + sum);
		
		
		
		for ( int i =0 ; i <100; i++) { 
			
		}
	}// main
}// class
