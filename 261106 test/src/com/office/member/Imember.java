package com.office.member;

import java.util.Scanner;

import com.office.DB.MemberDto;

public interface Imember {
	
	public void logUp(MemberDto memberDto);
	
	public void logIn(MemberDto memberDto, Scanner sc);
	
	public void modyfi(MemberDto memberDto);

}
