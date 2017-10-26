package it.unibo.oop.lab.robot.arms;

public class BasicArm {
	private String name;
	private boolean grabbing;
	private final static double COST_UP = 1;
	private final static double COST_DOWN  = 1;
	
	public BasicArm(final String name) {
		this.name = name;
	}
	
	public boolean isGrabbing() {
		return this.grabbing;
	}
	
	public boolean pickUp() {
		if (!this.isGrabbing()) {
			this.grabbing = true;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean dropDown() {
		if (this.isGrabbing()) {
			this.grabbing = false;
			return true;
		} else {
			return false;
		}
	}
	
	public double getConsumptionForPickUp() {
		return COST_UP;
	}

	public double getConsumptionForDropDown() {
		return COST_DOWN;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "[ BasicArm - Name:" + this.getName() + "cost up: " + this.getConsumptionForPickUp() + "cost down: " + this.getConsumptionForDropDown() +  " ]";
	}
	
}
