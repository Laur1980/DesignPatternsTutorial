package org.java.design.patterns.tutorial.solid.ocp;

import java.util.List;

public class DemoProducts {

	public static void main(String[] args) {
			Product apple = new Product("apple",Size.SMALL,Color.GREEN);
			Product tree = new Product("tree", Size.LARGE,Color.GREEN);
			Product house = new Product("house", Size.LARGE,Color.BLUE);
			List<Product> products = ProductUtil.of(apple,tree,house);
			ProductFilterNoOCP pf = new ProductFilterNoOCP();
			System.out.println("Made with NoOCP");
			pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.getName()+" is gree"));
			FilterOCP filter = new FilterOCP();
			System.out.println("Made with OCP singlet filter");
			filter.filter(products, new ColorSpecification(Color.GREEN))
					.forEach(p -> System.out.println(p.getName()+" is green!"));
			System.out.println("Made with NoOCP and combinator");
			filter.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)))
					 .forEach(p -> System.out.println(p.getName() +" is blue and large"));
	}

}
