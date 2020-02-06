package com.yedam.lhw.generic;

class Television {

}

public class ProductExample {
	public static void main(String[] args) {

		Product<Television, String> p1 = new Product<>();
		Television t1 = new Television();
		p1.setKind(t1);
		p1.setModel("smart Tv");
		Television tell = p1.getKind();
		String str1 = p1.getModel();

	}
}
