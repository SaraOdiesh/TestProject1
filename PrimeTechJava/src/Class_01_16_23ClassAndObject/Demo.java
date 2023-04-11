package Class_01_16_23ClassAndObject;

public class Demo {
	public static void main(String[] args) {
		
		
		
	ATM atm = new ATM ();	
	atm.getInfo();
//	System.out.println("Bank name: " + atm.bankName);
//	System.out.println("Location : " + atm.location);
//	System.out.println("Color: " + atm.color);
//	System.out.println("Model: " + atm.model);
//	System.out.println("Cash Resereved: " + atm.cashReserved);
//	System.out.println("Is Active: " + atm.isActive);
	
	
	System.out.println("-----------------------------------");
  ATM atm2 =  new ATM ("Citi Bank", "Anaheim", "White", "qwe456",200000,false);
  atm2.getInfo();
//    System.out.println("Bank Name is: " + atm2.bankName);
//    System.out.println("Location: " + atm2.location);
//    System.out.println("Color: " + atm2.color);
//    System.out.println("Model: " + atm.model);
//    System.out.println("Cash Reserved: " + atm2.cashReserved);
//    System.out.println("Is Active: " + atm2.isActive);

		System.out.println("----------------------------");
	
	ATM atm3 = new ATM ("Wells Fargo" , "asd789");
	System.out.println("Bank Name: " + atm3.bankName);
	System.out.println("Model: " + atm3.model);
	
	
	
	
	
	
	
	
	
//		ATM atm4 = new ATM();
//		atm4.setUpATM("Chase" , "Anaheim", "White", "123abc", 300000, true);
//	
//		//atm4.depositCash();
//		//atm4.getInfo();
//		//System.out.println("Cash Reserved: " + atm4.getCashReserve);
//		atm4.withdrawcash();
//		atm4.withdrawcash();
//		
		
		
		
		
		
//		String location = atm4.getLocation();
//		System.out.println("Bank Location: " + location);
//		
//		String model = atm4.model();
//		System.out.println("Bank Model: " + model);
//		
//		String color = atm4.color();
//		System.out.println("Bank color: " + color);
//		
//		System.out.println("Bank Cash Reserved: " + atm4.cashReserved);
//		System.out.println("Bank Status: " + atm4.isActive);
//		
	
		
		
		
		
		
	//	ATM atm1 = new ATM();
//		atm1.bankName =("Bank of America");
//		atm1.location = "Fairfax";
//		atm1.color = "Black";
//		
		
		
		
		
		
		
//		System.out.println(atm1.bankName);
//		System.out.println(atm1.location);
//		System.out.println(atm1.color);
//		System.out.println(atm1.model);
//		//System.out.println(atm1.cashRederved);
//		System.out.println(atm1.isActive);
	}
}
