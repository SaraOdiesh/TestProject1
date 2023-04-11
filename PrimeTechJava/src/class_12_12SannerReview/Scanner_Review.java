package class_12_12SannerReview;

import java.util.Scanner;

public class Scanner_Review {

	public static void main(String[] args) {
		
   Scanner Scanner=new Scanner (System.in);
   System.out.println("Please enter two numbers one by one: ");
   // Instantiating Scanner Class/Creating Scanner Class Object
   int num1=Scanner.nextInt();
   int num2=Scanner.nextInt();
   System.out.println("You entered two numbers: "+ num1 + " and " + num2);
   System.out.println(num1 +  " + " + num2 + " = " + (num1 + num2));
   
	}

}
