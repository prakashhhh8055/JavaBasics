package Basics;

public class Employee {
	
	int emp_id;
	String emp_name;
	String Company_name="Appscrip";
	Double salary;
	String dept_name;
	
	void display()
	{
	  System.out.println("Employee ID -> "+emp_id);
	  System.out.println("Employee Name -> "+emp_name);
	  System.out.println("Employee Company Name -> "+Company_name);
	  System.out.println("Employee Salary -> "+salary);
	  System.out.println("Employee Department -> "+dept_name);
	}

}
