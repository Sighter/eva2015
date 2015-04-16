package de.eva.aufg4;

public class EmailAddressTest {
	public static void main(String[] args) {
		EmailAddress ea1 = new EmailAddress("wir10hkw", "studserv.uni-leipzig", "de");
		EmailAddress ea2 = new EmailAddress("wir10hkw", "studserv.uni-leipzig", "de");
		boolean isSolved= (ea1 == ea1) && (ea1 != ea2) && ea1.equals(ea2);
		if(isSolved){
			System.out.println("Aufgabe 4 richtig geloest!");
		} else{
			System.out.println("Aufgabe 4 noch fehlerhaft! Haben Sie equals in EmailAddress richtig implementiert???");
		}
	}
}
