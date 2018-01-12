package org.java.design.patterns.tutorial.solid.srp;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
	
	private final List<String> entries = new ArrayList<String>();
	private static int count=0;
	
	public void addEntry(String entry){
		entries.add(""+(++count)+": "+entry);
	}
	
	public void removeEntry(int index){
		entries.remove(index);
	}
	
	public String toString(){
		return String.join(System.lineSeparator(), entries);
	}
	
	//bad design choice, single responsability principle is broken
	public void save(String fileName){
		File f = new File(fileName);
		
		try(PrintStream out = new PrintStream(f)){
			for(String s:entries){
				out.println(s);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
