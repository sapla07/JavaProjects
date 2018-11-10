package emailapp;

import java.util.Scanner;

public class Email {

	 private String firstName;
	 private String lastName;
	 private String password;
	 private String email;
	 private String department;
	 private int defaultpasswordlength = 10;
	 private int mailboxCapacity = 500 ;
	 private String alternateEmail;
	 private String companySuffix = "accenture.com";
	 
	 
	 // Constructor to receive first name and last name
	 public Email(String firstName, String lastName) {
		 
		 this.firstName = firstName;
		 this.lastName = lastName;
		// System.out.println("EMAIL CREATED: " + this.firstName+ " " + this.lastName);
		 
		 // Call  a method asking for department - return department
		 this.department = setdepartment();
		// System.out.println("your department is: "+ this.department );
		 
		 // Call a method to return random password
		 this.password = randomPassword(defaultpasswordlength);
		 System.out.println("your password is :" + this.password);
		 
		 //combine all the elements 
		  email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
		 // System.out.println("Your email is: " + email);
	 }	  
	 
	 // Ask for the department
	 private String setdepartment() {
		 System.out.println("Choose department\n1.Sales\n2.development\n3.Accounting\n0.None\nEnter dep code");
		 Scanner in= new Scanner(System.in);
		 int dep = in.nextInt();
		 if(dep == 1) 
			 {return "Sales";}
		 else if(dep == 2)
		    { return "dev";}
		 else if(dep == 3)
		    { return "Acct"; }
		 else
		    { return "";}
		  
	 }  
	 
	 
	 // Generate a random password
	 
	 private String randomPassword(int length) {
		 
		    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		    char[] password = new char[length];
		    for(int i=0;i<length;i++) {		    	
		    	int rand = (int) (Math.random()*passwordSet.length());
		    	password[i] = passwordSet.charAt(rand);
		    }
		    return new String(password);
	 }
	 
	 
	 
	 
	 // Set the mailbox capacity
	 
	 public void setMailboxCapacity(int capacity) {
		 this.mailboxCapacity = capacity;
	 }
	 
	 // Set the alternate email
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail = altEmail;
	 }
	 
	 // Change the password
	 public void changePassword(String password) {
		 this.password = password;
	 }
	 
	 
	 // get methods
	 public int getMailboxCapacity() {return mailboxCapacity;}
	 public String getAlternateEmail() { return alternateEmail;}
	 public String getpassword() { return password;}
	 
	 
	 public String showInfo() {
	        return "DISPLAY NAME: " + firstName + " " + lastName + 
	        		"\nCOMPANY EMAIL: " + email + 
	        		"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
		 
	 }
}
