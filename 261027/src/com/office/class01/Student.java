package com.office.class01;

import java.security.PublicKey;

public class Student {
	
	String name;
	int grade;
	String gender;
	String major;
	int age;
	
	public Student(
			String name,
			int grade,
			String gender,
			String major,
			int age) {
		
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		this.major = major;
		this.age = age;
		
	}
	
	public void printInfo() {
		System.out.printf("name:%s gender:%s age:%d \n", name, gender, age);
		System.out.printf("grade:%d major:%s \n", grade, major);
	}
}
