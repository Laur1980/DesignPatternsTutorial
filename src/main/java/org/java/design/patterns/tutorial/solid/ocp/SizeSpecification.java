package org.java.design.patterns.tutorial.solid.ocp;

public class SizeSpecification implements Specification<Product> {
	private Size size;

	public SizeSpecification(Size size) {
		super();
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.getSize() == this.size;
	}
	
	
}
