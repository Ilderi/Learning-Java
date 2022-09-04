import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 5.51;
		double y = -11;
		
		double z = Math.max(x, y);
		
		System.out.println(z);
		
		System.out.println(Math.min(x, y));
		
		System.out.println(Math.abs(Math.min(x, y)));
		
		System.out.println(Math.sqrt(Math.abs(y)));
		
		System.out.println(Math.round(x));
		
		System.out.println(Math.floor(x));
		
		// solving simple triangle hypotenuse
		double a, b, c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side a: ");
		
		a = scanner.nextDouble();
		
		System.out.println("Enter side b: ");
		
		b = scanner.nextDouble();
		
		if(a > 0 & b > 0) {
			c = (double)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			System.out.println("Hypotenuse is: " + c);
		}else {
			System.out.println("Wrong input data");
		}
		
		scanner.close();
		
	}

}
