package _08_03;

import java.util.Arrays;

public class Uebung {
	public static int getIndexOfDigit(int[] arr, int x) {
		// int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;

	}

	public static int getCountOfDigit(int[] arr, int x) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPresent(int[] arr, int x) {
		if (getIndexOfDigit(arr, x) >= 0/* !=-1 */)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int[] test = { 1, 2, 3, 3, 9, 8, 4, 2, 3 };
		int zahl = 3;
		System.out.println("Index der Zahl " + zahl + " ist " + getIndexOfDigit(test, zahl));
		System.out.println("Anzahl des Treffs: " + getCountOfDigit(test, zahl));
		System.out.println("Ob die Zahl " + zahl + " vorhanden ist: " + isPresent(test, zahl));
	}
}
