package com.office.class4;

public class Car {
	
	String cooler;
	int length;
	int price;
	int displacement;
	
	
	public Car(String cooler,
			int length,
			int price,
			int displacement) {
		
		this.cooler = cooler;
		this.length = length;
		this.price = price;
		this.displacement = displacement;
	}
	
	public Car() {

	}
	
	
	public void Forward(int speed) {
		System.out.printf("전진 속도:%dkm/h \n", speed);
	}
	
	public void back(int speed) {
		System.out.printf("후진 속도:%dkm/h \n", speed);
	}
	
	public void doTest() {
		Forward(50);
		back(40);
		
	}
	

}
