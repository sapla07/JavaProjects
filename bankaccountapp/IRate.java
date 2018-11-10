package bankaccountapp;

public interface IRate {
  
	// Method returns the  base rate
	default double getRate(){
		return 2.5;
	}
}
