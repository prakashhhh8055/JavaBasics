package WrapperClassesDemo;

public class DataConversions {

	public static void main(String[] args) {
		String s1="10";
		String s2="20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

		String s3="10.50";
		String s4="20.25";
		
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		String s5="true";
		//Character.parseChar(s5); //not possible
		System.out.println(Boolean.parseBoolean(s5));
		
		
		//convert any primitive value to String -> String.valueOf()
		int a=10;
		double b=25.50;
		char c='Z';
		boolean d=false;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		
		
		
	}

}
