package Class_01_16_23ClassAndObject;

public class DemoClass {

	public static void main(String[] args) {
		

  ATM atm= new ATM();
  atm.getInfo();
   ATM atm2 = new ATM("Wells Fargo", "Anaheim", "White", "xyz589", 200000, true);
  atm2.getInfo();
 ATM atm3 = new ATM("Citi Bank", "igv895");
 atm3.getInfo();
	}

}
