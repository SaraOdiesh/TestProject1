package Class_01_19_23_Static;

public class MortgageAccount {
	
	// Static members that belongs to the class
	public static String bankName;
	public static String bankAddress;
	
    // Instance Variable
	double loanAmount;
	double accountBalance;
	String mortgageType;
	double monthlyPayment;
    int mortgageTerm;
	
	private double interestRate;
	
	

	
	// no arg Constructor () 
	public MortgageAccount() {
		this.loanAmount = 300000;
		this.accountBalance = 100000;
		this.mortgageType = "Conventional Loan ";
		this.monthlyPayment = 1500;	
		this.mortgageTerm = 360;
		
	}
	 // Parameterized Constructor
	public MortgageAccount(double loanAmount, double accountBalance,
			String mortgageType,double monthleyPayment,
			int mortgageTerm,double interestRate) {
		
		
		
		this.loanAmount = loanAmount;
		this.accountBalance = accountBalance;
		this.mortgageType = mortgageType;
		this.monthlyPayment = monthleyPayment;
		this.mortgageTerm = mortgageTerm;
		this.interestRate = interestRate;
		
		
	} 
	
	
	// Make payment method
	
	// will make monthly payment
	
	public void makeAPayment() {
		this.accountBalance= this.accountBalance - this.monthlyPayment;
		
	}
	
	public void makePayment(double paymentAmount) {
		this.accountBalance= this.accountBalance - paymentAmount;
		
	}
		public void setInterestRate(double interestRate) {
			if (interestRate >=3 && interestRate<=5.0) {
				this.interestRate = interestRate;
				this.setMonthlyPayment();
			} else {
				System.out.println("Invalid interest rate!"
						+ " Must be between 3.0 and 5.0");
			}
		}     
		
		
		public double getInterestRate () {
			return interestRate;
		}
		
		public void displayAccountInfo() {
			System.out.println("*************** Mottgage Account Information *******************");
			System.out.println(" ");
			System.out.println("Bank Name: "+ bankName);
			System.out.println("Bank Address: " + bankAddress);
			System.out.println("Loan amount: " + this.loanAmount);
			System.out.println("Account Balance: " + this.accountBalance);
			System.out.println("Mortgage Type: " + this.mortgageType);
			System.out.println("Monthley Payment: " + this.monthlyPayment);
			System.out.println("Mortgage Term: " + this.mortgageTerm);
			System.out.println("Interest Rate: "+ this.interestRate);
			System.out.println(" ");
			System.out.println("******************************************************************");
			
			
		}
		
		private void setMonthlyPayment() {
			
			this.monthlyPayment = (this.loanAmount + (this.loanAmount * 
					(this.interestRate/100)))/ this.mortgageTerm ;
			
			
		}
		
		
}
