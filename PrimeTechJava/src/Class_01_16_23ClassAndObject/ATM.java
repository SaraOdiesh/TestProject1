package Class_01_16_23ClassAndObject;

import java.util.Scanner;

public class ATM {
	// Instance  Variable (Belong to the ATM object)
	String bankName;
	String location;
	String color;
	String model;
	long cashReserved;
	boolean isActive;
	
	
	public ATM () {
		this.bankName = "Bank Of America";
		this.location = "Irvin";
		this.color = "Red";
		this.model = "xyz123";
		this.cashReserved = 1000000;
		this.isActive = true;
		
	}
	public ATM (String bankName, String location,String color,String model,long cashReserved,boolean isActive) {
		this.bankName = bankName;
		this.location = location;
		this.color = color;
		this.model = model;
		this.cashReserved = cashReserved;
		this.isActive = isActive;
			
	}
	 public ATM (String bankName, String model) {
		 this.bankName= bankName;
		 this.model = model;
		 
			 
			 
	 }
	
	/*  Task: Create a method that will bring down
	 * 
	 * 
	 * 
	 */
	
	
	public void  setServiceMode() {
		
		if(this.isActive) {
			this.isActive = false;
			
		}
	}
	
	
	// Task: Create a method for withdrawing cash from an atm4
		// every time when the atm4 user withdraws cash from the atm4
		// then the withdrawal amount should be subtracted from the atm4 cash reserved
	
	
	public void withdrawcash() {
		if (this.isActive) {
			System.out.println("We are sorry, this ATM has no cash available for withdraw");
		}
		if(this.cashReserved == 0) {
	}
	Scanner scanner = new Scanner(System.in);
	System.out.println("How much cash you would like to withdraw?");
	long amount = scanner.nextLong();
	if(this.cashReserved<amount) {
		System.out.println("out of service");
	} else {
	this.cashReserved -= amount;
	
	System.out.println("Cash reserved is: " + this.cashReserved + " after withdrawing amount: " + amount);  
	}
	
	}
	
	
	
//	
//	public void withDrawcash(long cashAmount) {
////		//System.out.println("Withdrawing cash amount: " + cashAmount);
////		this.cashReserved = this.cashReserved - cashAmount;
////		
////		System.out.println("cash Reserved after withdraw amount: " + cashAmount
////				+ " is: " + this.cashReserved);
////		
////		
//	}
//	
	public void depositCash() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("How much cash you would like to deposit?");
	long amount = scanner.nextLong();
	this.cashReserved += amount;
	System.out.println("Cash reserved is: " + this.cashReserved + " after depositing amount: " + amount);
	
	}
	
	
	
//	public void deposit( long cashAmount) {
//		this.cashReserved = this.cashReserved + cashAmount;
//		System.out.println("cash Reserved after the deposit : " + cashAmount
//				+ " is: " + this.cashReserved);
	
	//}
	
	public boolean isActive() {
		
		return this.isActive;
		
	}
	
	
	public long cashReserved() {
		
		return this.cashReserved;
		
	}
	
	
	public String color() {
		return this.color;
	}
	
	public String model() {
	return this.model;
	}
	public String getLocation() {
		
		
	return this.location;
		
	}
	
	public String getBankName() {
		return this.bankName;

		}
	
	
	public void setUpATM(String bankName,String location,String color,String model,long cashReserved,boolean isActive) {
		this.bankName = bankName;
		this.location= location;
		this.color=color;
		this.model=model;
		this.cashReserved=cashReserved;
		this.isActive= isActive;
		
				
	}
	public void setBankName(String bankName) { // bankName = "Chase";
		this.bankName = bankName;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public void setcolor(String color) {
		this.color = color;
		
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setCashReserved(long cashReserved) {
		this.cashReserved = cashReserved;
	}
	public void setisActive(boolean isActive) {
		this.isActive= isActive;
	}
	public void getInfo() {
		System.out.println("**************ATM Info ***************");
		System.out.println("Bank Name ====> " + this.bankName);
		System.out.println("Location ====> " + this.location);
		System.out.println("Color ====> " + this.color);
		System.out.println("Model ====> " + this.model);
		System.out.println("Cash Reerved ====> " + this.cashReserved);
		System.out.println("Active Status ====> " + this.isActive);
		System.out.println("************ END *********************");
	}
		


}
