package OopsConcepts;

public class StudentsCollege {
	
	static String College_name="Jain Institute of Technology";
	String s_name;
	int roll_number;
	
	StudentsCollege(String s_name,int roll_number)
	{
		this.s_name=s_name;
		this.roll_number=roll_number;		
	}
	void display()
	{
		System.out.println("Student Name is -> "+s_name);
		System.out.println("Student Roll Number is -> "+roll_number);
		System.out.println("Student College Name is -> "+College_name);
		System.out.println("-------------------- ---------");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsCollege s1=new StudentsCollege("Raam",409);
		s1.display();
		System.out.println("-----------------------------");
		StudentsCollege s2=new StudentsCollege("Seetha",410);
		s2.display();
		System.out.println("-----------------------------");
		StudentsCollege s3=new StudentsCollege("Lakshaman",411);
		s3.display();

	}

}
