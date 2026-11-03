package com.office.member;

import java.util.Scanner;

public interface IMemberService {
	
	public void signUp(Scanner sc);
	
	public void signIn(Scanner sc);
	
	public void modify(Scanner sc);
	
	public void delete(Scanner sc);

}
