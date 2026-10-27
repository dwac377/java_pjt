package com.office.class2;

public class MainClass {
	public static void main(String[] args) {
		
//		Student student1 = new Student(1, 1, 5, "박찬호", false);
//		Student student2 = new Student(1, 2, 8, "박지성", false);
//		
//		student1.printInfo();
//		student2.printInfo();
//		
//		신입생은 모두 1학년이고 재학 중이니 디폴트 값으로 만들기
		Student student1 = new Student(1, 5, "박찬호");
		Student student2 = new Student(2, 8, "박지성");
		
		student1.printInfo();
		student2.printInfo();
//		
//		전학생의 경우 1학년이 아닐수도 있으니 다시 매개변수로 / 비효율적이니 생성자 오버 로딩을 활용하자
//		Student student1 = new Student(2, 1, 5, "박찬호");
//		Student student2 = new Student(3, 2, 8, "박지성");
//		
//		student1.printInfo();
//		student2.printInfo();
//		
//		생성자 오버 로딩 활용
		Student student3 = new Student(2, 1, 5, "호찬박");
		Student student4 = new Student(3, 2, 8, "성지박");
		
		student3.printInfo();
		student4.printInfo();
		
		Student student5 = new Student(3, 6, 32, "휴학맨", true);
		Student student6 = new Student(3, 6, 122, "휴학맨2", true);
		
		student5.printInfo();
		student6.printInfo();
		
	}
}
