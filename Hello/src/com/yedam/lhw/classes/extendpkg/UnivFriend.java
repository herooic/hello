package com.yedam.lhw.classes.extendpkg;

public class UnivFriend extends Friend {
	private String university;

	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		this.university = university;

	}

	public String getUniversity() { // 메소드를 값을 가져오는거
		return university;
	}

	public void setUniversity(String university) { // 셋 메소드느 값을 넣는거
		this.university = university;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("학교친구 이름음" + super.getName());
		System.out.println("친구 전화번호는 " + super.getPhone());
		System.out.println("학교는 " + university);

	}

}
