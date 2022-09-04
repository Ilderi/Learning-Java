import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 421;
		
		if(age >= 40) {
			System.out.println("Ok Boomer");
		} else if(age >= 18) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You are not an adult");
		}
		
		String day = "Mondary";
		
		switch(day.toLowerCase()) {
		case "sunday":
			System.out.println("It is Sunday");
			break;
		case "monday":
			System.out.println("It is Monday");
			break;
		case "tuesday":
			System.out.println("It is Tuesday");
			break;
		case "wednesday":
			System.out.println("It is Wednesday");
			break;
		case "friday":
			System.out.println("It is Friday");
			break;
		case "saturday":
			System.out.println("It is saturday");
			break;
		default:
			System.out.println("There is no such day in a week");
		}
		
		// logical operators are used to connect two or more expressions
		//	&& (AND) both conditions must be true
		//	|| (OR) either condition must be true
		//	! (NOT) reverses boolean value of condition
		
		int temp = 59;
		
		if(temp > 36) {
			System.out.println("It is hot outside");
		}else if(temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		}else {
			System.out.println("It is cold outside");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Let`s play a game, press Q to quit");
		String response = scanner.next();
		
		if(response.toLowerCase().equals("q")) {
			System.out.println("You quit the game");
		}else {
			System.out.println("You are still playing the game");
		}
		
		scanner.close();
	}
}
