package com.yedam.lhw.classes.extendpkg;

public class DriverExample {
	
	public static void main(String[] args) {
		Driver d1 = new Driver ();
		Vehicle vehicle = new Vehicle ();
		d1.drive (vehicle);
		vehicle = new Bus ();
		d1.drive (vehicle);
		vehicle = new Truck ();
		d1.drive (vehicle);
	}
}
