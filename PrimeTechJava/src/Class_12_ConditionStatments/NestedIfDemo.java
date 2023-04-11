package Class_12_ConditionStatments;

public class NestedIfDemo {

	public static void main(String[] args) {
		int age = 15;
		if(age>=18) {
			
			if(age>=17) {
				System.out.println("Welcome to the club");
			} 
			else {
				System.out.println("You are under age");
			}
			
			
		} else {
			System.out.println("Your are too young!");
		}
	}

}
