package com.yedam.lhw.classes;

public class Method {
//	public static void main(String[] args) {
//		int num1 = 10, num2= 15;
//		
//		int result = sum(num1, num2) * minus(num1, num2);
//		System.out.println("결과값은 " + result);
	int leftField;
	int rightField;

	public int getLeftField() {
		return leftField;
	}

	public void setLeftField(int leftField) {
		this.leftField = leftField;
	}

	public int getRightField() {
		return rightField;
	}

	public void setRightField(int rightField) {
		this.rightField = rightField;
	}

	public int thisSum() {
		return leftField + rightField;
	}

	public int thisMinus() {
		return leftField - rightField;
	}

	public int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public int minus(int a, int b) {
		return a - b ;
	}
}
