package Basics;

public class RemoveSpaceInAString {

	public static void main(String[] args) {
		//Remove White Spaces In a String
		
		String s="    We  l c   om e Ho  me   ";
		
		System.out.println(s.replace(" ",""));
	
		//Remove only leading and trailing white spaces
		System.out.println(s);
		System.out.println(s.trim());
		
		//Replace multiple spaces with a single space
		System.out.println(s.replaceAll("\\s+",""));

	}

}
