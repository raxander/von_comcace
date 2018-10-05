package _08_10;

public class Verwaltung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course java=new Course("Java",(short) 180,10,"Woundmu", 'w');
		Course cpp=new Course("Cpp",(short) 360,5,"Woundmu",'u');
		
		Learner aBarley=new Learner("Barley", "Angela", new Address("Glück Auf 89",  44137, "Dortmund"),
									"Java", "023188888","her@web.de");
		Learner kMerkel=new Learner("Merkel", "Katarina", new Address("Wieland Str. 34",  10578, "Berlin"),
									 "Java", "02888888","er@web.de");
		Learner hMaas=new Learner("Maas", "Horst", new Address("Glück Auf 89",  44137, "Dortmund"),
									 "Cpp", "023188888","hr@web.de");
		Learner hSeehofer=new Learner("Seehofer", "Heiko", new Address("Wieland Str. 34",  10578, "Berlin"),
									 "Cpp", "02888888","hhh@web.de");
		
		System.out.println(java.toString());
		System.out.println(cpp.toString());
		
		System.out.println(aBarley.toString());
		System.out.println(kMerkel.toString());
		System.out.println(hMaas.toString());
		System.out.println(hSeehofer.toString());
		
		System.out.println("Nr."+hSeehofer.getlCount()+" "+ hSeehofer.getName());
		
		java.learnerTake(aBarley);
		java.learnerTake(kMerkel);
		cpp.learnerTake(hMaas);
		cpp.learnerTake(hSeehofer);
		
		System.out.println(java.toString());
		System.out.println(cpp.toString());
		
		System.out.println(java.isLearnerDelete(kMerkel.getLastname(), kMerkel.getName()));
		System.out.println(cpp.isLearnerDelete(hMaas.getLastname(),hMaas.getName()));
		
		System.out.println(java.toString());
		System.out.println(cpp.toString());
	}

}
