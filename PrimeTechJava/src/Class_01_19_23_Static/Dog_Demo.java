package Class_01_19_23_Static;

public class Dog_Demo {

	public static void main(String[] args) {
		
		
		Dog.breed = "Labradoodle";
		Dog.color = "Silver";
		  Dog.bark();
		  Dog.eat();
		System.out.println(Dog.breed);
		System.out.println(Dog.color);

		
	Dog dog1= new Dog("Sunny", "Big", 1);
	
	System.out.println(dog1.name);
	System.out.println(dog1.size);
	System.out.println(dog1.age);
     dog1.printDogInfo();
     
     
     Dog dog2= new Dog("Simba", "Small", 8);
 	
 	System.out.println(dog2.name);
 	System.out.println(dog2.size);
 	System.out.println(dog2.age);
      dog1.printDogInfo();
    
      

      Dog dog3= new Dog("Motchi", "Small", 10);
  	
  	System.out.println(dog3.name);
  	System.out.println(dog3.size);
  	System.out.println(dog3.age);
       dog1.printDogInfo();
	}

}
