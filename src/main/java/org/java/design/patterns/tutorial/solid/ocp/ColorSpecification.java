package org.java.design.patterns.tutorial.solid.ocp;

public class ColorSpecification implements Specification<Product> {
	
	private Color color;
	
	public ColorSpecification(Color color) {
		this.color = color;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	@Override
	public boolean isSatisfied(Product item) {
		return item.getColor() == this.color;
	}

}
