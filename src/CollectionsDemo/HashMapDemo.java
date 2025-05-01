package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaration
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding Pairs
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"Steve");
		hm.put(104,"Marry");
		hm.put(102,"David");
		
		System.out.println(hm);
		
		//Size of a HashMap
		System.out.println("Size of the HashMap "+hm.size());
		
		//remove Pair
		hm.remove(103); //we can remove the any pair using its key
		System.out.println("After removing the pair using key "+hm);
		
		//Access any value using key name
		System.out.println(hm.get(102)); //David
		
		//Get all the keys from the HashMap
		System.out.println(hm.keySet());
		
		//Get all the value of the HashMap
		System.out.println(hm.values());
		
		
		//Get All the keys along with keys in the HashMap
		System.out.println(hm.entrySet());
		
		//Reading data from HashMap
		
		//#1 Using for..Each loop (Enhanced for Loop)
		for(Integer k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		
		//#2 Using Iterator
		 Iterator<Entry <Integer, String>> it= hm.entrySet().iterator();
		 while(it.hasNext())
		 {
			 Entry<Integer, String> entry=it.next();
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		 System.out.println("Before Clearing HashMap, Is your HashMap empty? "+hm.isEmpty());
		 hm.clear();
		 System.out.println("After Claring HasMap, Is your HashMap empty? "+hm.isEmpty());
		
	}

}
