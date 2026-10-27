package com.office.class01;

public class MainClass {
	public static void main(String[] args) {
		
		Student student1 = new Student("송태평", 20, "포크레인", "콤퓨타", 1);
		Student student2 = new Student("하하핫", 195, "공격헬기", "야구", 1);
		Student student4 = new Student("하2하핫", 195, "공격헬기", "야구", 1);
		Student student5 = new Student("하4하핫", 195, "공격헬기", "야구", 1);
		Student student6 = new Student("하하3핫", 195, "공격헬기", "야구", 1);
		Student student3 = new Student("호하힛", 210, "헬리콥터", "축구", 1);
		
		Student[] dataBase = {student1, student2, student3, student4, student5, student6};
		
		int count = 0; 
		
		for (Student students : dataBase) {
			count ++; // 포이치문은 반복 횟수를 구하기 위해 따로 변수 지정 필요
			System.out.println(count + "번");
			
			if (students.major.equals("야구")) {
				students.printInfo();
				break; // 조건 달성시 반복문 벗어나기
			}
		}
		
	}
}
