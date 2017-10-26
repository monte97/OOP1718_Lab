package oop.lab02.constructors;

public class Smartphone {

    public static final boolean DEF_HAS_GPS = true;
    public static final boolean DEF_HAS_3G = true;
    public static final boolean DEF_HAS_NFC = true;
    public static final int DEF_SD_SIZE = 8192;
    public static final int DEF_RAM_SIZE = 1024;
    public static final int DEF_N_CPU = 2;

    public int nCPU;
    public int ram;
    public int sdSize;
    public String brand;
    public String model;
    public boolean hasGPS;
    public boolean has3G;
    public boolean hasNFC;

	Smartphone(final int nCPU, final int ram, final int sdSize, final String brand, final String model, final boolean hasGPS, final boolean has3G, final boolean hasNFC){
		this.nCPU = nCPU;
		this.ram = ram;
		this.sdSize = sdSize;
		this.brand = brand;
		this.model = model;
		this.hasGPS = hasGPS;
		this.has3G = has3G;
		this.hasNFC = hasNFC;
	}
	
	Smartphone(final String brand, final String model) {
		this(0, 0 ,0, brand, model, false, false, false);
	}
	
	Smartphone(final String brand, final String model, final int sdSize) {
		this(0, 0, sdSize, brand, model, false, false, false);
	}
	
	Smartphone(final String brand, final String model, final int sdSize, final boolean hasGPS, final boolean has3G) {
		this(0, 0, sdSize, brand, model, hasGPS, has3G, false);
	}
	
	Smartphone(final String brand, final String model, boolean hasNFC) {
		this(0, 0, 0, brand, model, false, false, hasNFC);
	}
	
	
	
    public void printStringRep() {
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }
	
	public static void main(final String[] args) {
        
		Smartphone htcOne = new Smartphone("HTC", "One", 1024);
		Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Note 3", true, true, true);
		
   
   }

    
}
