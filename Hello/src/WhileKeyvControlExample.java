
public class WhileKeyvControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) { //

			if (keyCode != 13 && keyCode != 10) { // 엔터키값
				System.out.println("--------------");
				System.out.println(" 1.종속 | 2. 감속 | 3. 중지 ");
				System.out.println("--------------");
				System.out.println("선택 : ");

			} // 첫번째 if

			keyCode = System.in.read(); // 키 코드를 읽겠다 라는 표시
			System.out.println(keyCode);// 키토드를 보여달라하면 키 코드값을 보여줌
										// 1을 입력하면 키코드값 49, 13, 10 나옴
			if (keyCode == 49) { // 1을 읽었을 경우 * 49 키 코드값 는 1
				speed++;
				System.out.println(" 현재속도 = " + speed);
			} else if (keyCode == 50) { // 2 를 읽었을 경우
				speed--;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 51) { // 3 을 읽었을 경우
				run = false;
		} 
				
		} //while
		System.out.println(" 프로그램 종료 ");

	} //메인
}//클래스 
