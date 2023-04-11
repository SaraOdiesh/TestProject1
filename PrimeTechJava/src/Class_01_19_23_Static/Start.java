package Class_01_19_23_Static;

public class Start {

	public static void main(String[] args) {
		
		Person.breed = "Human";
		
      Person p1  = new Person("Sara", 50);
      p1.getPersonInfo();
      
      Person p2 = new Person ("Mason", 7);
      p2.getPersonInfo();
      Person p3 = new Person ("AnnaBella", 5);
      p3.getPersonInfo();
      //Person.printBreed = "Human";
      Person.printBreed();
      
      
      
}

	}


