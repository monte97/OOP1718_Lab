public class Calculator{
	private Integer nOpDone;
	private double lastRes;
	
	public void build(){
		this.nOpDone = 0;
		this.lastRes = 0;
	} 
	
	public double add(double a, double b){
		this.nOpDone++;
		this.lastRes = a+b;
		return this.lastRes;
	}
	public double sub(double a, double b){
		this.nOpDone++;
		this.lastRes = a-b;
		return this.lastRes;
	}
	public double mul(double a, double b){
		this.nOpDone++;
		this.lastRes = a*b;
		return this.lastRes;
	}
	public double div(double a, double b){
		this.nOpDone++;
		this.lastRes = a/b;
		return this.lastRes;
	}
}