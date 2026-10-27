package com.office.class4;

import java.security.PublicKey;

public class MainClass {
	
	public void print() {
		System.out.println("안녕하시오");
		
	}
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.Forward(63);
		car1.back(58);
		car1.doTest();
		
		MainClass main = new MainClass();
		main.print();
		
	}

}
