package org.java.design.patterns.tutorial.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public final class ProductUtil {
	
	private ProductUtil(){}
	
	public static List<Product> of(Product...prods  ){
		List<Product> products = new ArrayList<>();
		for(Product p: prods){
			products.add(p);
		}
		return products;
	}
}
