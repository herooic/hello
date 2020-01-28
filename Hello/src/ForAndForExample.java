
public class ForAndForExample {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + (i*j));

			} // for 두번째
		} // for 첫번째

		
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print( j+ " * " + i + " = " +  (i*j) + "   " );
			}
				
			System.out.println( );
			
		} // for 첫번째
	} //메인
}//클래스