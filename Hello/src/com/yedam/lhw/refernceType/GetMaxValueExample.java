package com.yedam.lhw.refernceType;

public class GetMaxValueExample {
	public static void main(String[] args) {
		int[] intAry1 = { 8, 7, 10, 5, 9 };
		// intAry 는 8, 7, 10, 5, 9
		int max = 0;
		// max를 0으로 지정
		for (int x = 0; x < intAry1.length; x++) {
			if (max < intAry1[x]) {
				// ex) 맥스가 intAry[0] 일때 챗번째 숫자 8 대입
				// 그러면 다시 max 자리에 8이 대입 그리고 intAry[1] 두번째 숫자 7이 대입
				// 그러면 기존 맥스에 8 보다 낮기 떄문에 성립불가 이걸 반복
				//
				max = intAry1[x];

			}

		}
		System.out.println("최대값은" + max);

	} // main

} // class
