package com.yedam.lhw.refernceType;
// 1차원 배열 , 10 개 크기  for 구문으로

public class ForWhileExample0130 {

	public static void main(String[] args) {
		method1();
		method2();

	}

	public static void method1() {
		int[] intAry1 = new int[10];
		for (int i = 0; i < intAry1.length; i++) {
			intAry1[i] = i + 1;
			System.out.println("1번문제 " + intAry1[i]);
		}

	}

	public static void method2() {
		System.out.println("2번문제");
		int intAry2[][] = new int[5][5];
		// 5x5
		int cnt = 1;
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				intAry2[i][j] = cnt++;
			}

		}
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				System.out.printf("%3d", intAry2[j][i]);

//			System.out.printf("%3d", intAry2[i][j] );

			}

			System.out.println();

		}
	}

}