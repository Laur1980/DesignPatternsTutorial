package org.java.design.patterns.tutorial.solid.srp;

import java.io.IOException;

public class DemoJournal {
		public static void main(String [] args){
			Journal journal = new Journal();
			journal.addEntry("Bla bla bla bla bla");
			journal.addEntry("yada yada yada yada ");
			System.out.println(journal);
			Persistence p = new Persistence();
			p.saveToFile(journal, "/home/laur/journal.txt");
			try {
				Runtime.getRuntime().exec("sudo nano /home/laur/journal.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
}
