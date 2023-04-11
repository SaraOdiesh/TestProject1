package Class_12_07ConditionalStatments;

public class Task_CheckEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number=11;
     // number % 2 ==0 ==> even
     if(number % 2 == 0) {
    	 System.out.println("It is Even Number");
     }
     else {
    	 System.out.println("It is Odd Number");
     }
     int angle1= 90;
     int angle2= 45;
     int angle3= 45;
     boolean isTriangle = angle1 + angle2 + angle3 ==180;
    		 
     if(isTriangle) {
    	 
    	 System.out.println("");
    	 
    	 int num1 = 15;
    	 int num2 = 20;
    	 int num3 = 25;
    	 int num4 = 30;
    	 
    	 if(num1<num2 && num1<num3 && num1<num4) {
 			System.out.println("num1 is smallest "+ num1);
 		} else if(num2<num1 && num2<num3 && num2<num4) {
 			System.out.println("num2 is smallest "+ num2);
 		} else if(num3<num1 && num3<num2 && num3<num4) {
 			System.out.println("num3 is smallest " +num3);
 		} else if(num4<num1 && num4<num2 && num4<num3) {
 			System.out.println("num4 is smallest " + num4);
 		}
     }
    
     }
     
     
     
     
	}


