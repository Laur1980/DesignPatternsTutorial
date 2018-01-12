package org.java.design.patterns.tutorial.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilterNoOCP {
	
	public Stream<Product> filterByColor(List<Product> products, Color color){
		return products.stream().filter(p -> p.getColor() == color);
	}
	//bad choice
	public Stream<Product> filterBySize(List<Product> products, Size size){
		return products.stream().filter(p -> p.getSize() == size);
	}
	//bad choice
	public Stream<Product> filterBySize(List<Product> products, Size size, Color color){
		return products.stream().filter(p -> p.getSize() == size && p.getColor() == color);
	}
	
}
