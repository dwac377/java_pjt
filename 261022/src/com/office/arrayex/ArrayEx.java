package com.office.arrayex;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class ArrayEx {
	public static void main(String[] args) {
		
//		배열 선언
//		1. 데이터타입 [] 배열 변수명
//		int [] numbers = {1, 2, 3, 4, 5};
//		System.out.println(numbers);
//		
//		2. 데이터타입 [] 배열변수명 = new 데이터타입 [배열의 길이]
//		int [] numbers2 = new int [5];
//		numbers2[0] = 1;
//		numbers2[1] = 2;
//		numbers2[2] = 3;
//		numbers2[3] = 4;
//		numbers2[4] = 5;
//		
//		3. 데이터타입 [] 배열변수명 = new 데이터타입[]{...}
//		int [] numbers3 = new int [] {1, 2, 3, 4, 5};
		
//		배열 데이터 조회 : 인덱스를 이용한 데이터 조회
//		int [] scores = {80, 90, 100, 75, 60};
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
//		
//		for (int i = 0; i < scores.length; i++)
//			System.out.printf("%d %d\n", i, scores[i]);
//		
//		배열 데이터 수정 : 인덱스를 이용한 데이터 수정
//		int [] points = {80, 90, 100, 75, 60};
//		for (int i = 0; i < points.length; i++)
//			System.out.printf("%d %d\n", i, points[i]);
//		
//		foreach
//		for (int point : points)
//			System.out.println(point);
//		
//		points[0] = 200;
//		System.out.println(points[0]);
//		
//		자바의 배열 특징
//		1. 단일 데이터 타입만 저장 가능. [1, 2, 3, "ㅇㅈㅈ"] X
//		2. 최초 선언된 배열의 길이 변경 불가
//		3. 존재하지 않는 인덱스를 이용하게 되면 에러 발생
//		 : 배열 정의 후 길이를 다시 지정하면 완전히 새로운 배열을 만들고 기존의 배열은 GC에 의해 삭제됨
//		
//		배열을 이용해서 학급 학생의 시험 성적, 평균, 총점 출력
//		int [] scores = {80, 95, 100, 70, 68, 74, 88, 98, 100, 76};
//		int total = 0;
//		float average = 0.0f;
//		
//		for (int i = 0; i < scores.length; i++) {
//			System.out.printf("scores1[%d] scores:%d \n", i, scores[i]);
//			total += scores[i];
//		}
//			System.out.println(total);
//			average = total / scores.length;
//			System.out.println(average);
//		
//		값이 없는 배열의 초기 값
//		int [] classes = new int[5];
//		
//		for (int i = 0; i < classes.length; i++) {
//			System.out.println(classes[i]);
//		}
//		
//		float [] aver = new float[5];
//		for (int i = 0; i < aver.length; i++) {
//			System.out.println(aver[i]);
//		}
//			
//		복사 (기초 데이터 타입)
//		int number1 = 10;
//		int number2 = 20;
//		
//		System.out.println(number1);
//		System.out.println(number2);
//		
//		number1 = number2;
//		
//		System.out.println(number1);
//		System.out.println(number2);
//		
//		number1 = 100;
//		
//		System.out.println(number1);
		
//		배열 복사 (래퍼런스 타입)
//		int[] numbers = {1, 2, 3};
//		int[] numbersCopy = numbers;
//				
//		System.out.println(numbers);
//		System.out.println(numbersCopy);
//		
//		for (int i = 0; i < numbers.length; i++)
//			System.out.printf("%d %d \n", i, numbers[i]);
//		얕은 복사
//		for (int i = 0; i < numbersCopy.length; i++)
//			System.out.printf("%d %d \n", i, numbersCopy[i]);
//		
//		깊은 복사
//		int[] deepCopy = new int[numbers.length];
//		for (int i = 0; i < numbers.length; i++)
//			deepCopy[i] = numbers[i];
//		
//		for (int i = 0; i < deepCopy.length; i++)
//			System.out.printf("%d %d \n", i, deepCopy[i]);
//		
//		deepCopy[1] = 1000;
//		System.out.println(deepCopy[1]);
//		
//		numbers[0] = 100;
//		System.out.println(numbersCopy[0]);
//		
//		배열 빠이짜이찌엔삭제제제제
//		int[] myScores = {10, 30, 50};
//		System.out.println(myScores);
//		myScores = null;
//		System.out.println(myScores);
//		
//		다차원 배열, 다만 좆간 피로도를 고려하여 2차원 까지만 쓰는 것이 좋다
//		수학적으로 차원은 계속 확장할 수 있으나 4차원이 뭐지..?
//		
//		선언 방식 그 첫 번째 지피티 왈 배열 초기화 축약형
//		int[][] mns = {{1,2}, {10,20}, {100, 300}};
//		
//		2. 뻐킹 씻 존나 귀찮아 포문을 써야겠는걸?!
//		int[][] mns2 = new int [2][3];
//		mns2[0][0] = 1;
//		mns2[0][1] = 2;
//		mns2[1][0] = 10;
//		mns2[1][1] = 20;
//		mns2[2][0] = 100;
//		mns2[2][1] = 200;
//		
//		3. 명시적 배열 생성 : 배열 초기화까지 그냥 바로 해버리기 
//		int[][] mns3 = new int[][] {{1, 2}, {10, 20}, {100, 200}};
//		System.out.println(mns3[0]);
//		System.out.println(mns3[0][1]);
//		System.out.println(mns3[1][1]);
//		System.out.println(mns3[2][1]);
//		
//		mns3[0][0] = 1000;
//		System.out.println(mns3[0][0]);
	}
}
