
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// wrapper class provides a way to use primitive data types as reference data types
		// reference data types contain useful methods
		// can be used with collections ex. ArrayList
		// primitive var are much faster than reference var
		
		// primitive		wrapper
		// boolean			Boolean
		// char				Character
		// int				Integer
		// double			Double
		// and a few more
		
		// autoboxing is automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing is the reverse of autoboxing
		
		Boolean a = true; //example of autoboxing
		Character b = '$';
		Integer c = 141;
		Double d = 5.132;
		String e = "Java";
		
		//example of unboxing
		if(a == true) System.out.println("This is true");
	}

}
