package org.java.design.patterns.tutorial.solid.dip;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Triplet;

public class Relationships {
	
	private List<Triplet<Person,Relationship, Person>> relations = new ArrayList<>();
	
	public void addParentAndChild(Person parent, Person child){
		relations.add(new Triplet<>(parent, Relationship.PARENT, child));
		relations.add(new Triplet<>(child, Relationship.CHILD, parent));
	}
	
}
