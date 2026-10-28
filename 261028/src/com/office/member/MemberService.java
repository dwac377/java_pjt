package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	MemberDB db;
	int logInCout = 0;
	boolean systemFlag = true;
	flag sysflag = new flag();
	
	
	    public MemberService(MemberDB db, flag sysflag) {
			this.db = db;
			this.sysflag = sysflag;
		}
	
	
	public void doSignUp(Scanner sc) {
		
		System.out.println("Input new Member ID");
		String userId = sc.next();
		
		if (db.memberDB.get(userId) != null) {
			System.out.println("아이디 중복");
			return;
		}
		
		System.out.println("Input new Member PW");
		String userPw = sc.next();
		
		if (userPw.length() <= 8) {
			System.out.println("비밀번호가 8자리 보다 적을수 없습니다");
			return;
		}
		if (userPw.length() >= 12) {
			System.out.println("비밀번호는 12자리 보다 클수 없습니다");
			return;
		}
		
		
		System.out.println("Input new Member EMAIL");
		String userEmail = sc.next();
		System.out.println("Input new Member PHONE");
		String poneNum = sc.next();
		
		Member member = new Member(userId, userPw, userEmail, poneNum);
		

		db.memberDB.put(userId, member);
		db.memberDB.get(userId).printInfo();
			
		
		
//		아이디 중복 체크 기능 추가 및 비밀번호 8~12 사이까지만
	}
	
	public void doSignIn(Scanner sc) {
		
		
		System.out.println("Input Member ID");
		String userId = sc.next();
		System.out.println("Input Member PW");
		String userPw = sc.next();
		
//		MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(userId);
		
		if (searchedMember != null) {
			if (searchedMember.userPw.equals(userPw)) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
				logInCout ++;
				System.out.println(logInCout);
				
			}
		} else {
			System.out.println("아이디 없음");
			logInCout ++;
			System.out.println(logInCout);
		}
		
		if (logInCout > 3) {
			System.out.println("로그인 실패 3회 초과");
			sysflag.flag = false;
		}
		
//		로그인 실패가 4회 이상이면 시스템 종료
	}
	
	public void doModify(Scanner sc) {
		
		System.out.println("Input Member ID");
		String userId = sc.next();
		System.out.println("Input Member PW");
		String userPw = sc.next();
		
		Member searchedMember = db.memberDB.get(userId);
		
		if (searchedMember != null) {
			if (searchedMember.userPw.equals(userPw)) {
				System.out.println("로그인 성공");
				System.out.println("정보를 수정하십시오");
				
				System.out.println("Input new Member PW");
				String userNewPw = sc.next();
				System.out.println("Input new Member EMAIL");
				String userEmail = sc.next();
				System.out.println("Input new Member PHONE");
				String poneNum = sc.next();
				
				Member searcMember = db.memberDB.get(userId);
				searcMember.userPw = userNewPw;
				searcMember.userEmail = userEmail;
				searcMember.poneNum = poneNum;
//				로깅
				searcMember = db.memberDB.get(userId);
				searcMember.printInfo();
			} else {
				System.out.println("실패");
			}
		} else {
			System.out.println("아이디 없음");
		}
		

		
//		아이디, 비밀번호로 인증부터 하고 정보 수정 되게 하기
	}
	
	public void doDelete(Scanner sc) {
		
		System.out.println("Input Member ID");
		String userId = sc.next();
		System.out.println("Input Member PW");
		String userPw = sc.next();
		
		Member searcMember = db.memberDB.get(userId);
		
		if (searcMember != null && searcMember.userPw.equals(userPw)) {
			
		}
		
	}

}
