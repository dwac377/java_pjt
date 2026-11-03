package com.office.InterfaceEx;

public class AirPlane implements Imove{
	
	private void ply(int x, int y) {
		
		System.out.printf("%d, %d로 날아가기! \n", x, y );
		
	}

	@Override
	public void run(int x, int y) {
		ply(x, y);
	}

}
