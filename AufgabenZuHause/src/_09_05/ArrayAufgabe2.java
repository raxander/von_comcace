package _09_05;

import java.util.Arrays;

public class ArrayAufgabe2 {
	/*
	 * Schreiben Sie eine Methode delete (mit Parametern k und dFeld), die die k-te
	 * Komponente aus dem double-Feld dFeld entfernt und das dabei entstehende (um
	 * eine Komponente verkürzte) Feld als Ergebnis zurückliefert. Ist k kleiner als
	 * 0, so ist die Komponente 0 des Feldes zu entfernen. Ist k größer oder gleich
	 * der Länge von dFeld, so ist die letzte Komponente des Feldes zu entfernen.
	 */

	static double[] delete(int k, double[] dFeld) {
		int arrL = dFeld.length;
		double[] newFeld = new double[arrL - 1];
		int y = 0;//newFeld index
		int i = 0;//dFeld index
		if (k < 0)
			++i;//dFeld index
		
		else if (k >= arrL)
			arrL--;

		while (y < newFeld.length/* arrL-1 */) {
			if (k == i)
				i++;//dFeld index
			newFeld[y] = dFeld[i];
			i++;//dFeld index
			y++;//newFeld index
		}

		return newFeld;
	}

	public static void main(String[] args) {
		double[] test = delete(3, new double[] { 12, 1, 3, 6.1, 78.4 });
		System.out.println(Arrays.toString(test));
	}
}
