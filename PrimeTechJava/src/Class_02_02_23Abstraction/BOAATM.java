package Class_02_02_23Abstraction;

public class BOAATM implements ATM{

	  private double balance = 0;
	    
		@Override
		public void withdraw(double amount) {
			if(amount<balance) {
				System.out.println(" Amount you");
			} else {
			 this.balance -=amount;
			}
			
		}

		@Override
		public void deposit(double amount) {
			this.balance+=amount;
			
		}

		@Override
		public void checkBalance() {
			System.out.println("your account balance is: " + this.balance);
			
		}
	}


