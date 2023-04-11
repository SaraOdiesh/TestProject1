package Class_01_26_23_Inheritance;

public class Main {

	public static void main(String[] args) {
	ATM bofaATM = new BankOfAmericaATM();
	ATM chaseATM = new ChaseATM();
	
	
	bofaATM.depositCash(2000);
	bofaATM.depositCheck(6000);
	
	
	bofaATM.depositCash(1000);
	chaseATM.depositCheck(5000);
	
	System.out.println("Bank Of America ATM balance:   " +bofaATM.checkBalance());
	System.out.println("Chase ATM balance:   " + chaseATM.checkBalance());
	
	
	bofaATM.withdraw(200);
	chaseATM.withdraw(300);
	System.out.println("Bank Of America withdraw: " + bofaATM.checkBalance());
	System.out.println("Bank Of America withdraw: " + chaseATM.checkBalance());
	}

}
