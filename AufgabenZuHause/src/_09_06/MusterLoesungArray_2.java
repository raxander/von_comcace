package _09_06;

import java.util.Arrays;

import Prog1Tools.IOTools;

/**
 * 
 * Macht ihr zus�tzlich folgende Aufgaben:
 * 
 * 1. die zwei Methoden sollen folgendemaßen angepasst werden: -Kein
 * Rückgabewert und das Argument darf sich verändern -Trotzdem, keine
 * Konsolenausgabe innerhalb der Methoden 2. Eine Methode die ähnlich ist wie
 * die delete -Methode, aber dieses Mal wir geben als Parameter nicht ein index
 * k, sondern ein zu löschendes elemenet e. Dieses Element soll gelöscht werden,
 * falls es im Array vorkommt!
 *
 */
public class MusterLoesungArray_2 {

	public static void zeilenSumme(double[][] p) {
		final int n = p.length;
		double[] result = new double[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i] += p[i][j];
			}
		}

	}

	public static double[] zeilenSumme_2(double[][] p) {
		final int n = p.length;
		double[] result = new double[n];
		for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					result[i] += p[i][j];
//				}

			for (double d : p[i]) {
				result[i] += d;
			}
		}
		return result;

	}

	/**
	 * 
	 * @param k
	 * @param defeld
	 * @return
	 */
	public static double[] deleteOneEntry(int k, double[] defeld) {

		if (defeld.length == 0)
			return null;
		double[] result = null;
		// Ob 'k' im Array vorkommt
		for (double d : defeld) {
			if (d == (double) k) {
				result = new double[defeld.length - 1];
				break;
			}
		}
		if (result == null)
			return defeld;
		int n = defeld.length;
		boolean isFound = false;
		for (int i = 0, j = 0; i < n; i++) {

			if (defeld[i] != k || (defeld[i] == k & isFound == true)) {
				result[j++] = defeld[i];
			} else if (defeld[i] == k & isFound == false) {
				isFound = true;
			}
		}

		return result;
	}

	public static double[] deleteAllEntry(int k, double[] defeld) {

		if (defeld.length == 0)
			return null;
		double[] result = null;
		int count = 0;
		// Ob 'k' im Array vorkommt
		for (double d : defeld) {
			if (d == (double) k) {
				count++;
			}
		}

		if (count == 0)
			return defeld;
		else
			result = new double[defeld.length - count];

		int n = defeld.length;

		for (int i = 0, j = 0; i < n; i++) {
			if (defeld[i] != k)
				result[j++] = defeld[i];
		}

		return result;
	}

	public static void main(String[] args) {

		/*
		 * System.out.println(Arrays .toString((zeilenSumme(new double[][] { { 1, 2, 1,
		 * 2 }, { 2, 3, 2, 4 }, { 1, 0, 1, 2 }, { 3, 1, 5, 1 } }
		 * 
		 * ))));
		 */

		System.out.println(Arrays.toString(deleteOneEntry(11, new double[] { 15, 11, 17, 13, 11 })));
		System.out.println(Arrays.toString(deleteAllEntry(11, new double[] { 15, 11, 17, 13, 11 })));

		System.out.println(Arrays.toString(deleteOneEntry(1, new double[] {})));
		System.out.println(Arrays.toString(deleteAllEntry(1, new double[] {})));
		double[] a = null;
		System.out.println(Arrays.toString(a));

	}
}
