package com.office.member;

import java.util.Scanner;


public class MainClass {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberDB memberdb = new MemberDB();
		MemberDumy memberDumy = new MemberDumy(memberdb);
		memberDumy.initDumyData();
		flag sysflag = new flag();
		MemberService memberSevice = new MemberService(memberdb, sysflag);
		
//		더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다
		
		final int SIGN_UP = 1;
		final int SIGN_IN = 2;
		final int MODIFY = 3;
		final int DIL = 4;

		while (sysflag.flag == true) {
			System.out.println("1. 회원가입   2번. 로그인   3번. 정보 수정   4번. 삭제    을 제외한 아무 키나 눌러 시스템 종료");
			int selectedMenu =  sc.nextInt();
			
			switch (selectedMenu) {
			case SIGN_UP :
//				memberSevice = new MemberSevice();
				memberSevice.doSignUp(sc);
				break;
			case SIGN_IN :
//				memberSevice = new MemberSevice();
				memberSevice.doSignIn(sc);
				break;
			case MODIFY :
				memberSevice.doModify(sc);
				break;
			case DIL :
				memberSevice.doDelete(sc);
				break;

			default:
				System.out.println("종ㄹ");
				sysflag.flag = false;
				break; 
				
//				메뉴 5번 -> 전체 회원 정보 출력하는 기능 구현
				
			}
			
			
		}
		
		
		sc.close();
	}

}
