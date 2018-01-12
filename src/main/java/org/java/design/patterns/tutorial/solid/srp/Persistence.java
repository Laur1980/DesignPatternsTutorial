package org.java.design.patterns.tutorial.solid.srp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Persistence {
	
	public void saveToFile(Journal journal, String fileName){
		if(new File(fileName).exists()){
			try(PrintStream p = new PrintStream(fileName)){
				p.println(journal);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}else{
			throw new IllegalArgumentException("File does not exist!");
		}
	}
	
	public Journal open(String fileName){
		Journal journal = new Journal();
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))){
			String line = null;
			while((line = br.readLine()) != null){
				journal.addEntry(line);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
				return journal;
	}
	
}
