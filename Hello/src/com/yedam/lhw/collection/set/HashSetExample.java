package com.yedam.lhw.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> strSet= new HashSet <>();
		strSet.add("java");
		strSet.add("oracle");
		strSet.add("program");
		strSet.add("java");
		System.out.println();
	
		for(String str : strSet) {
			System.out.println(str);
		}
	
	}
}
