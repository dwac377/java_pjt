package com.office.classex;

public class MainClass {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.size);
		System.out.println(car1.carColor);
		
		car1.drive();
		car1.stop();
		car1.parking();
		
	}
	
}
