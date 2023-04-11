package Class_02_02_23Abstraction;

public abstract class  Shape {
    
	public String name;
	// Concrete Methods with body
	public void printInfo() {
		System.out.println("Printing info");
	}
	// Abstract method
	public abstract void display();
	
	
	public abstract void display(String info);
}
