/**
 * 
 */

/**
 * @author Krystian
 *
 */

/*
 * Basic data types:
 * NAME:		SIZE:
 * boolean		1b
 * byte			1B
 * short		2B
 * int			4B
 * long			8B
 * float		4B
 * double		8B
 * char			2B
 * String		variable
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		variable initialization
		int x = 55;
		float fVar = 6.1235f;
		boolean isDog = false;
		char symbol = '@';
		String name = "Andrzej";
		String nullStr;
		
		System.out.println("My var is: "+x);
		System.out.println("My var is: "+fVar);
		System.out.println("My var is: "+isDog);
		System.out.println("My var is: "+symbol);
		System.out.println("My var is: "+name+"\n");
		
		name = "Grześ";
		
		System.out.println("My var is :" + name);
		
		nullStr = name;
		
		System.out.println("Nullstr is: " + nullStr);
	}

}
