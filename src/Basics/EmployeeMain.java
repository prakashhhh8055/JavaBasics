package Basics;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.emp_name="Prakash G Malagi";
		e1.emp_id=33;
		e1.salary=44450.25;
		e1.dept_name="Quality Analyst";
		e1.display();
		
		Employee e2=new Employee();
		e2.emp_name="Pavithra Shet";
		e2.emp_id=34;
		e2.salary=50500d;
		e2.dept_name="Automation";
		e2.display();

	}

}
