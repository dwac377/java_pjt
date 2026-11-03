package com.office.InterfaceEx;

public class Bear implements Imove{

	private void walk(int x, int y) {
		
		System.out.printf("%d, %d로 사족보행! \n", x, y );
		
	}

	@Override
	public void run(int x, int y) {
		walk(x, y);
	}
}
