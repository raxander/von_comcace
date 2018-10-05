package _08_14;

/*
 * Erstlle Folgende Klassen:
 * 
 * 			Autor
 * 					Exemplar:
 * 							 Kathy Siera, SCJP Exam Guide
 * 							 Bert Bates, SCJP Exam Guide, OCA Exam Guide, OCP Exam Guide
 * 				Jedes Autor hat Name und Vorname.
 * 				Ein Autor hat eine Liste von B�cher (nur Title)
 * 			Verhalten:
 * 						-format()
 * 						-Einslesen aus der Tastatur
 * 					
 * 			Buch:
 * 					Exemplar:
 * 							OCA Exam Guide 
 * 							Oracle Press
 * 							978-1-260-01139-5
 * 							50.00 USD
 * 				Jedes Buch hat eine Liste von Autoren
 * Verhalten:
 * 						-format()
 * 						-Einslesen aus der Tastatur
 * 					
 * 					
 */

/*
 * Eine Lsite von B�cher verwalten:
 * 			
 */
public class Buchverwaltung {
	
	
	public static void main(String[] args) {
Buch b1= Buch.readBookFromConsole();
//Buch b2= Buch.readBookFromConsole();
Autor a1=null;
Autor a2=null;
Autor a3=null;
Autor a4=null;
b1.istAutorHinzugefuegt(a1.readAutorFromConsole());
//b2.istAutorHinzugefuegt(a2.readAutorFromConsole());
b1.istAutorHinzugefuegt(a3.readAutorFromConsole());
//b2.istAutorHinzugefuegt(a4.readAutorFromConsole());
	}
}
