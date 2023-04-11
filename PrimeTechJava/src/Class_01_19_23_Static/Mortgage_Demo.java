package Class_01_19_23_Static;

public class Mortgage_Demo {

	public static void main(String[] args) {
		
		// initialize static variables.
		MortgageAccount.bankName = "Bank Of America";
		MortgageAccount.bankAddress = "123 South Maple St,Irvine";
		
		// create an object using no -arg constructor. 
		
		MortgageAccount account = new MortgageAccount();
		account.setInterestRate(4.0);
		System.out.println("Interest Rate: "+ account.getInterestRate());
	   
	    account.displayAccountInfo();

	    // Create an object using Parameterized constructor
	    
	 MortgageAccount account2 = new MortgageAccount(1000000,1000000, "Fixed",621989, 30,0.05);
	 account2.setInterestRate (0.05);
     account2.getInterestRate();
	
	 account2.displayAccountInfo();
	 
	 MortgageAccount account3 = new MortgageAccount(900000,900000, "Fixed",3509, 30,0.04);
	 account3.setInterestRate (0.04);
	 System.out.println("Interest Rate: " + account3.getInterestRate());
	
	 account3.displayAccountInfo();
	 
	 
	 
	 MortgageAccount account4 = new MortgageAccount(500000,500000, "Fixed",2219, 30,0.03);
	 account4.setInterestRate (0.03);
     account4.getInterestRate();
	 account4.displayAccountInfo();
	 //make one monthly payment 
	  account4.makeAPayment();
	  account4.displayAccountInfo(); 
	 // account4.makeAPayment(20000);
	  account4.displayAccountInfo(); 
		
		
		

	}

}
