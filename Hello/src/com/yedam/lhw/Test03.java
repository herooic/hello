package com.yedam.lhw;

public class Test03 {
	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0 ) {
			sum = sum + i;
		}
			i ++; 
			System.out.println( "i: " + i + ", sum " + sum);

		}
		
		int var1  = 5 ;
		i = 1;
	
		while ( i <= 9) {
			System.out.println(var1 + "*" +i +"= " + (var1*i));
			i ++;
		}
			
		
	
		
	}// 메인
}
