package com.yedam.lhw.classes.extendpkg;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("shy", "white", 10);
		d1.powerOn(); // 셀폰 메소드
		d1.turnOnDmb(); // dmb 메소드
		d1.changeChannel(20);
		d1.turnOffDmb();
		d1.sendMessage("반갑습니다"); // 셀폰 메소드
		d1.receiveMessage("하이요 ");
		d1.powerOff();

		CellPhone c1 = new DmbCellPhone();

		if (c1 instanceof DmbCellPhone) {
			DmbCellPhone d2 = (DmbCellPhone) c1; // 강제로 ㄴ캐스팅이 필요함
			d2.turnOnDmb();
			d2.changeChannel(40);
			d2.turnOffDmb();

		}

		CellPhone c2 = new CellPhone();
		if (c2 instanceof DmbCellPhone) {
			DmbCellPhone d3 = (DmbCellPhone) c2;
			d3.turnOnDmb();

		} else {
			System.out.println("casting  불가");
		}

	}//main

}//class
