package com.yedam.lhw.classes;

//문제  2의 배수 표현
// 3의 배수 표현 
//2의 배수도 아니고3의 배수도 아닌것은 기타로 표현
//999를 입력하면 종료 
import java.util.Scanner;

public class MultipledExample0131 {
	public static void main(String[] args) {

		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.print(" 입력: ");
			int num = scn.nextInt();
			// 정수 타입으로 문자열 입력으로 인해 int 타입으로 스캔
			if (num % 2 == 0 && num%3 != 0 ) { // 2의 배수 표현
				System.out.println(" 2의 배수");
				// 2의 배수 이면서 3의 배수가 아닌거
			} else if (num % 3 == 0 && num != 999 && num%2!=0 ) { // 999가 3의 배수도 됨으로 3의 배수 이면서 999가 아니도록
				System.out.println("3의 배수");
				// 3의 배수이면서 999가 아니면서 2의 배수가 아닌거
			} else if (num % 2 == 0 && num % 3 == 0) {
				System.out.println("2의 배수이면서 3의 배수 ");
				}
			else if (num % 2 != 0 && num % 3 != 0) { // 기타는 2의 배수도 아니고 3의 배수도 아닌것
				System.out.println("기타 "); // 또는 표현 &&
			}

			else if (num == 999) { // 999를 입력하면 종료 하도록
				break;
			}
		}System.out.println("종료  ");

}
}