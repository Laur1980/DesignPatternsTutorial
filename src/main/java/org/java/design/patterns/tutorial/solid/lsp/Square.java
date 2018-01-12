package org.java.design.patterns.tutorial.solid.lsp;

public class Square extends Rectangle{
	
	public Square(){}
	
	public Square(int size){
		width = height = size;
	}
	//LSP violator
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	//LSP violator
	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	
	
	
}
