package Class_12_8ConditionStatments;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		/* Scanner is a class which must be instantiated before it can be used.
		 * System.in is the parameter passed to the scanner constructor so that Java
		 * knows to connect the new Scanner to the keyboard.
		 * Scanner keyboard= new Scanner(System.in);
		 */
	// Instantiating Scanner class
		
     Scanner scanner = new Scanner (System.in);
     System.out.println("What is your name: ");
     String userInput= scanner.nextLine();
     System.out.println("Your name is: "+userInput );
    String userInput2=scanner.nextLine();
    System.out.println("What is your favorite hobby: "+userInput);
    String  userInput3=scanner.nextLine();
    System.out.println("What is your favorite food: "+userInput);
     String userInput4=scanner.nextLine();
     
     
     
     
	}

}
