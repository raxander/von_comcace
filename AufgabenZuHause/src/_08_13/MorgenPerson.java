package _08_13;

public class MorgenPerson {
	private String name;
	private String vorname;
	private char geschlecht;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		if (geschlecht == 'M' || geschlecht == 'W')
			this.geschlecht = geschlecht;
		else
			System.out.println("Geschlecht ist nicht richtig. Noch mal eingeben.");
	}

	public MorgenPerson(String name, String vorname, char geschlecht) {

			this.name = name;
			this.vorname = vorname;
			this.geschlecht = geschlecht;
		}

	@Override
	public String toString() {
		return "Person [Name=" + name + ", Vorname=" + vorname + ", Geschlecht=" + geschlecht + "]";
	}

	public void PersonAdd(String name, String vorname, char geschlecht) {
		this.name = name;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
	}
}
