package Class_02_02_23Abstraction;

public class Demo {

	public static void main(String[] args) {
		ATM atm1 = new ChaseBankATM();
		atm1.deposit(100000);
		atm1.checkBalance();
		
		ATM atm2= new BOAATM();
		atm2.deposit(200000);
		atm2.checkBalance();

	}

}
