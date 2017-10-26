package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

	public ComparableProduct(final String name) {
		super(name);
	}

	
	public int compareTo(final Product arg0) {
		/*Sfrutto la comparabilita' delle stringhe interne al mio oggetto*/
		return this.getName().compareTo(arg0.getName()); 
	}

}
