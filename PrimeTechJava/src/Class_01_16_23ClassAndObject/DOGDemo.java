package Class_01_16_23ClassAndObject;

public class DOGDemo {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.breed = "Labradoodle";
		dog1.age = 1;
		dog1.size = "large";
		dog1.color = "Silver";
		dog1.name ="Sunny";
		
		
		
		System.out.println("Dog1 - breed: " + dog1.breed +", age: " + dog1.age + 
				 ", size: " + dog1.size + ", color: " + dog1.color + ", name: " + 
				 dog1.name);
		
		
		Dog dog2 = new Dog();
		
		dog2.breed = "Husky";
		dog2.age = 2;
		dog2.size = "large";
		dog2.color = "White";
		dog2.name ="Lucky";
		
		System.out.println("Dog2 - breed: " + dog2.breed +", age: " + dog2.age + 
				 ", size: " + dog2.size + ", color: " + dog2.color + ", name: " + 
				 dog2.name);
		
		Dog dog3 = new Dog();
		dog3.breed = "Chihuahua";
		dog3.age = 9;
		dog3.size = "small";
		dog3.color = "White";
		dog3.name ="Mochi";
		
		 System.out.println("Dog3 - breed: " + dog3.breed +", age: " + dog3.age + 
				 ", size: " + dog3.size + ", color: " + dog3.color + ", name: " + 
				 dog3.name);
	}

}
