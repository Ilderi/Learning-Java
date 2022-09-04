import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList is a resizable array
		// elements can be added or removed from it after compilation phase
		// only stores reference data types
		
		//ArrayList<Integer>
		
		// 1D array list
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("HotDog");
		food.add("Dog");
		food.add("Pizza");
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		System.out.println();
		
		food.set(1, "Cat");
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		System.out.println();
		
		food.remove(1);
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		System.out.println();
		
		food.clear();
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		System.out.println();
		
		// 2D array list
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<>();
		drinksList.add("coffee");
		drinksList.add("soda");
		
		groceryList.add(drinksList);
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(1));
		System.out.println(groceryList.get(1).get(0));
		System.out.println(bakeryList.get(0));
	}

}
