package com.office.classex02;

public class Student {
	
	String name;
	int grade;
	int age;
	String major;

	public Student(String name, int grade, int age, String major) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
		
	}
	
	public void printInfo() {
		System.out.printf("이름:%s 학년:%d 나이:%d 전공:%s \n", name, grade, age, major);
		
	}
	
}

