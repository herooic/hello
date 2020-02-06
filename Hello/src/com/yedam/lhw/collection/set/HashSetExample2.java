package com.yedam.lhw.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//		인스턴스가 동일한 기준으로 정의 되려면 
	// 헤쉬코드 () 이퀄스 () 재정의되면 됨
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.name.equals(m.name);
	}

}

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("이현우" , 31));
		set.add(new Member("이현우" , 31));
		set.add(new Member("김민섭" , 31));
		set.add(new Member("이원형" , 31));

		System.out.println(set.size());
		for (Member mem : set) {
			System.out.println(mem.name + ","+ mem.age);
		}

		System.out.println("반복자를 통해 for") ;
		Iterator<Member> iter = set.iterator();
		while (iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m.name + "," + m.age);
			
		}
		
		
	}

}
