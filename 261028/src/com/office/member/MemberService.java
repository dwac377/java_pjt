package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	MemberDB db;
	int logInCout = 0;
//	boolean systemFlag = true;
	flag sysflag;
	
	
	    public MemberService(MemberDB db, flag sysflag) {
			this.db = db;
			this.sysflag = sysflag;
		}
	
	
	public void doSignUp(Scanner sc) {
		
		System.out.println("Input new Member ID");
		String userId = sc.next();
		
		while (true) {
			Member member = db.memberDB.get(userId);
			if (member != null) {
				System.out.println("아이디 중복");
				System.out.println("Input new Member ID");
				userId = sc.next();
			} else {
				break;
			}
		}
		
//		if (db.memberDB.get(userId) != null) {
//			System.out.println("아이디 중복");
//			return;
//		}
		
		
		System.out.println("Input new Member PW");
		String userPw = sc.next();
		
		while (true) {
			if (userPw.length() < 8 || userPw.length() > 16) {
				System.out.println("비밀번호는 8~16자 사이여야 한다");
				System.out.println("Input new Member PW");
				userPw = sc.next();
			} else {
				break;
			}
			
			 
			
		}
		
		System.out.println("Input new Member EMAIL");
		String userEmail = sc.next();
		System.out.println("Input new Member PHONE");
		String poneNum = sc.next();
		
		Member member = new Member(userId, userPw, userEmail, poneNum);
		

		db.memberDB.put(userId, member);
		db.memberDB.get(userId).printInfo();

	}
	
	public void doSignIn(Scanner sc) {
		
		
		System.out.println("Input Member ID");
		String userId = sc.next();
		System.out.println("Input Member PW");
		String userPw = sc.next();
		
//		MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(userId);
		
		
		while (true) {
			if (searchedMember != null) {
					if (searchedMember.userPw.equals(userPw)) {
					System.out.println("성공");
				} else {
					System.out.println("실패");
					logInCout ++;
					System.out.println("Input Member ID");
					userId = sc.next();
					System.out.println("Input Member PW");
					userPw = sc.next();
					System.out.println(logInCout);
				
				}
			} else {
				System.out.println("아이디 없음");
				logInCout ++;
				System.out.println("Input Member ID");
				userId = sc.next();
				System.out.println("Input Member PW");
				userPw = sc.next();
				System.out.println(logInCout);
			}
		
			if (logInCout > 3) {
				System.out.println("로그인 실패 3회 초과");
				sysflag.flag = false;
				break;
		}
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
