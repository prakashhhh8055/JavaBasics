package Basics;

public class BonusqUes {

	public static void main(String[] args) {
		// final price=price−(price×discount percentage)+(price×tax percentage)

		
		double price = 100; 
		double discount = 10; 
		double tax = 5;
		double final_price = (price - (price*(discount/100)))+(price*(tax/100));
		System.out.println(final_price);

	}

}
