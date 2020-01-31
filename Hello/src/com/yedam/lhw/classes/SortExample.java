package com.yedam.lhw.classes;

public class SortExample {
	public static void main(String[] args) {
		int[] sortAry = { 15, 13, 20, 25, 7, 17 };
		int temp = 0;
		System.out.println(" 정렬전 ");
		for (int i = 0; i < sortAry.length; i++) {
			System.out.print(sortAry[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < sortAry.length - 1; i++) {
			for (int j = 0; j < sortAry.length - 1; j++) {
				if (sortAry[j] > sortAry[j + 1]) {

					temp = sortAry[j];
					sortAry[j] = sortAry[j + 1];
					sortAry[j + 1] = temp;
				}
			}
		}
		System.out.println(" 내림차순 ");

		for (int i = 0; i < sortAry.length; i++) {

			System.out.print(sortAry[i] + " ");

		}
		for (int i = 0; i < sortAry.length - 1; i++) {
			for (int j = 0; j < sortAry.length - 1; j++) {
				if (sortAry[j] < sortAry[j + 1]) {

					temp = sortAry[j + 1];
					sortAry[j + 1] = sortAry[j];
					sortAry[j] = temp;

				}
			}
		}
	}
}