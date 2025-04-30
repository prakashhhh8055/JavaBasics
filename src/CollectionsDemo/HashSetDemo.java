package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        // Declaration with generics
        HashSet<Object> myset = new HashSet<>();

        // Adding data into HashSet
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add('A');
        myset.add(true);
        myset.add(100);   // Duplicate, will not be added
        myset.add(null);
        myset.add(null);  // Duplicate null, will not be added

        // Size of the HashSet
        System.out.println("Size of HashSet: " + myset.size());

        // Printing HashSet elements
        System.out.println("All elements from HashSet: " + myset);

        // Remove an element from HashSet (by value, as there's no indexing)
        myset.remove(10.5);
        System.out.println("After removing 10.5: " + myset);

        // Inserting elements at specific index -> Not possible in HashSet

        // Accessing specific element -> Not directly possible, but we can convert to ArrayList
        ArrayList<Object> al = new ArrayList<Object>(myset);
        System.out.println("Converted to ArrayList: " + al);
        if (al.size() > 3) {
            System.out.println("Element at index 3: " + al.get(3));
        }

        // Reading all elements using enhanced for loop
        System.out.println("Reading with enhanced for loop:");
        for (Object x : myset) {
            System.out.println(x);
        }

        // Reading all elements using Iterator
        System.out.println("Reading with Iterator:");
        Iterator<Object> it = myset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Check if HashSet is empty
        System.out.println("Is HashSet empty? " + myset.isEmpty());

        // Remove all elements from HashSet
        myset.clear();
        System.out.println("After clearing, is HashSet empty? " + myset.isEmpty());
    }
}