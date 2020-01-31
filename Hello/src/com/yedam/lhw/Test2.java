package com.yedam.lhw;

public class Test2 {
	public static void main(String[] args) {
		byte  var1, var2 ;
		int sum;
		var1 = 30;
		var2 = 40;
		sum  = var1 + var2;
		System.out.println( " var의 값은:" + sum );
		
		if(true) {
			int var3, var4 ;
			var3 = 10;
			var4 = 20;
			sum = var1 + var2 + var3 + var4 ;
			System.out.println(" var4을 포함한 값은" +sum);
		}
		char chr1 = 65 +1 ;
		for(int l =0; l < 5; l++) {
			// int l 임의 문자열지정
			// l = 0 l을 0부터 시작 
			// l< 5 개 를 지정 5개 까지 
			// l++ 은 반복 더한다 (for) 
			chr1 = (char) (chr1 +1 );
			System.out.println(chr1);
			
			
			
		}
	}
}
