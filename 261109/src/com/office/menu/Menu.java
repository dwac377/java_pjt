package com.office.menu;

import java.util.HashMap;

import com.office.session.Session;

public class Menu {
	
	final public static int MEMBER_SIGN_UP = 1;
	final public static int MEMBER_SIGN_IN = 2;
	final public static int MEMBER_SIGN_OUT = 3;
	final public static int MEMBER_MODIFY = 4;
	final public static int MEMBER_DELETE = 5;
	
	final public static int DIARY_WRITE = 6;
	final public static int DIARY_READ = 7;
	
	final public static int SYS_OUT = 99;

	public static void generateMenu() {
		
//		세션에서 로그인 상태 불러오기
		HashMap<String, Object> attributies = Session.getInstance().getAttributies();
		Object object = attributies.get("signInedMemberId");
		
//		로그인이 되어 있으면 어떠한 정보가 맵에 있을 테니 null이 아니다, 없다면 null이 된다
		if (object != null) {
			System.out.println("3.로그 아웃   4.정보 수정   5.회원 탈퇴   6.일기 쓰기   7.일기 읽기   그외 벗어나기");
		} else {
			System.out.println("1.회원 가입   2.로그인   아무 키를 눌러 벗어나기");
		}
	}
}
