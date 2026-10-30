package com.office.methodex2;

public class Score {
	
//	 요구 사항 1 학급 학생 3명의 총점과 평균을 출력
//	public void printScore(int s1, int s2, int s3) {
//		
//		int totalScore = s1 + s2 + s3;
//		double averageScore = totalScore / 3;
//		
//		System.out.printf("총점 : %d   평균 : %s \n", totalScore, averageScore);
//	}
//		
//	요구사항 2 학생 2명이 전학을 왔다.
//		
//	public void printScore(int s1, int s2, int s3, int s4, int s5) {
//			
//		int totalScore = s1 + s2 + s3 + s4 + s5;
//		double averageScore = totalScore / 5;
//			
//		System.out.printf("총점 : %d   평균 : %s \n", totalScore, averageScore);
//		
//	}
//	
//	public void printScore(int s1, int s2, int s3, int s4) {
//		
//		int totalScore = s1 + s2 + s3 + s4;
//		double averageScore = totalScore / 4;
//		
//		System.out.printf("총점 : %d   평균 : %s \n", totalScore, averageScore);
//		
//	}
//	
//	매번 만들기 번거롭다 가변인자를 활용하자!
	public void printScore(int...scores) {
		
		int total = 0;
		
		for (int score : scores) {
			total += score;
		}
		
		double averageScore = total / scores.length;
		
		System.out.printf("총점 : %d   평균 : %s \n", total, averageScore);
	}
//	가변 인자느 무조건 파라미터 마지막에 와야 한다.
//	가변 인자는 배열이다.
	
//	오버 로딩과 가변인자는 같이 사용 가능하다.

	
	public void printScore(String className, int...scores) {
		
		int total = 0;
		
		for (int score : scores) {
			total += score;
		}
		
		double averageScore = total / scores.length;
		
		System.out.printf("반 : %s   총점 : %d   평균 : %s \n", className, total, averageScore);
		
	}

}
