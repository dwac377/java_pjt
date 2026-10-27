package com.office.class2;

public class Student {
	
	int grade = 1;
	int classNo;
	int studentNo;
	String studentName;
	boolean absence = false; // 트루 = 휴학, 폴스 = 재학
	
//	객체를 생성할 때 디폴트 속성 값은 클래스 내에서 초기화하면 된다
	
//	생성자 오버 로딩, 생성자가 과적했다는 의미 즉 생성자 여러개 만들기
	
	public Student(
			int classNo,
			int studentNo,
			String studentName) {
		
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}
		
	public Student(
			int grade,
			int classNo,
			int studentNo,
			String studentName) {
			
			this.grade = grade;
			this.classNo = classNo;
			this.studentNo = studentNo;
			this.studentName = studentName;
	}
	public Student(
			int grade,
			int classNo,
			int studentNo,
			String studentName,
			boolean absence) {
		
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	
	
	
	public void printInfo() {
		System.out.printf("학년:%d 반:%d 학번:%d 이름:%s 휴학:%b \n", grade, classNo, studentNo, studentName, absence);
	}

}
