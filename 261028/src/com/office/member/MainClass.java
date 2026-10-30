package com.office.member;

import java.util.HashMap;
import java.util.Scanner;


public class MainClass {
	

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		MemberDB memberdb = new MemberDB();
		MemberDumy memberDumy = new MemberDumy(memberdb);
		memberDumy.initDumyData();
		flag sysflag = new flag();
		MemberService memberSevice = new MemberService(memberdb, sysflag);


		while (sysflag.flag == true) {
			System.out.println("1. 회원가입   2번. 로그인   3번. 정보 수정   4번. 회원 정보   5. 삭제    을 제외한 아무 키나 눌러 시스템 종료");
			int selectedMenu =  sc.nextInt();
			
			switch (selectedMenu) {
			case Menu.SIGN_UP :
//				memberSevice = new MemberSevice();
				memberSevice.doSignUp(sc);
				break;
			case Menu.SIGN_IN :
//				memberSevice = new MemberSevice();
				memberSevice.doSignIn(sc);
				break;
			case Menu.MODIFY :
				memberSevice.doModify(sc);
				break;
			case Menu.ALL_INFO :
				HashMap<String, Member> db = memberdb.memberDB;
				db.keySet();
				for (String key : db.keySet()) {
					Member member = db.get(key);
					System.out.println(member.userId);
					System.out.println(member.userPw);
					System.out.println(member.userEmail);
					System.out.println(member.poneNum);
				}
				for (Member member : db.values()) {
					System.out.println(member.userId);
					System.out.println(member.userPw);
					System.out.println(member.userEmail);
					System.out.println(member.poneNum);
				}
				break;
			case Menu.DIL :
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
