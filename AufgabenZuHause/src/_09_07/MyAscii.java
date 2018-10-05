package _09_07;

public class MyAscii {
	/**
	 * 
	 * Ermittelt einen Ausschnitt der ASCII-Tabelle (Zeichen Darstellung). Keine
	 * Konsolenausgabe!
	 */
	public static String get_ascii_area(int untere_grenz, int obere_grenz) {
		char[] c = new char[obere_grenz - untere_grenz + 1];
		for (int i = untere_grenz, y = 0; i <= obere_grenz; i++, y++) {
			c[y] = (char) i;
			// System.out.print(c);

		}

		return new String(c);

	}

	/**
	 * 
	 * Schreibt die Implementierung einer Methode - print -, die einen Auschnitt der
	 * ASCII-Tabelle auf der Konsole ausgibt (Zeichen X ASCCI-Wert als Dezimal X
	 * ASCII-Wert als Hexadezimal X ASCII- WERT als Oktal X ASCII-Wert als Bin�r)
	 * 
	 * Hinweis: Zeilenumbruch nach der 10. Zahl Beispiel A 65 0X** 0*** 0B*** B 66
	 * 0X** 0*** 0B*** ... J 74 0X** 0*** 0B*** K 75 0X** 0*** 0B*** L 76 0X** 0***
	 * 0B*** ... T 84 0X** 0*** 0B*** U 85 0X** 0*** 0B*** ... Z90 0X** 0*** 0B***
	 */
	/*
	 * Convert Hex to ASCII in Java | Baeldung
	 * https://www.baeldung.com/java-convert-hex-to-ascii
	 */
	public static void print_ascii_area(int untere_grenz, int obere_grenz) {
		String s = null;
		char c=' ';
		StringBuilder ascii = new StringBuilder();
		for (int i = untere_grenz, count = 1; i <= obere_grenz; i++, count++) {
			c = (char) i;

			s = (count % 3 == 0) ? "\n" : "\t\t";
			ascii.append(c).append("\t").append(i).append("\t0x").append(Integer.toHexString(i)).append("\t0")
					.append(Integer.toOctalString(i)).append("\t0b").append(Integer.toBinaryString(i)).append(s);
		}
		System.out.println(ascii);
	}

	public static void main(String[] args) {
//		int i=60;
//		System.out.println(get_ascii_area(i,70));
		print_ascii_area(33, 100);
		/*
		 * System.out.println(); System.out.println("Hex "+
		 * Integer.toHexString(i)+" Oct "+Integer.toOctalString(i)+
		 * " Bin "+Integer.toBinaryString(i)); System.out.println("Hex "+
		 * Integer.toString(i,16)+" Oct "+Integer.toString(i,8)+
		 * " Bin "+Integer.toString(i,2));
		 */
	}

}
