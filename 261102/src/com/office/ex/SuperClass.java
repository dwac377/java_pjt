package com.office.ex;

public class SuperClass extends GrandClass{
	
	public String name;
	private int money;
	
	public void printInfo() {
		
		System.out.printf("이름:%s 자본:%d 주소:%d", name, money, addr);
		
	}

}
