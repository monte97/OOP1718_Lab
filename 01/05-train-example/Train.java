public class Train{
	private int nToSeats; //posti
	private int nFirstClassSeats; //posti
	private int nSecondClassSeats; //posti
	private int nFirstClassReservedSeats; //posti presi
	private int nSecondClassReservedSeats; //posti preso
	
	public void build(int first, int second){
		this.nFirstClassSeats = first;
		this.nSecondClassSeats = second;
		this.nToSeats = this.nFirstClassSeats + this.nSecondClassSeats;
		this.nFirstClassReservedSeats = 0;
		this.nSecondClassReservedSeats = 0;
		
	}
	
	public void reserveFirstClassSeats(int n){
		if((this.nFirstClassReservedSeats + n) < this.nFirstClassSeats){
			this.nFirstClassReservedSeats += n;
		}else{
			System.out.println("Posti insufficenti in prima classe");
		}
	}
	
	public void reserveSecondClassSeats(int n){
		if((this.nSecondClassReservedSeats + n) < this.nSecondClassSeats ){
			this.nSecondClassReservedSeats += n;
		}else{
			System.out.println("Posti insufficenti in prima classe");
		}
	}
	
	public double getToOccupancyRatio(){
		
		return ((double)(this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) / this.nToSeats)*100;
	}
	
	public double getFirstClassOccupancyRatio(){
		return ((double)this.nFirstClassReservedSeats / this.nFirstClassSeats)*100;
	}
	
	public double getSecondClassOccupancyRatio(){
		return ((double)this.nSecondClassReservedSeats / this.nSecondClassSeats)*100;
	}
	
	public void deleteAllReservations(){
		this.nFirstClassReservedSeats = 0;
		this.nSecondClassReservedSeats = 0;
	}
}