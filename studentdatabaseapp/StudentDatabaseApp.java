package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
	
		// Ask how many new students we want to add
		System.out.println("Enter number of new Students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		
		//Create n number of new student
		for(int n=0; n < numOfStudents; n++)
		{
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
		}
		
		for(int n=0; n < numOfStudents; n++)
		{
			System.out.println(students[n].toString());
		}
		in.close();
	}

}
