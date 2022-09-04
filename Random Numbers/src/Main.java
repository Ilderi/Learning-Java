import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		// random number between 1 and 6
		int x = random.nextInt(6)+1;
		
		System.out.println(x);
		
		// random double type number in the range of 0 to 1
		double y = random.nextDouble();
		
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		
		System.out.println(z);
		
	}

}
