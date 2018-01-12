package org.java.design.patterns.tutorial.solid.lsp;

public class Demo {
	
	static void userIt(Rectangle r){
		int width = r.getWidth();
		r.setHeight(10);
		System.out.println((width*10)+" compared to "+r.getArea());
	}
	
	public static void main(String[] args) {
		
	}

}
