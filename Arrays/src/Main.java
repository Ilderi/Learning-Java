
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Toyota", "Corvette", "Tesla"};
		
		cars[0] = "Mustang";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		String[] cars2 = new String[3];
		
		cars2[0] = "Tesla";
		cars2[1] = "Toyota";
		cars2[2] = "Corvette";
		
		for(int i = 0; i < cars2.length; i++) {
			System.out.println(cars2[i]);
		}
		
		String[][] strArr = new String[3][7];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				strArr[i][j] = Integer.toString(i);
			}
		}
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j]);
			}
			System.out.println();
		}
	}

}
