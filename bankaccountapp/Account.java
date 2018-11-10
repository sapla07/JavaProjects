package bankaccountapp;

public abstract class Account implements IRate {

	// List common properties for checking and saving accounts
	private String name;
	private String sSN;
	private double balance;
	private static int index = 1000;
	protected String accountNumber;
	protected double rate;
	
	//Constructor to set base and initialize the account
	public Account(String name,String sSN, double initDeposit){
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		
		 //Set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	
  }
	public abstract void setRate();
  	
	private String setAccountNumber(){
		 String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		 int uniqueID = index;
		 int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		 return lastTwoOfSSN + uniqueID + randomNumber;
		
	}
	
	public void compound(){
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $"+ accruedInterest);
		printbalance();
	}
	//List common methods
	public void deposit(double amount){
		balance = balance + amount;
		System.out.println("Deposting $"+ amount);
		printbalance();
	}
	public void withdraw(double amount){
		balance = balance - amount;
		System.out.println("Withdrawing $"+ amount);
		printbalance();
	}
	public void transfer(String toWhere,double amount){
		balance = balance - amount;
		System.out.println("Transfer $"+ amount +" to " + toWhere);
		printbalance();
	}
	public void printbalance(){
		System.out.println("Your balance is now: $" + balance);
		
	}
	public void showInfo(){
		System.out.println(
				"Name: " + name +
				"\nAccount Number: " + accountNumber +
				"\nBalance: " + balance +
				"\nRate: " + rate +"%"
				);
								
	}
}
