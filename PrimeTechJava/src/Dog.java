
public class Dog extends Pet{

		public Dog(String name, String color) {
		super(name,color);
	
	}

	public static void main(String[] args) {
	
		 Dog myDog = new Dog("Sunny", "Silver");
	        myDog.play();
	        myDog.speak();
	}

}
