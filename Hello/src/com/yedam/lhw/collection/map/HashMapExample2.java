package com.yedam.lhw.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
	
	int stdNo;
	String name;
	public Student(int stdNo, String name) {
		super();
		this.stdNo = stdNo;
		this.name = name;
	
	
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.stdNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s1 = (Student) obj;
		return this.name.equals(s1.name);
	}
	

}

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(111,"이다혜"), 30);
		map.put(new Student(111,"신아라"), 40);
		map.put(new Student(111,"이지원"), 50);
		map.put(new Student(111,"이다혜"), 60);
		System.out.println(map.size());
		Set<Student> set = map.keySet();
		Iterator<Student> iter =set.iterator();
		while (iter.hasNext()) {
			Student key = iter.next();
			System.out.println(key.name+ "," + key.stdNo + ","+  map.get(key));
		}
	}
}
