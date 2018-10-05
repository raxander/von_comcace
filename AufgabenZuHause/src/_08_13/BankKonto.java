package _08_13;

public class BankKonto {
	private int blz;
	private String kontonummer;
	private float kontostand;
	private String kreditinstitut;
	private char giro_Spar;
	
	@Override
	public String toString() {
		return "BankKonto [blz=" + blz + ", kontonummer=" + kontonummer + ", kontostand=" + kontostand
				+ ", kreditinstitut=" + kreditinstitut + ", giro_Spar=" + giro_Spar + "]";
	}
	
	public BankKonto(int blz, String kontonummer, float kontostand, String kreditinstitut, char giro_Spar) {
		
		this.blz = blz;
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.kreditinstitut = kreditinstitut;
		this.giro_Spar = giro_Spar;
	}

	
	public int getBlz() {
		return blz;
	}

	public void setBlz(int blz) {
		this.blz = blz;
	}

	public String getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}

	public float getKontostand() {
		return kontostand;
	}

	public void setKontostand(float kontostand) {
		this.kontostand = kontostand;
	}

	public String getKreditinstitut() {
		return kreditinstitut;
	}

	public void setKreditinstitut(String kreditinstitut) {
		this.kreditinstitut = kreditinstitut;
	}

	public void setGiro_Spar(char giro_Spar) {
		this.giro_Spar = giro_Spar;
	}
	
	public BankKonto[] bankKontos(byte n, int blz, String kontonummer, float kontostand, String kreditinstitut, char giro_Spar){
		BankKonto[] bk=new BankKonto[n];
		for(int i=0;i<n;i++) {
			bk[i]=new BankKonto(blz, kontonummer, kontostand, kreditinstitut, giro_Spar);
		}
		return bk;
	}
	
}
