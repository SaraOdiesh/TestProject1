package Class_01_19_23_Static;

public class Person {
	
	// this is a static member that belongs to the class
	
	static String breed;
	
	// Instance Variable 
	
	String name;
	int age;
	
	
	public Person(  String name , int age) {
		
		this.name = name;
		this.age = age;
		
		
	}
	
	
	  public static void printBreed() {
    	  System.out.println("Breed: " + Person.breed);
      }
	
	public void getPersonInfo() {
		System.out.println("********Person Info********");
		System.out.println("Bread: " + breed);
		System.out.println("Name: " + this.name);
		System.out.println("age: " + this.age);
	}
		

}
