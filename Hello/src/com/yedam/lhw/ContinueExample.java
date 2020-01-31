package com.yedam.lhw;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0)
				continue;
			// 그 다음 반복 차수로 넘어가겠다 라는 명령어
			System.out.println("i => " + i);

		} // for
	} // main
}// class