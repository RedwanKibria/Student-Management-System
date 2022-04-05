package studentmanagementsystem;
import java.util.Scanner;


public class Students {
	private String fName;
	private String lName;
	private int gYear;
	private String studentID;
	private String courses = "";
	private int tuitionBlnc = 0;
	private static int courseFee = 700;
	private static int id  = 1900;
	
	

		//Constructor: prompt user to enter student's name and year
	
	public Students() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.fName = in.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lName = in.nextLine();
		
		System.out.print(" 1 - First Year\n 2 - Second Year\n 3 - Final Year\n Enter student's year: ");
		this.gYear = in.nextInt();
		
		setStudentID();
	
	}
	
		//Generate an id
	private void setStudentID() {
		//gYear + id
		id++;
		this.studentID = gYear + "" + id;
	}
	
		//Enroll in courses
	public void enroll() {
		do {
			System.out.print("\nEnter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBlnc += courseFee;
				
			}
			else {
				break;
			}
		} while (1 !=0);			
	}
		
		//View balance
	public void viewBlnc() {
		System.out.println("Your balance is: £" + tuitionBlnc);
	}
	
		//Pay tuition
	public void payTuition() {
		viewBlnc();
		System.out.println("Enter your payment: £");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBlnc = tuitionBlnc - payment;
		System.out.println("Thank you for your payment of £" + payment);
		viewBlnc();
	}
		//Show status
	public String toString() {
		return "Name: " + fName + " " + lName +
				"\nYear: " + gYear +
				"\nStudentID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance is: £" + tuitionBlnc;
		
	}
}
