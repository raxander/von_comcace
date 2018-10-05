package _08_13;

import Prog1Tools.IOTools;

public class MorgenPersonTest {
	public static void main(String[] args) {
		String name = "";
		String vorname;
		char geschlecht;
		int capacity;
		MorgenPerson[] p;
		capacity = IOTools.readInt("Personenzahl: ");
		
		if (capacity > 0) {
			p = new MorgenPerson[capacity];
			for (int i = 0; i < capacity; i++) {
				name=IOTools.readString("Name:");
				vorname=IOTools.readString("Vorname:");
				geschlecht=IOTools.readChar("Geschlecht [W oder M]:");
				p[i]=new MorgenPerson(name, vorname, geschlecht);
				//p[i].PersonAdd(name, vorname, geschlecht);
				
			}
			for (int i = 0; i < capacity; i++) {
				System.out.println(p[i].toString());
			}
		}
		
	}
}
