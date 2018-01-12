package org.java.design.patterns.tutorial.solid.ocp;

public interface Specification<T> {
	boolean isSatisfied(T item);
}
