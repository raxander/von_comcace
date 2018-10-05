package _08_03;

import Prog1Tools.IOTools;

public class BMI_Metoden {
	public static float calcBMI(float bodyWeight, float bodyHeight) {
		// BMI = Körpergewicht [kg] / (Körpergröße [m])²
//https://www.foodspring.de/bmi#durchschnitt
		return bodyWeight / (bodyHeight * bodyHeight);
	}

	public static String evaluateBMI(boolean isMan, byte age, float bmi) {
		String result = "";

		if (bmi < 16.0)
			result = "starkes Untergewicht";
		else if (bmi < 17.0)
			result = "Mäßiges Untergewicht";
		else if (bmi < 18.5)
			result = "Leichtes Untergewicht";
		else if (bmi < 24.9)
			result = "Normalgewicht";
		else if (bmi < 29.9)
			result = "Präadipositas";
		else if (bmi < 34.9)
			result = "Adipositas Grad I";
		else if (bmi < 39.9)
			result = "Adipositas Grad II";
		else if (bmi > 40.9)
			result = "Adipositas Grad III";
		else
			result = "ein Problem";
		//Durchschnitts-BMI für Frauen und Männer
		if (bmi <= 30.0) {
			if (!isMan) {
				if (age < 18 && (bmi > 19 && bmi < 24))
					result += " [für Frauen im Alter 16-17, normal]";
				if (age < 19 && (bmi > 19 && bmi < 24))
					result += " [für Frauen im Alter 18, normal]";
				if (age < 25 && (bmi > 19 && bmi < 24))
					result += " [für Frauen im Alter 19-24, normal]";
				if (age < 34 && (bmi > 20 && bmi < 25))
					result += " [für Frauen im Alter 25-34, normal]";
				if (age < 44 && (bmi > 21 && bmi < 26))
					result += " [für Frauen im Alter 35-44, normal]";
				if (age < 54 && (bmi > 22 && bmi < 27))
					result += " [für Frauen im Alter 45-54, normal]";
				if (age < 64 && (bmi > 23 && bmi < 28))
					result += " [für Frauen im Alter 55-64, normal]";
				if (age < 90 && (bmi > 25 && bmi < 30))
					result += " [für Frauen im Alter 65-90, normal]";
			}else {
				if (age == 16 && (bmi > 19 && bmi < 24))
					result += " [für Männer im Alter 16, normal]";
				if (age < 17 && (bmi > 20 && bmi < 25))
					result += " [für Männer im Alter 17, normal]";
				if (age < 18 && (bmi > 20 && bmi < 25))
					result += " [für Männer im Alter 18, normal]";
				if (age < 25 && (bmi > 21 && bmi < 26))
					result += " [für Männer im Alter 19-24, normal]";
				if (age < 34 && (bmi > 22 && bmi < 27))
					result += " [für Männer im Alter 25-34, normal]";
				if (age < 54 && (bmi > 23 && bmi < 28))
					result += " [für Männer im Alter 45-54, normal]";
				if (age < 64 && (bmi > 24 && bmi < 29))
					result += " [für Männer im Alter 55-64, normal]";
				if (age < 90 && (bmi > 25 && bmi < 30))
					result += " [für Männer im Alter 65-90, normal]";
			}
		}
		return result;

	}

	public static void main(String[] args) {
		boolean isMan = IOTools.readBoolean("Bist du ein Mann [true/false]? ");
		byte age = IOTools.readByte("wie Alt bist du? ");
		float bodyWeight = IOTools.readFloat("wie schwer bist du [in kg]? ");
		float bodyHeight = IOTools.readFloat("Wie hoch bist du [in meter]? ");
		float bmi = calcBMI(bodyWeight, bodyHeight);
		System.out.println("Dein BMI = " + bmi + " - " + evaluateBMI(isMan, age, bmi));
	}
}
