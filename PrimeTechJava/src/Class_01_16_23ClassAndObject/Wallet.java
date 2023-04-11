package Class_01_16_23ClassAndObject;

public class Wallet {
	
	    private String owner;
	    private double dollarAmount;
	    
	    public Wallet(String owner, double dollarAmount) {
	        this.owner = owner;
	        this.dollarAmount = dollarAmount;
	    }
	    
	    public String getOwner() {
	        return owner;
	    }
	    
	    public void setOwner(String owner) {
	        this.owner = owner;
	    }
	    
	    public double getDollarAmount() {
	        return dollarAmount;
	    }
	    
	    public void setDollarAmount(double dollarAmount) {
	        this.dollarAmount = dollarAmount;
	    }
	    
	    public void emptyWallet() {
	        this.dollarAmount = 0;
	    }

}
