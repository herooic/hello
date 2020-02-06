package com.yedam.lhw.api;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = " 이현우&김민섭,이광민,정준우-최용석";
	
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
	
}
