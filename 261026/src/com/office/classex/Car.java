package com.office.classex;

public class Car {

//	속성
	String carColor = "red";
	float size = 5.2f;
	int displacement = 2000;
	
//	생성자
	public Car() {
		System.out.println("우와 자동차다");
		// TODO Auto-generated constructor stub
	}
	
//	기능
	public void drive() {
		System.out.println("운전스스스스스");
	}
	
	public void parking() {
		System.out.println("주차스스스스스");
	}
	
	public void stop() {
	System.out.println("정지스스스스스");
	}

}
