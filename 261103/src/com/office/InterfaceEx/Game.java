package com.office.InterfaceEx;

public class Game {
	
	private Bear bear;
	private Dog dog;
	private Robot robot;
	private AirPlane airPlane;
	private Imove[] imove;
	
	public Game(Bear bear, Dog dog, Robot robot, AirPlane airPlane) {
		this.bear = bear;
		this.dog = dog;
		this.robot = robot;
		this.airPlane = airPlane;
		
		imove = new Imove[] {
			this.bear,
			this.dog ,
			this.robot, 
			this.airPlane 
		};
	}	
	
	public void move(int x, int y) {
		bear.run(20, 20);
		dog.run(20, 20);
		robot.run(20, 20);
		airPlane.run(20, 20);
		for (int i = 0; i < imove.length; i++) 
			imove[i].run(x, y);
	}
}