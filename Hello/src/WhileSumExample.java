
public class WhileSumExample {
	public static void main(String[] args) {
		// 1~5 까지 합을 구하는 식 출력문
		int sum = 0;
		int i = 1;
		// while 식에서 초기화값은 밖에서 지정 
		while(i<=5) {
			sum = sum + i;
			i++;
		}
		System.out.println( " 합계는 " + sum);
		
		
	} //메인
}
