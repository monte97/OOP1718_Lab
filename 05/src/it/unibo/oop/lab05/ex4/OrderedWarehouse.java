package it.unibo.oop.lab05.ex4;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;
import it.unibo.*;

public class OrderedWarehouse extends WarehouseImpl {

	public OrderedWarehouse(Set<Product> productSet) {
		super(productSet);
	}

	public Set<Product> allProducts() {
		Set<Product> result = super.allProducts();
		List<Product> resultList = new ArrayList<Product>(result);
		
		
		return result;
	}
	
	

}
