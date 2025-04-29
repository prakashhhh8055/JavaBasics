package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		//ArrayList <String>mylist=new ArrayList<String>();
		
		//Adding data into ArrayList
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		
		//Size of the Arraylist
		System.out.println(mylist.size());
		
		//Printing Arraylist elements
		System.out.println("All the elements from ArrayList: "+mylist);
		
		//Remove a Element from ArrayList
		mylist.remove(5);
		System.out.println("After removing the 5th index element "+mylist);
		
		//Insert element in the Arraylist (in between)
		mylist.add(2,"java");
		System.out.println("After Inserting the element "+mylist);
		
		//Modify elements from ArrayList
		mylist.set(2,"python");
		System.out.println("After modifying the element "+mylist);
		
		//Access Specific element from ArrayList
		System.out.println(mylist.get(3));
		
		//Reading all the elements from the ArrayList
		//#1 using normal for loop
		for(int i=0;i<mylist.size()-1;i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//#2 using enahanced for loop
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//#3 using Iterator
		Iterator it=mylist.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		//Checking Arraylist is empty or not
		System.out.println("is ArrayList empty?? "+mylist.isEmpty());
		
		//Remove multiple Specific elements from ArrayList
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		mylist.removeAll(mylist2);
		System.out.println("After removing 100 and welcome elements from ArrayList "+mylist);
		
		//Remove all the elements from ArrayList
		mylist.clear();
		System.out.println("Is my Arraylist is Empty?? "+mylist.isEmpty());
		
		

	}

}
