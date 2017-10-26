package it.unibo.oop.lab.robot.composable;

public class UraniumBattery extends Component {
	
	private UraniumBattery() {
		super(0);
	}
	
	public boolean use() {
		if (this.isUsable()) {
			this.getRobot().recharge();
			return true;
		} else {
			return false;
		}
	}

}
