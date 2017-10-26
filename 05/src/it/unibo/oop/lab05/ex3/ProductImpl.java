package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {
	
	private String name;
	private double qnt;
	
	public ProductImpl(final String name, final double qnt) {
		this.name = name;
		this.qnt = qnt;
	}
	
	public ProductImpl(final String name) {
		this(name, 0);
	}
	
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getQuantity() {
		return qnt;
	}

}
