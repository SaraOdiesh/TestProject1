package Class_01_16_23ClassAndObject;

public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Lamborghini";
		car1.model = "Huracan";
		car1.color ="Black";
		
		System.out.println("Car 1: make "+ car1.make + ",model: " + car1.model + ", color: "+ car1.color );
		
		Car car2 = new Car();
		car2.make = "Mercedes";
		car2.model = "G-Wagon";
		car2.color ="White";
		
		System.out.println("Car 2: make "+ car2.make + ",model: "+ car2.model+ ", color: "+ car2.color );
		Car car3 = new Car();
		car3.make = "Audi";
		car3.model = "r8";
		car3.color ="White";
		
		System.out.println("Car3 : make "+car3.make + ",model: " + car3.model+ ", color: " + car3.color );
	}
	

}
