package com.yedam.lhw.classes;

public class StudentArrayExample {
	public static void main(String[] args) {

		Student[] stdAry = new Student[3];

		Student sn = new Student("choi", 20, 180, 70);

		Student stnt = new Student();

		stnt.setName("kim");
//		stnt.setAge = -20;		
		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(65);

		Student snt = new Student();
		snt.setName("lee");
//		snt.age = -31;
		snt.setAge(31);
		snt.setHeight(175);
		snt.setWeight(66);

		stdAry[0] = sn;
		stdAry[1] = stnt;
		stdAry[2] = snt;

//		stdAry[0] = stdAry[1];
//		stdAry[1] = stdAry[2];
//		stdAry[2] = stdAry[0];

		for (int i = 0; i < stdAry.length; i++) {
//			if(stdAry[i].name.equals("choi"))

			System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
		}

		int[] sortAry = new int[5];
		for (int i = 0; i < sortAry.length; i++) {
			for (int j = 0; j < sortAry.length; j++) {
				sortAry[j] = j + 1;

				System.out.println();
			}
		}

		// int[] intAry1 = new int[10];
//			for (int i = 0; i < intAry1.length; i++) {
//				intAry1[i] = i + 1;
//				System.out.println("1번문제 " + intAry1[i]);
	}

}
