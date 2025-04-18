package Basics;

public class Student {
	
	int roll_no;
	String name;
	String school="Siddaganga High School";
	Double fee;
	char grade;
	
	void display()
	{
	  System.out.println("Student Roll Number is "+roll_no);
	  System.out.println("Student Name is "+name);
	  System.out.println("Student School Name is "+school);
	  System.out.println("Student fee is "+fee);
	  System.out.println("Student grade is "+grade);
	}
	

	public static void main(String[] args) {
		
		Student stud1=new Student();
		stud1.roll_no=0001;
		stud1.name="Charan Prasad";
		stud1.fee=20500.50;
		stud1.grade='A';
		stud1.display();
		
		Student stud2=new Student();
		stud1.roll_no=0002;
		stud1.name="Siri Lakshmi";
		stud1.fee=15500.50;
		stud1.grade='A';
		stud1.display();

	}

}
