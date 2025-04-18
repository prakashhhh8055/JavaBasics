package Basics;

/*Method Overloading occurs when two or more methods 
in the same class have the same name but differ in the number of parameters or type of parameters (or both).*/

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the add method with two integers
        System.out.println("Sum of 2 numbers (int): " + calc.add(10, 20));

        // Calling the overloaded add method with three integers
        System.out.println("Sum of 3 numbers (int): " + calc.add(10, 20, 30));

        // Calling the overloaded add method with two doubles
        System.out.println("Sum of 2 numbers (double): " + calc.add(10.5, 20.5));
    }
}
