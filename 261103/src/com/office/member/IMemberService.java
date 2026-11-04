package com.office.member;

public interface IMemberService {
	
	public void signUp(MemberDto memberDto);
	
	public void signIn();
	
	public void modify();
	
	public void delete();

}
