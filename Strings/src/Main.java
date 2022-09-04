
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = " Alic ja   ";
		
		boolean result = name.toLowerCase().equals("alicja");
		boolean result2 = name.equalsIgnoreCase("alicja");
		
		int strLength = name.length();
		char singleChar = name.charAt(1);
		int charIndex = name.indexOf("a");
		boolean isStrEmpty = name.isEmpty();
		String upperName = name.toUpperCase();
		String trimmedName = name.trim();
		String replacedName = name.replace("i", "Q");
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println("Length of string \"name\" is: " + strLength);
		System.out.println("Char at name[1] is: " + singleChar);
		System.out.println("First 'a' is located at index: " + charIndex);
		System.out.println("Is \"name\" an empty string: " + isStrEmpty);
		System.out.println("\"name\" in upper case: " + upperName);
		System.out.println("Trimmed \"name\": " + trimmedName);
		System.out.println("Trimmed \"name\" length: " + trimmedName.length());
		System.out.println("Replaced \"name\": " + replacedName);
		
	}

}
