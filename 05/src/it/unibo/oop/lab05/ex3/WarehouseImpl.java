package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private LinkedHashSet<Product> productSet;

	
	public WarehouseImpl(final Set<Product> productSet) {
		this();
		for (Product p:productSet) {
			this.addProduct(p);
		}
	}
	
	public WarehouseImpl() {
		this.productSet = new LinkedHashSet<>();
	}
	
	public void addProduct(final Product p) {
		this.productSet.add(p);
	}

	public Set<String> allNames() {
		/*Dato che set e' una interfaccia lo posso usare come 
		 * tipo ma per relizzare effettivamente l'oggetto devo usare
		 * una classe che implementa qualla interfaccia
		 * */
		Set<String> names = new HashSet<>();
		for (Product p:this.productSet) {
			names.add(p.getName());
		}
		return names;
	}

	public Set<Product> allProducts() {
		/*Errato: non in questo modo modifiche fatte sull'oggetto ritornato si riflettono su quello privato!
		*return productSet;
		*/
		Set<Product> prod = new HashSet<>();
		for (Product product:this.productSet) {
			prod.add(product);
		}
		return prod;
	}

	public boolean containsProduct(final Product p) {
		/*Errato: la soluzione deve essere in tempo lineare 
		 * occorre sfruttare le funzionalita' offerte dai set!
		 * for (Product product:this.productSet) {
			if (product.equals(p)) {
				return true;
			}
		}
		return false;*/
		
		return this.productSet.contains(p);
	}

	public double getQuantity(final String name) {
		for (Product product:this.productSet) {
			if (product.getName().equals(name)) {
				return product.getQuantity();
			}
		}
		return -1;
	}

}
