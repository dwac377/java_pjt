package com.office.calcullater;

public class Main {
	
	public static void main(String[] args) {
		
		calcullaterClass calcullaterClass = 
					new calcullaterClass();
		
		calAdd calAdd = new calAdd();
		calsub calsub = new calsub();
		
		calcullaterClass.calculate(20, 50, calAdd);
		calcullaterClass.calculate(20, 50, calsub);
		calcullaterClass.calculate(321, 0, new calMultiply());
		calcullaterClass.calculate(1000, 213, new calDiv());
		
	}

}
