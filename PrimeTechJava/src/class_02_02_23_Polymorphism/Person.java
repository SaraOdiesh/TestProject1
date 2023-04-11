package class_02_02_23_Polymorphism;

public class Person {
public void greet() {
	System.out.println("Greeting");
}
}

class English extends Person{
	public void greet() {
		System.out.println("English Greeting");
	}
	
}

class Germen extends Person{
	public void greet() {
		System.out.println("Germen  Greeting");
	}
	
}
class French extends Person{
	public void greet() {
		System.out.println("French  Greeting");
	}
	
}
