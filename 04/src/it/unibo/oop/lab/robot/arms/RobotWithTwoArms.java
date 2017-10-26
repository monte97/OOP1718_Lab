package it.unibo.oop.lab.robot.arms;

import it.unibo.oop.lab04.robot.base.BaseRobot;


public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {
	
	private final BasicArm armR;
	private final BasicArm armL;
	private final static double COST_PER_ITEM_CARRIED = 10;
	

	public RobotWithTwoArms(String robotName) {
		super(robotName);
		this.armR = new BasicArm("armR");
		this.armL = new BasicArm("armL");
	}

	public boolean pickUp() {
		return executePick(this.getAvaiableArm());
	}

	private BasicArm getAvaiableArm() {
		if (!armR.isGrabbing()) {
			return armR;
		} else if (!armL.isGrabbing()) {
			return armL;
		} else {
			return null;
		}
	}

	private boolean executePick(final BasicArm arm) {
		if (arm == null) {return false;}
		if (this.isBatteryEnough(arm.getConsumptionForPickUp())) {
			arm.pickUp();
			this.consumeBattery(arm.getConsumptionForPickUp());
			return true;
		} else {
			return false;
		}
	}

	public boolean dropDown() {
		return executeDrop(this.getBusyArm());
	}

	private boolean executeDrop(BasicArm arm) {
		if (arm == null) {return false;}
		if (this.isBatteryEnough(arm.getConsumptionForDropDown())) {
			arm.dropDown();
			this.consumeBattery(arm.getConsumptionForDropDown());
			return true;
		} else {
			return false;
		}
	} 

	private BasicArm getBusyArm() {
		if (armR.isGrabbing()) {
			return armR;
		} else if (armL.isGrabbing()) {
			return armL;
		} else {
			return null;
		}
	}

	public int getItemsCarried() {
		int count = 0;
		
		if (armR.isGrabbing()) {
			count++;
		}
		
		if (armL.isGrabbing()) {
			count++;
		}
		
		return count;
	}
	 
	 protected boolean move(final int dx, final int dy) {
		 if (isBatteryEnough(super.MOVEMENT_DELTA_CONSUMPTION + this.getItemsCarried() * COST_PER_ITEM_CARRIED)) {
			 consumeBattery(this.getItemsCarried() * COST_PER_ITEM_CARRIED );
			 return super.move(dx, dy);
		 } else {
			 return false;
		}
	 }
	
	

}
