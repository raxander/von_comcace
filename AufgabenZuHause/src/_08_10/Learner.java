package _08_10;

public class Learner {
	private static int counter;
	
	private String lastname;
	private String name;
	private Address address;
	
	private String course;
	private int lCount;
	private String telephon;//+491498894514
	private String eMail;
	public Learner(String lastname, String name, Address address, String course, 
							String telephon, String eMail) {
		
		this.lastname = lastname;
		this.name = name;
		this.address = address;
		this.course = course;
		this.telephon = telephon;
		this.eMail = eMail;
		counter++;
		lCount=counter;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getLastname() {
		return lastname;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getlCount() {
		return lCount;
	}
	public String getTelephon() {
		return telephon;
	}
	public void setTelephon(String telephon) {
		this.telephon = telephon;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Override
	public String toString() {
		return "Teilnehmer/in Nr."+ lCount +": " +
				name + 
				" " + lastname + 
				",\n " + address +
				", telephon= "+ telephon + 
				", eMail=" + eMail/*+
				", Kursname - " + course*/;
	}
	
	
}
