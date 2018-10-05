package _09_13_date_time;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Prog1Tools.IOTools;

//public enum AmericanTime{
//		01,02,03,04,05,06,07,08,09,10,11,12
//	}
public class TimeConverter {

	public String readTimeFromConsole() throws TimeFormatMistake {

		String s = IOTools.readString("Zeit:");
		if (s.equals("n"))
			return "End of programm";
		if (s.length() == 5 & s.matches("(0[1-9]|2[0-4]|1[0-9]|[1-9]):[0-5]\\d")) {// ^(0[1-9]|2[0-4]|1[0-9]|[1-9])$
																					// oder [0-2]\\d:[0-5]\\d
			String sHour = s.substring(0, 2);// Hour
			String sMinute = s.substring(3, 5);// Minute

			// System.out.println(sHour + ":" + sMinute);//----- TEST -----

			// American Time
			GregorianCalendar cal = new GregorianCalendar();
			cal.set(Calendar.HOUR, Integer.parseInt(sHour));
			int value = cal.get(Calendar.AM_PM);

			// output
			return cal.get(Calendar.HOUR) + ":" + sMinute + (value == cal.AM ? " AM" : " PM");

		} else {
			throw new TimeFormatMistake("Die Zeiteingabe ist nicht richtig");
		}
	}

	public static void main(String[] args) throws TimeFormatMistake {

		TimeConverter tc = new TimeConverter();
		while (true) {
			String s = tc.readTimeFromConsole();

			System.out.println(s);
			if (s.equals("End of programm"))
				break;
		}
		/*
		 * GregorianCalendar cal = new GregorianCalendar();
		 * cal.set(Calendar.HOUR_OF_DAY, 22); cal.set(Calendar.HOUR, 22); int value =
		 * cal.get(Calendar.AM_PM); if (value == cal.AM) { System.out.println(" AM"); }
		 * else if (value == cal.PM) { System.out.println(" PM"); }
		 * System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		 * System.out.println(cal.get(Calendar.HOUR));
		 */

	}
}
