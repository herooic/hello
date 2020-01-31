package com.yedam.lhw;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 2, 3, 4, 5 }; 
		int[] int2Ary = new int[5];
		int2Ary[0] =1;
		int2Ary[4] =10;
//		int[] int3Ary = null;
//		int3Ary = new int[] {1,2,3};
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println("--------------------");
		intAry[0] = 20;
		intAry[1] = 30;

		// intAry 에 10,20,30,40 의 값을 할당 (대입)하시요
		for (int i = 0; i < 4; i++) {
			intAry[i] = i * 10 + 10;
		}
		System.out.println("-----------");
		for (int i = 0; i < 4; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("++++++++++++++++");
		int sum = 0;
		// sum 에다가 인트에리어에 값을 더하는거 
		for (int i = 0; i < 4; i++) {
			//sum = sum + intAry[i];
			sum += intAry[i];
			
		}
		System.out.println("sum 값은 : "  + sum  );
	}// main
}// class


