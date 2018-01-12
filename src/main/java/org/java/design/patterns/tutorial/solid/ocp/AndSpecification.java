package org.java.design.patterns.tutorial.solid.ocp;
/*
 * The class acts as a combinator for Specifications
 */
public class AndSpecification<T> implements Specification<T>{
	
	private Specification<T> first,second;
		
	public AndSpecification(Specification<T> first, Specification<T> second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T item) {
		return (first.isSatisfied(item) && second.isSatisfied(item));
	}

}
