package Class_01_26_23_Inheritance;

public class BankOfAmericaATM extends ATM {
     private double balance ;
     @Override
	void withdraw(double amount) {
		if(balance>= amount) {
			balance -=amount;
		} else {
			System.out.println("Insuffeicient balance");
		}
		
	}
     @Override
	void depositCash(double amount) {
		if(balance >=amount) {
			balance +=amount;
		} 
	}

     @Override
	void depositCheck(double amount) {
		if(balance >= amount) {
			balance +=amount;
		}
		
			
		}
	
	   

			@Override
			double checkBalance() {
			
				return balance;
			}

}
