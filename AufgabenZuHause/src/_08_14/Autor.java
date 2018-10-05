package _08_14;

import java.util.Arrays;

import Prog1Tools.IOTools;

public class Autor {
	private static long nextID;
	private long id;
	private String name;
	private String vorname;
	private Buch[] buecher;
	
	
	{
		id = nextID;
		nextID++;
	}
	
	public Autor(String name, String vorname) {

		this.name = name;
		this.vorname = vorname;
		
		Autor[] autoren = new Autor[3];
	}

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

	public Buch[] getBuecher() {
		return buecher;
	}

	public void setBuecher(Buch[] buecher) {
		this.buecher = buecher;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", name=" + name + ", vorname=" + vorname + ", buecher=" + Arrays.toString(buecher)
				+ "]";
	}
	public static Autor readAutorFromConsole() {
		String name = IOTools.readString("Name: ");
		String vorname = IOTools.readString("Vorname: ");

		return new Autor(name, vorname);
	}
}
