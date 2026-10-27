package com.office.classex03;

public class student {
	
	String name;
	int age;
	Car car;

	public student (String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	public void printInfo() {
		System.out.printf("이름:%s 나이:%d \n", name, age);
		System.out.println(car);
		
	}
	
}


