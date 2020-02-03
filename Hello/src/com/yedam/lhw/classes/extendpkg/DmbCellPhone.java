package com.yedam.lhw.classes.extendpkg;

public class DmbCellPhone extends CellPhone {
	int channel;
	public DmbCellPhone ( ) {
		super(); 
	}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); //  부모 생성자를 가리킴 
		this.channel = channel;
	}
	void turnOnDmb( ) {
		System.out.println("채널:" + channel+ "번 DMB방송 수신.");
	}
	void changeChannel (int channel) {
		this.channel = channel;
		System.out.println( "채널 :" + channel + "번 으로 바뀝니다. ");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신 종료 ");
		
	}
}


