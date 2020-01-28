// 예제 
public class LoopExample {
	public static void main(String[] args) {
		// ( 1~100)3의 배수 이면서 7의 배수 를 실행 

//		for (int i = 1; i <= 9; i++) {
//			System.out.println(var1+ "*" +i +"= " + (var1*i));
//		}
//		var1은 5로 지정, i는 1부터 9까지 for문 사용
//		for문은 i는 1~9까지 sys를 한번씩 반복 출력 -> 출력은 9개 나옴
//		sys안에는 변수랑 문자 지정 가능, 문자는 ""안에 적는다.

	 for (int i = 3; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 7 == 0)) {
				System.out.println(i);
	    }
      }
			
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 7 == 0) {
				
				System.out.println(i);

			}
			i++;
		}

	}// 메인
}// 클래스
