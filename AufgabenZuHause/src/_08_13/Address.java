package _08_13;

import Prog1Tools.IOTools;

public class Address {
private String str_hnr;
private int plz;
private String ort;
public String getStr_hnr() {
	return str_hnr;
}
public void setStr_hnr(String str_hnr) {
	this.str_hnr = str_hnr;
}
public int getPlz() {
	return plz;
}
public void setPlz(int plz) {
	this.plz = plz;
}
public String getOrt() {
	return ort;
}
public void setOrt(String ort) {
	this.ort = ort;
}
public Address(String str_hnr, int plz, String ort) {
	
	this.str_hnr = str_hnr;
	this.plz = plz;
	this.ort = ort;
}
@Override
public String toString() {
	return "Address [str_hnr=" + str_hnr + ", plz=" + plz + ", ort=" + ort + "]";
}
public static Address readAddresFromConsole() {
	String str, ort;// = null,nn;
	int plz;
	str = IOTools.readString("Straße: ");
	plz=IOTools.readInt("Postleitzahl: ");
	ort=IOTools.readString("Ort: ");
	return new Address(str, plz, ort);
}
}
