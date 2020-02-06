package com.yedam.lhw.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//EmService > EmServiceImpl
// 			 EmServiceImpl
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("2"); // strAry[0] = "hello"
		strList.add("3");
//		System.out.println(strList.get(0));
		
		strList.add(1, "4");
		System.out.println(strList.get(1));
		for(int i= 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
			
		}
		
		strList.remove(3);
		for(String str : strList) {
			System.out.println(str);
		}
		
		List<Integer>intlist = new LinkedList<>();
		
	}


}
