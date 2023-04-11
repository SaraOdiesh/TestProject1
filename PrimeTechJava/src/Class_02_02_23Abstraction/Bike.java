package Class_02_02_23Abstraction;

public class Bike implements Vehicle{

	int speed;
	int gear;
	
	
	public void changeGear(int newGear) {
	this.gear = newGear;
	
		
	}

	
	public void speedUp(int increment) {
		
		speed +=increment;
	}


	public void applyBreaks(int decrement) {
		
		speed-=decrement;
		
		
	}

	public void printStates() {
		System.out.println("Speed: " + speed + " " + ", gear: " + gear);
	}
}
