package Basics;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
		// Remove junk or special characters in a string
		String s="$Welcome_ Home #Java";
		
		System.out.println(s.replace("$","").replace("_"," ").replace("#",""));
		
		System.out.println("Using Replace All method");
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9 ]",""));
		              //or
		System.out.println(s.replaceAll("[$_#]",""));

	}

}
