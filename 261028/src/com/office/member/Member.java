package com.office.member;

public class Member {
//	필드 멤버
	String userId;
	String userPw;
	String userEmail;
	String poneNum;
	
	
	public Member() {

	}
	
	public Member(String userId, String userPw, String userEmail, String poneNum) {
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.poneNum = poneNum;
	}
//	회원 정보 출력 메서드
	public void printInfo() {
		System.out.printf("아이디:%s 비밀번호:%s 이메일:%s 전번:%s \n",
						 userId, userPw, userEmail, poneNum);
	}
	
	

}

