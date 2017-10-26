package it.unibo.oop.lab.robot.composable;

import it.unibo.oop.lab04.robot.base.Robot;

public abstract class Component {
	private boolean turnedOn;
	private boolean connected;
	private Robot robot;
	private final double cost;
	
	protected Component(final double cost) {
		this.turnedOn = false; 
		this.connected = false;
		this.robot = null;
		this.cost = cost;
	}
	
	protected Component(final double cost, final Robot robot) {
		this(0);
		this.attach(robot);
	}
	
	protected void turnOn() {
		this.turnedOn = true;
	}
	
	protected void turnOff() {
		this.turnedOn = false;
	}
	
	public double getConsumption() {
		return this.cost;
	} 
	
	public boolean attach(Robot robot) {
		if (this.connected) {
			return false;
		} else {
			this.robot = robot;
			this.connected = true;
			return true;
		}
	}
	
	public boolean deattach() {
		if (!this.isConnected()) {
			this.connected = false;
			this.robot = null;
			this.turnOff();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isTurnedOn() {
		return this.turnedOn;
	}
	
	public boolean isConnected() {
		return this.connected;
	}
	
	public Robot getRobot() {
		return this.robot;
	}
	
	public abstract boolean use();
	
	public boolean isUsable() {
		return (this.isConnected() && this.isTurnedOn());
	}
}
