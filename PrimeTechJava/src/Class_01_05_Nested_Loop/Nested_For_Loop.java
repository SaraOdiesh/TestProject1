package Class_01_05_Nested_Loop;

import java.util.Scanner;

public class Nested_For_Loop {

	public static void main(String[] args) {
//	
//		for(int i =0;i<5;i++) {
//			System.out.println("i: " +i);
//			for(int j=0;j<5;j++) {
//				System.out.println("j: " + j);
//			}
//		}
//		for(int i =1;i<=5;i++) {
//			
//			System.out.println(i);
//			for(int j=1;j<=5;j++) {
//				System.out.print(j); 
//			}
//			System.out.println();
//		}
//		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Input a number");
		
		int userInput= scan.nextInt();
		for(int i =1; i<=userInput; i++) {
			//System.out.println(userInput + "*" +(i+1)+ "=" + (userInput * (i+1)));
			for(int j=1; j<=10;j++) {
				System.out.println(j + "*" + i + "=" + (i*j)); 
			}
		}
		// Write a program that accepts a user input as a number. 
		//It should then print the multiplication table up to that
		// number.
		
		
	}

}
