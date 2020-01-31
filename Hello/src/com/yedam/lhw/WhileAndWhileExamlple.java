package com.yedam.lhw;
// while 구문으로 구구단 만들기 
public class WhileAndWhileExamlple {
	public static void main(String[] args) {
		int i = 1;		// int i를 1로 시작 
		while (i <= 9) { // i =1 을 9까지 포함
			int j = 2;   // j를 2단의 시작으로 지정 
			while (j <= 9) {// 마찬가지로 9단 까지 지정 
				System.out.print(j + "*" + i + " = " + (i * j) + " ");
				j++;// 식을 세운후 구구단 시작 2단을 계속 진행 

			}
			System.out.println();
			i++; // i도 숫자 9까지 진행 시킴 

		}
	}
}