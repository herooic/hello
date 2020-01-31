package com.yedam.lhw.classes;

import java.util.Scanner;

public class CalculatorExample0131 {
	public static void main(String[] args) {
			
		Calculator c1 =new Calculator();
		
		Scanner scn = new Scanner(System.in);
		
		while (true) {
				System.out.println("사칙연산 부호 : +,-,*,/ q : 종료");
				
				String opertor = scn.nextLine();
				
				if (opertor.equals("q")) {
					break;
				
				}
					
				System.out.println("첫번째 수 입력");
					int num1 = scn.nextInt();
					System.out.println("첫번째 수 입력");
					int num2 = scn.nextInt();
					System.out.println("두번째 수 입력");
					scn.nextInt();
					Calculator.cal(num1, num2, opertor);										
					System.out.println("종료");

				}
			

	}
}






