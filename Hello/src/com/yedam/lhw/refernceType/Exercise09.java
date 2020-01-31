import java.util.Scanner;

package com.yedam.lhw.refernceType;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("=====================================================");
			System.out.println("1. 학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 |5. 종료 " );
			System.out.println("=====================================================");
			System.out.print("선택 > " );
		
		int selectNo =  scanner.nextInt();
		
		if (selectNo ==1 ) {
			
			System.out.print(" 학생수 > "); 
			studentNum = scanner.nextInt();
			// 학생수를 입력하도록 문구 입력 
			scores = new int[studentNum]; 
			//배열 크기지정 
			//사용자가 아무거나 입력 하여 스코즈가 나올수 있도록 지정
			// 
			
			
		} else if ( selectNo ==2 ) {
			for(int i=0; i<scores.length; i++) {
			System.out.print("scores["+i+"]>");
			int score = scanner.nextInt();
			scores[i] = score;
			}// 
			
		} else if ( selectNo ==3)  {
			for(int i=0; i<studentNum; i++) {
				System.out.println("scores[" + i + "]: " + scores[i]);
				
			}
			
		} else if ( selectNo ==4)  {
			//
			//
		} else if ( selectNo ==5)  {
			//
			
			run false;
		}
		}
		
		System.out.println("프로그램 종료 ");
		
		
		
		
		}



}


