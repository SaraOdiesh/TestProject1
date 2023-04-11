package Class_02_02_23Abstraction;

public class Fish implements Prey,Predator{


	public void hunt() {
		System.out.println("This fish is hunting smaller fishes");
		
	}

	
	public void flee() {
		System.out.println("This fish is fleeing from larger fishes");
		
	}

}
