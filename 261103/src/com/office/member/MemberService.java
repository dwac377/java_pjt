package com.office.member;

import java.util.Scanner;

public class MemberService implements IMemberService{

	@Override
	public void signUp(Scanner sc) {
		
		
		
	}

	@Override
	public void signIn(Scanner sc) {
		
		
		
	}

	@Override
	public void modify(Scanner sc) {
		
		
		
	}

	@Override
	public void delete(Scanner sc) {
		
		
		
	}
	
	
	private MemberService() {
		// TODO Auto-generated constructor stub
	}
	
	private static MemberService memberService = new MemberService();
	
	public static MemberService getMemberService() {
		
		if (memberService == null) {
			return memberService;
		}
		
		return memberService;
	}
	
	

}
