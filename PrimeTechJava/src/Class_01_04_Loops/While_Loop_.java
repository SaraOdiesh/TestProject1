package Class_01_04_Loops;

import java.util.Scanner;

public class While_Loop_ {

	public static void main(String[] args) {
		//Write a program that calculates the sum of even 
		// between 0 and 20 using while loop.
		
//		String username= "test123";
//		String password= "ps123";
		
		
		Scanner scan = new Scanner(System.in);
		String correctUsername = "username";
	    String correctPassword = "password";
		while(true) {
			System.out.println("Please enter your username: ");
			String userName = scan.next();
			System.out.println("Please enter your password");
			String password = scan.next();
			if(userName.equals(correctUsername) && password.equals(correctPassword)) {
				System.out.println("You entered correct credentials");
				break;
			}			else {
				System.out.println("Invalid credentials, please try again");
			}
		}}}
			
//			}
//		
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int sum = 0;
//        int i = 0;
//        
//       
//        while (i <= 20) {
//            if (i % 2 == 0) { 
//                sum += i;      
//            }
//            i++;         
//        }
//      
//        System.out.println("The sum of even numbers between 0 and 20 is " + sum);
//	}
//	}
//		int num = 0;
//		int sum = 0;
//     while(num <=20) {
//    	 if(num%2==0) {
//    		 sum = sum + num;
//    	 }
//    	// System.out.println(num);
//    	 num++;
//     }  
//     
//     System.out.println("Sum: " +sum);
	


