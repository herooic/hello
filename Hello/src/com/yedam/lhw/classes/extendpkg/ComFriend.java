package com.yedam.lhw.classes.extendpkg;

public class ComFriend extends Friend {
	private String compay;

	public ComFriend(String name, String phone, String compay) {
		super(name, phone);
		this.compay = compay;
	}

	public String getCompay() {
		return compay;
	}

	public void setCompay(String compay) {
		this.compay = compay;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
	System.out.println( " 회사 동기 이름은" + super.getName());
	System.out.println(" 회사동기 번호는 " + super.getPhone());
	System.out.println( " 회사는 " + compay );
	}

	
	
	
	
	
}