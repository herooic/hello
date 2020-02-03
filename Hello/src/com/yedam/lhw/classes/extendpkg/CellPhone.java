package com.yedam.lhw.classes.extendpkg;

public class CellPhone {
	private String model;
	private String color;
	public CellPhone() {
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원을 키다");

	}

	void powerOff() {
		System.out.println(" 전원를 끄다 ");

	}

	void bell() {
		System.out.println("벨이 울립니다 ");
	}

	void sendMessage(String message) {
		System.out.println("자신:" + message);

	}

	void receiveMessage(String message) {
		System.out.println(" 상대방:" + message);
	}

	void hangUp() {
		System.out.println(" 전화를 끊습니다");
	}
}

