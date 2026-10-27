package com.office.classex03;

public class Car {
	
//	속성
	String carColor;
	String carNumber;
	
//	생성자
	public Car(String carColor, String carNumber) {
		this.carColor = carColor;
		this.carNumber = carNumber;
		// TODO Auto-generated constructor stub
	}
	
//	기능
	
	public void printInfo() {
		System.out.printf("차량 색상:%s 차량 정보:%s \n", carColor, carNumber);
		
	}

}


