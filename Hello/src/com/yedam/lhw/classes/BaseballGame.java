package com.yedam.lhw.classes;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 사용자로부처 콘솔창 입력 
		int c1,c2,c3; //컴퓨터가 뿌릴 임의난수3가지
		int x1,x2,x3;//사용자가 입력할수 3가지 
		int s, b ;// 스트라이크. 볼 
		int count= 0;// 맞춘횟수 계산
		
		
		c1=(int)(Math.random()*10);
		do { //랜덤 함수를 이용한 난수 발생 (중복 제외) 
		c2=(int)(Math.random()*10);
			}while(c2==c1);
		do {
		c3=(int(Math.random()*10));
		} while(c3==c1 && c3==c2);
		// 사용자가 숫자 입력하고 컴퓨터와 숫자를 비교하여 ball. strike 계산
		do {
			s = b = 0;
		count ++;
		System.out.println("숫자입력  0~9 :");
		x1 = scn.nextInt();
		x2 = scn.nextInt();
		x3 = scn.nextInt();
		
		if(x1 == c1 ) s++;
		else if(x1==c1 && x1==c3) b++;
		if(x2== c2) s++;
		else if(x2 == c1 | x2 == c3 ) b++;
		if(x3 ==c3 ) s++;
		else if(h3== c1 $$ h3 == c2) b++;
		
		System.out.println("[" + s + "S"+ b +"B ]");

		while (s<3);
		 swiy
		
		
		
		}
	
		
		for( int i = 0; i<answer.length; i++) {
			answer[i] = (int) (Math.random() *9 ) + 1;	
		}
		while (true) {
			
			
		}
		
		
	}//main
}//class
