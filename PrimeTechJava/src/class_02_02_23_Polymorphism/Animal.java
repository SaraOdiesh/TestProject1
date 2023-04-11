package class_02_02_23_Polymorphism;

abstract class Animal {
	public void eat() {
		System.out.println("Animal Eating");
	}
  public abstract void sound();
  
}
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Woof Woof");
		
	}
	
} 
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("Meao ");
		
	}
	
}
class Duck extends Animal{

	@Override
	public void sound() {
		System.out.println("Quak Quak");
		
	}
	


public static void main(String[] args) {
	
	Animal animal1 = new Dog();
	Animal animal2 = new Cat();
	Animal animal3 = new Duck();
	animal1.sound();
	animal1.eat();
	animal2.sound();
	animal2.eat();
	animal3.sound();
	animal3.eat();
	
}
}