package _09_05;

import java.util.Arrays;

/*Schreiben Sie eine Methode zeilenSumme mit folgenden Eigenschaften:
 Die Methode ist eine Klassenmethode.
 Die Methode hat eine quadratische double-Matrix (ein zweidimensionales Feld) als einzigen formalen Parameter.
 Die Methode gibt einen double-Vektor (ein eindimensionales Feld) als Ergebnis zurück.
 Jede Komponente k des Ergebnis-Vektors berechnet sich als die Summe
aller Elemente der k-ten Zeile der Matrix.*/

public class ArrayAufgabe {
	public static double[] zeilenSumme(double matrix[][]) {
		double[] vektor = new double[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				vektor[i] += matrix[i][j];
			}
		}
		return vektor;
	}

	public static void main(String[] args) {
		double[][] matrix = new double[][] { { 2.1, 3.1 }, { 3.4, 1.1 }, { 2.5, 6.1 }, };
		double[] test= zeilenSumme(matrix);
		System.out.println(Arrays.toString(test));
	}
}
