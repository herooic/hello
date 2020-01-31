package com.yedam.lhw.refernceType;

public class Example8 {

	public static void main(String[] args) {
		int[][] intAry = {  //intary[0]
							{ 95, 86 },// intary[1]
							{ 83, 92, 96 },// intary[2]
							{ 78, 83, 93, 87, 88 } }; //intar[3]
		// intAry [ ][ ]
		int sum = 0; 
		double avg = 0.0;
		int cnt = 0;
		for (int i = 0; i < intAry.length; i++) {
				//cnt += intAry[i].length; 도 사용가능 = cnt++
			for (int j = 0; j < intAry[i].length; j++) {
				sum = intAry[i][j] + sum;
				cnt++;

			}

		}
		double avg = (double) sum / cnt;
		System.out.println("sum " + sum);

		System.out.println("avg" + avg);

	}

	public static void main(String[] args) {
		
	}

}// main
