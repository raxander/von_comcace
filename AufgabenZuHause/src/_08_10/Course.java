package _08_10;

import java.util.Arrays;

public class Course {
	private static int counter;

	private String course;// Kursname
	private short durationDay;// Zeitdauer
	private char type;// u-Umschulung, w-Weiterbildung
	private int courseID;// Kurs-ID
	private int current;// Teilnehmerzahl

	private Learner[] tlist;
	private String dozent;

	public Course(String course, short durationDay, int capacity, String dozent, char type) {

		this.course = course;
		this.durationDay = durationDay;
		this.type = type;
		tlist = new Learner[capacity];
		this.dozent = dozent;// Besser eine Klasse wie Person
		counter++;
		courseID = counter;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public short getDuration() {
		return durationDay;
	}

	public void setDuration(short duration) {
		this.durationDay = duration;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Kurs Nr." + courseID + " [Kursname - " + course + ", Zeitdauer: " + durationDay + ",  "
				+ Arrays.toString(tlist) + ", Kursart - " + type + "]";
	}

	public boolean isEmpty() {
		return current == 0;
	}

	public boolean learnerTake(Learner l) {
		for (int i = 0; i < tlist.length; i++) {
			if (tlist[i] == null) {
				tlist[i] = l;
				current++;
				return true;
			}
		}
		return false;
	}

	public boolean isLearnerDelete(String lastname, String name) {
		for (int i = 0; i < tlist.length; i++) {
			Learner learner = tlist[i];
			if (learner.getLastname() == lastname && learner.getName() == name) {
				tlist[i] = null;
				current--;
				return true;
			}
		}

		return false;
	}
}
