package bankaccountapp;

public class Checking extends Account{

	// List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//Constructor to initialize checking account properties
	public Checking(String name,String sSN, double initDeposit){
		super(name,sSN,initDeposit);
		 accountNumber = "2" + accountNumber; 
	    setDebitCard(); 
		
	}
	private void setDebitCard(){
		debitCardNumber = (int)(Math.random()*Math.pow(10,12));
		debitCardPIN = (int)(Math.random()*Math.pow(10,4));
	}
	//List any method specific to the checking account
	public void showInfo(){
		super.showInfo();
		System.out.println(
				"Your Saving account features" + 
		        "\n Debit Card Number: " + debitCardNumber+
		        "\n Debit Card PIN : " + debitCardPIN );
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getRate()* .15;
		
	}
}

