package com.office.InterfaceEx;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(new Bear(),
							new Dog(),
							new Robot(),
							new AirPlane());
		
		game.move(12, 32);
		
		
		
	}
}
