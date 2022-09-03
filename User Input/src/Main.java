import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How many hands do you have?");
		int hands = scanner.nextInt();
		//dirty way to clear \n
		scanner.nextLine();
		System.out.println("What is your favourite food?");
		String food = scanner.nextLine();
		System.out.print("Hello " + name);
		if(hands <= 0) {
			System.out.println(", You have no hands :(");
		}else if(hands == 1) {
			System.out.println(", You have only " + hands + " hand :/");
		}else {
			System.out.println(", You have " + hands + " hands");
		}
		System.out.println("Your favourite food is: " + food);
	}
}
