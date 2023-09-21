package mainrunner;

import java.util.Comparator;

import model2.Food;

public class SortGetFoodBasedOnName implements Comparator<Food>{
	
	@Override
	public int compare(Food o1, Food o2) {
		return o1.getPrice() -o2.getPrice();
	}
}
