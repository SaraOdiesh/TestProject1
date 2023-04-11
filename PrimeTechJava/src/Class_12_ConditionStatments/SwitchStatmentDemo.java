package Class_12_ConditionStatments;

public class SwitchStatmentDemo {
	// only int, String, enum can be use in the switch expression 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  switch(10+10) {
  case 4:
	  System.out.println("Result is 4");
	  break;
  case 5:
	  System.out.println("Result is 5");
	  break;
  case 6:
	  System.out.println("Result is 6");
	 break;
  case 7,8,9,10:
	  System.out.println("numbers between 7-10");
  default:
	  System.out.println("Default Case");
  break;
  
 
  }
   switch(5+6) {
  case 9:
	  System.out.println("Result is 9");
	  break;
  case 12:
	  System.out.println("Result is 12");
	  break;
  case 11:
	  System.out.println("Result is 11");
	  break;
	  default:
		  System.out.println("Default Case");
  }
  int num =10;
  switch (num) {
  case 5:
	  System.out.println("5");
	 
	  break;
  case 10:
	  System.out.println("10");
	  System.out.println("I found it!");
	  break;
  case 15:
	  System.out.println("15");
	  break;
	  
  }
  
  System.out.println("Outside of the switch statement");
	}

}
