import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// for-each is traversing technique to iterate through the elements in an array/collection
		// less steps, more readable
		// less flexible
		
		//String[] animals = {"cat", "dog", "rat", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		for(int i = 0; i <= 10; i++) {
			int j = 0;
			while(j <= 100) {
				System.out.println("i: " + i + " j: " + j);
				j++;
			}
		}
		
		int rows, columns;
		String symbol;
		
		System.out.print("Enter number of rows:");
		rows = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter number of columns:");
		columns = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter symbol to be used:");
		symbol = scanner.nextLine();
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		String name = "";
		
		// important! "while" in Java can not use
		// numeric argument, only boolean type
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		name = "";
		
		do {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello " + name);
		
		scanner.close();
	}

}
