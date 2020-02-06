package com.yedam.lhw.generic;

import java.util.ArrayList;
import java.util.List;

import com.yedam.lhw.generic.before.Apple;
import com.yedam.lhw.generic.before.Orange;

public class BoxExample {
	public static void main(String[] args) {
		Box<Orange> Orangebox = new Box<Orange>(); //선언하는 시점에 타입이 정해짐 
		Orange orange = Orangebox.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		Apple apple = appleBox.get();
		
		Box<String> box = new Box<String>() ;
		box.set("Hello");
		appleBox.set(new Apple());
		
		List<String> list = new ArrayList<String> ();
		list.add("Hello");
		list.add("world");
		for(Object obj : list)  {
			System.out.println(obj);
		}
		
		List<Employees> empList = null;
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());
					
		List ist = new ArrayList();
		ist.add(new Apple());
		ist.add("hello");
		for(Object obj : ist)  {
				System.out.println(obj);
			}
		
	}
}
