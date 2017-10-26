package oop.lab02.constructors;

public class Train {

    int nTotSeats;
    int nFCSeats;
    int nSCSeats;

    int nFCReservedSeats;
    int nSCReservedSeats;

    Train() {
		this(0,0,0);
	}
	
	Train(int total, int first, int second) {
		this.nSeats = total;
		this.nFCSeats = first;
		this.nSCSeats = second;
		this.deleteAllReservations();
	}
	
	Train(int first, int second){
		this(first+second, first, second);
	}
	
	public void printTrainInfo() {
		System.out.println("Numero posti totali: " + this.nTotSeats);
		System.out.println("Numero posti prima classe: " + this.nFCSeats);
		System.out.println("Numero posti seconda classe: " + this.nSCSeats);
		System.out.println("Numero posti prima classe prenotati: " + this.nFCReservedSeats);
		System.out.println("Numero posti seconda classe prenotati: " + this.nSCReservedSeats);
	}
	
    void reserveFCSeats(final int nSeats) {
        this.nFCReservedSeats += nSeats;
    }

    void reserveSCSeats(final int nSeats) {
        this.nSCReservedSeats += nSeats;
    }

    double getTotOccupancyRatio() {
        return (this.nFCReservedSeats + this.nSCReservedSeats) * 100d / this.nTotSeats;
    }

    double getFCOccupancyRatio() {
        return this.nFCReservedSeats * 100d / this.nFCSeats;
    }

    double getSCOccupancyRatio() {
        return this.nSCReservedSeats * 100d / this.nSCSeats;
    }

    void deleteAllReservations() {
        this.nFCReservedSeats = 0;
        this.nSCReservedSeats = 0;
    }
}
