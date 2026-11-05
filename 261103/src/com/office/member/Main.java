package com.office.member;

public class Main {
	
	public static void main(String[] args) {
		
//		MemberContainer memberContainer = MemberContainer.getInstance();
//		memberContainer.getMemberController().execute();
		
		MemberContainer.getInstance()
						.getMemberController()
						.execute();
		

		
	}

}
