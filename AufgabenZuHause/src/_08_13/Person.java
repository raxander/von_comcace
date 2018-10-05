package _08_13;

import java.text.Format;

import Prog1Tools.IOTools;

/**
 * 
 * Exemplare: Anika Hegert, W Wondmu Alemu Kidie, M Sebastian Mceiej Bydalek, M
 * 
 * Attribute Konstruktoren (Sinnvolle Konstruktoren) Methoden: -1. Peronen Daten
 * aus der Tastur einlesen und Person Objekt f�r den Aufrufer bereitstellt -2.
 * Methode f�r die Textuelle Darstellung
 * 
 * Lernziel: -Klassen definieren -Konzept Objekt -Konsturktoren -Defualt Values
 * -statische Methoden
 *
 */
public class Person {
	private String vorname;
	private String mittlerename;
	private String nachname;

	public Person(String vorname, String mittlerename, String nachname) {

		this.vorname = vorname;
		this.mittlerename = mittlerename;
		this.nachname = nachname;
	}

	public Person(String vorname, String nachname) {

		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String format() {
		//readPersonFromConsole(); OK!
		if (mittlerename != null)
			return nachname + ", " + vorname + " " + mittlerename;
		else
			return nachname + ", " + vorname;
	}

	public static Person readPersonFromConsole() {
		
		//format(); Error
		String vn, mn = null,nn;
		vn = IOTools.readString("Vorname: ");
		boolean b = IOTools.readBoolean("Mittlere name? [falls ja, true, falls nein, false eingeben]: ");
		if(b) {
			mn = IOTools.readString("Mittlerename: ");
		}
		nn = IOTools.readString("Nachname: ");
		if(b) {
			return new Person(vn, mn, nn);
		}
		 return new Person(vn, nn);
	}
}
