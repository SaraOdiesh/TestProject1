package Class_01_05_23ClassAndObject;

public class ClasdsAndObject {

	public static void main(String[] args) {
		
		
	Dog dog1 = new Dog();
	System.out.println("-----------Dog 1---------");
	dog1.age = 3;
	dog1.breed = "Labradoodle";
	dog1.color = "white";
	dog1.size = "Large";
	
	System.out.println(dog1.age);
	System.out.println(dog1.breed);
	System.out.println(dog1.size);
	System.out.println(dog1.color);
	
	System.out.println("-----------Dog 2---------");
	Dog dog2 = new Dog();
	dog2.age = 1;
	dog2.breed = "Labradoodle";
	dog2.color = "white";
	dog2.size = "Large";
	System.out.println(dog2.age);
	System.out.println(dog2.breed);
	System.out.println(dog2.size);
	System.out.println(dog2.color);
	}

}
