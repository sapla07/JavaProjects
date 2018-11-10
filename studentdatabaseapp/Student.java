package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int  gradeYear;
	private String studentID;
	private String courses = " ";
	private int tutionBalance = 0;
	private static int costOfCourse=600;
	private static int id=1000;
	
   // Constructor: prompt user to enter student's name and year
	
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		System.out.println("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		setStudentID();
		
		
		
	}
	
	
	//Generate 5 digit ID
	private void setStudentID()
	{
		// Grade level + student id
		id++;
		this.studentID = gradeYear + "" + id;
		
				
	}
	//Enroll in courses
	public void enroll()
	{
		// get inside a loop, user hit 0
		do {
			
			System.out.print("Enter course to enroll (Q to Quit): ");
			Scanner in  = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tutionBalance = tutionBalance + costOfCourse;
				
			}
			else
			{
				
				break;
			}
		}while( 1 != 0 );
	
		
		
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is : $" + tutionBalance);
	}
	
	//Pay tution
	public void payTution() {
		viewBalance();
		System.out.print("Enter your Payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		
		tutionBalance = tutionBalance - payment;
		System.out.println("Thanks for the payment of $" + payment);
		viewBalance();
	}
	//Show status
	
	public String toString(){
		
		return "Name: " + firstName + " " + lastName + 
				"\nCourses Enrolled : " + courses +
				"\nGrade Level: "+ gradeYear +
				"\nCourses Enrolled: " + studentID +
		 		"\nBalance: $"+ tutionBalance;
				
	}
	
}
