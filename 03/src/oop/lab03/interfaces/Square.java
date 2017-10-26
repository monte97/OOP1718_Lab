package oop.lab03.interfaces;

public class Square implements Polygon{

	public final static int EDGE = 4;
	final private int lato;
	
	public Square (final int lato) {
		this.lato = lato;
	}
	
	@Override
	public double getArea() {
		return lato*lato;
	}

	@Override
	public double getPerimeter() {
		return lato * EDGE;
	}

	@Override
	public int getEdgeCount() {
		return EDGE;
	}
	
	public int getLato() {
		return lato;
	}

}
