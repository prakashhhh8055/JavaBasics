package Basics;

public class ContructorDemo {
	
	String sname;
	int sid;
	double s_fees=10050d;
	
	//default constructor
	ContructorDemo()
	{
		sname="Rahul";
		sid=1982;
		s_fees=10250.30;
	}
	
	//parameterized constructor
	ContructorDemo(String name,int id,double fee)
	{
		sname=name;
		sid=id;
		s_fees=fee;
	}
	
	void viewStudentDetails()
	{
		System.out.println(sname+" "+sid+" "+s_fees);
	}
	
	

}
