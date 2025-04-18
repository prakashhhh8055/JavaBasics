package Basics;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Main method with String[] args");
        main(10); // calling the overloaded main
        main("Hello");

	}
	public static void main(int x) {
        System.out.println("Overloaded main with int: " + x);
    }

    public static void main(String arg) {
        System.out.println("Overloaded main with single String: " + arg);
    }


}
