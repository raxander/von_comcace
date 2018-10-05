package _08_14;

import java.util.Arrays;

import Prog1Tools.IOTools;

public class Buch {
	private static long nextID;
	private long id;
	private String titel;
	private String verlag;
	private String isbn;
	private float preis;
	private Autor[] autoren;

	{
		id = nextID;
		nextID++;
	}

	public Buch(String titel, String verlag, String isbn, float preis, int capacity) {

		this.titel = titel;
		this.verlag = verlag;
		this.isbn = isbn;
		this.preis = preis;
		this.autoren = new Autor[capacity];
	}

	public long getId() {
		return id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getVerlag() {
		return verlag;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public static Buch readBookFromConsole() {
		String titel = IOTools.readString("Buchtitel: ");
		String verlag = IOTools.readString("Verlag: ");
		String isbn = IOTools.readString("ISBN: ");
		float preis = IOTools.readFloat("Preis: ");
		int capacity = IOTools.readInt("Zahl den Autoren: ");

		return new Buch(titel, verlag, isbn, preis, capacity);
	}

	public boolean istAutorHinzugefuegt(Autor a) {
		for (int i = 0; i < autoren.length; i++) {
			if (autoren[i] == null) {
				autoren[i]=a/*.setName(a.getName());
				autoren[i].setVorname(a.getVorname())*/;
				return true;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return "Buch [id=" + id + ", titel=" + titel + ", verlag=" + verlag + ", isbn=" + isbn + ", preis=" + preis
				+ ", autoren=" + Arrays.toString(autoren) + "]";
	}
	
}
