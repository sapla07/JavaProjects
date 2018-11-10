package bankaccountapp;

public class Savings extends Account{

	// List properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	//Constructor to initialize saving account properties
	public Savings(String name,String sSN,double initDeposit){
		super(name,sSN,initDeposit);
	    accountNumber = "1" + accountNumber; 
	    setsafetyDepositBox();
	}
	
	private void setsafetyDepositBox(){
		safetyDepositBoxID =(int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey =(int)(Math.random()*Math.pow(10,4));
		
	}
	//List any method specific to the saving account
	public void showInfo(){
		super.showInfo();
		System.out.println(
				"Your Saving account features" + 
		         "\n Safety Deposit Box ID: " + safetyDepositBoxID+
		         "\n Safety Deposit Box ID: " + safetyDepositBoxKey );
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getRate() - .25;
	}
}
