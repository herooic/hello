package com.yedam.lhw.common;

import com.yedam.lhw.classes.Student;

public class StudentExample0131 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Student stn = new Student();
		stn.study();
		Student snt = new Student("name");
		snt.eat();	
	}

}
