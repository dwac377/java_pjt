package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean systemFlag = true;
		String[] memberInfos;
		
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int END = 99;
		
		HashMap<String, String[]> members = new HashMap<String, String[]>(); 
		
		members.put("1", new String[]{"1", "12", "12", "12"});
		memberInfos = members.get("1");
		for (String memberInfo : memberInfos)
			System.out.println(memberInfo);
		
		members.put("2", new String[]{"2", "21", "21", "21"});
		memberInfos = members.get("2");
		for (String memberInfo : memberInfos)
			System.out.println(memberInfo);
		
		while (systemFlag) {
		
			System.out.println("1.회원 가입   2. 로그인   3.정보 수정   4.회원 탈퇴   아무키나 눌러 종료");
		
			int selectedMenu = sc.nextInt();
			
			String memberID;
			String memberPW;
			String memberEMAIL;
			String memberPhone;
		
			switch (selectedMenu) {
			case MENU_SIGN_UP:
				
				System.out.println("아이디 입력");
				memberID = sc.next();
				if (members.get(memberID) != null) {
					System.out.println("아이디 중복");
					break;
				}
				System.out.println("비밀번호 입력");
				memberPW = sc.next();
				System.out.println("이메일 입력");
				memberEMAIL = sc.next();
				System.out.println("전화 번호 입력");
				memberPhone = sc.next();
				
				memberInfos = members.get(memberID);
				
				members.put(memberID, new String[]{memberID, memberPW, memberEMAIL, memberPhone});
				
//				for (String memberInfo : memberInfos)
//					System.out.println(memberInfo);
				
				break;
				
			case MENU_SIGN_IN:
				System.out.println("아이디를 입력하시오");
				memberID = sc.next();
				System.out.println("비밀번호를 입력하시오");
				memberPW = sc.next();
				
				memberInfos = members.get(memberID);
				System.out.println(memberInfos);
				
				if (memberInfos != null) {
					if (memberInfos[1].equals(memberPW)) {
					System.out.println("로그인 성공");
					} else {
						System.out.println("비밀번호가 틀렸습니다");
					}
					
				} else {
					System.out.println("아이디가 없습니다");
				}
			
				break;
				
			case MENU_MODIFY:
				System.out.println("아이디 입력");
				memberID = sc.next();
				System.out.println("비밀번호 입력");
				memberPW = sc.next();
				System.out.println("이메일 입력");
				memberEMAIL = sc.next();
				System.out.println("전화 번호 입력");
				memberPhone = sc.next();
				
				memberInfos =  members.get(memberID);
				if (memberInfos != null) {
					memberInfos[1] = memberPW;
					memberInfos[2] = memberEMAIL;
					memberInfos[3] = memberPhone;
				} else {
					System.out.println("아이디가 없습니다");
				}
				String[] tempInfos = members.get(memberID);
				for (String tempInfo : tempInfos)
					System.out.println(tempInfo);
			
				break;
				
			case MENU_DELETE:
				System.out.println("아이디 입력");
				memberID = sc.next();
				System.out.println("비밀번호 입력");
				memberPW = sc.next();
				
				memberInfos = members.get(memberID);
				
				if (memberInfos != null && memberInfos[1].equals(memberPW)) {
					members.remove(memberID);
						System.out.println(members.get(memberID));
					
				} else {
					System.out.println("그딴건 없다");
				}
			
				break;
				
			default:
				System.out.println("종료");
				systemFlag = false;
				sc.close();
				break;
			}
		
		}
	}
}
