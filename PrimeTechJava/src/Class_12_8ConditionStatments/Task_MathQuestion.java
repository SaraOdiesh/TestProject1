package Class_12_8ConditionStatments;

import java.util.Scanner;

public class Task_MathQuestion {

	public static void main(String[] args) {
	
	// questions
	
   System.out.println("What is result of 3+3?");
   // instantiate The Scanner class
   Scanner scanner= new Scanner(System.in);
   int result= scanner.nextInt();
   if(result==6) {
	   System.out.println("Your answer is correct!");
   }
   else {
	   System.out.println("Invalid answer! ");
   }
	}

}
