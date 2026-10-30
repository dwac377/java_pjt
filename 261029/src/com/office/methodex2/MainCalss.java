package com.office.methodex2;

public class MainCalss {

	public static void main(String[] args) {
		
//		 메서드 오버로딩 : 메서드가 여러개 선언 된것
//		 요구사항 : 이름님 + 안녕! 출력되게	메서드 매개 변수 활용해서 넣기
//		 2, 모르는 사람 + 안녕! 출력
//		
//		Greet greet = new Greet();
//		greet.printGreetWord("응애");
//		greet.printGreetWord();
//		
//		AddOper addOper = new AddOper();
//		addOper.add(10, 20);
//		addOper.add(1.4f, 256.2f);
//		addOper.add(1.4321444, 256.2);
//		addOper.add("응", "애");

		Score score = new Score();
		score.printScore(80, 100, 62);
		score.printScore(50, 12, 25, 69);
		score.printScore(90, 98, 75, 100, 5);
		
		score.printScore("a반", 91, 21, 32, 31);
		

	}

}
