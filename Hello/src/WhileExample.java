
public class WhileExample {
	public static void main(String[] args) {
	
		int i = 0;
		// 초기화 지정
		while(true) { // 
			i = (int) (Math.random()* 6 ) +1;
			// 
			System.out.println(i);
			if(i ==  6 ) {
				break; // i 가  6일때 종료하고 빠져나오겟다 
				// i 가 6이 나올때 까지 무한반복 구문 
				
			}
		}
	}//메인
}
