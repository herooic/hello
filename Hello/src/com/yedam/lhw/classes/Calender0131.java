package com.yedam.lhw.classes;
//

// 월 입력하면 해당월의 날짜를 반환해주는 메소드 제작
// 1월 은 31일 2월은 28일 3월은 31일...

// 2020년 1,2,3,4, 월에 해당하는 첫쨋날의 요일
// 일 => 1. 월 => 2, 화 =>3....토 =>7

public class Calender0131 { // 월입력하면 해당월의 날짜를 반환해주는 메소드 를 제작
	public static void main(String[] args) { // 메인 메소드void 는 리턴값이 없음	
	
		createCal(5);
	}

	static void createCal(int month) {
		
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		int days = getMonthDay(month);
		System.out.println(month + "월은 " + getMonthDay(month));
		int firstDay = getFirstDay(month);

		for (int i = 0; i < day.length; i++) {
			System.out.print("  " + day[i]);
		} // 요일 출력 구문
		System.out.println();
		// 월의 첫째날의 시작위치 지정.
		for (int i = 0; i < firstDay - 1; i++) { // 시작위치에 맞춰 끊어주려고 -1 붙임
			System.out.print("   ");  //
		}

		for (int i = 1; i <= days; i++) {
			System.out.printf("%3d", i);
			if ((firstDay - 1 + i) % 7 == 0) { // 물린값(firstDay -1) 에서 i 더한 후 나누기 7

				System.out.println();
			}
		} // 7일씩 짤라서 출력 - 캘린더 위치 맞추기 위함		
	}
		
	static int getFirstDay(int month) {
		if (month == 1) {// 1월달은 수요일
			return 4;
		} else if (month == 2) {// 2월달의 토요일
			return 7;

		} else if (month == 3) {// 3월달은 일요일
			return 1;

		} else if (month == 4) {// 4월달은 수요일
			return 4;
		} else if (month == 5 ) {
			return  6;

		} else {// 그외의 달은 없다
			return 0;
		}
	}

	static int getMonthDay(int month) {
		int days = 0;
		if (month <= 7 && month % 2 == 1) {
			days = 31;
		} else if (month > 7 && month % 2 == 0) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else {
			days = 30;
		}
		return days;

	}// static

}// class
