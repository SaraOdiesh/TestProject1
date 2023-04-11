package Class_02_02_23Abstraction;

public abstract class Animal {
	
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	abstract void makeSound();
	
	
	void eat() {
		
		System.out.println("Animal is eating!");
	
		
		}	
	void printAnimalInfo() {
		
		
		
	}

}
