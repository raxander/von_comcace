package _08_13;

public class Inhaber {
	private int idInhaber;
	private Person person;
	private Address adresse;
	private static int inhabCount;
	
	public Inhaber(Person person, Address adresse) {
		
		this.person = person;
		this.adresse = adresse;
		inhabCount++;
		idInhaber=inhabCount;
		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAdresse() {
		return adresse;
	}

	public void setAdresse(Address adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Inhaber [idInhaber=" + idInhaber + ", person=" + person + ", adresse=" + adresse + "]";
	}
	
	public Inhaber inhAddFromConsole() {
		Person person = null;//=new Person(vorname, nachname);
		Address address=null;
		
		person.readPersonFromConsole();
		Address.readAddresFromConsole();
		return new Inhaber(person, address);
		
	}
}
