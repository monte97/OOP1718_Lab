package it.unibo.oop.lab.robot.arms;

import it.unibo.oop.lab04.robot.base.Robot;

public interface RobotWithArms extends Robot {

	public boolean pickUp();
	
	public boolean dropDown();
	
	public int getItemsCarried();
}
