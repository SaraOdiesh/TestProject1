package class_02_02_23_Polymorphism;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
 	public void add(int a, int b, int c) {
	System.out.println(a + b + c);
}  public void add(double a, double b) {
	System.out.println(a + b);
}
	 public void add(long a, long b) {
			System.out.println(a + b);
	 }



public static void main(String[] args) {
	Calculator calculator = new Calculator();
	
	calculator.add(5, 5);
	calculator.add(10.5, 5.5);
	
	//calculator.add(0, 0);
}
}
