package com.office.classex02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("홍길동", 20, 1, "컴퓨터");
		System.out.println(student1.name);
		System.out.println(student1.grade);
		System.out.println(student1.age);
		System.out.println(student1.major);
		
		student1.printInfo();
		
		Student student2 = new Student("찬길동", 20, 1, "컴퓨터");
		System.out.println(student2.name);
		System.out.println(student2.grade);
		System.out.println(student2.age);
		System.out.println(student2.major);
		student2.printInfo();
	}

}
