package mainrunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import model2.Food;

public class Main {
	public static void main(String[] args) {
		TreeSet<Food> food=new TreeSet<>();
		
		Food f1=new Food("idly", 50,"veg");
		Food f2=new Food("dosa", 60,"veg");
		Food f3=new Food("shavarma", 80,"nonveg");
		Food f4=new Food("ChickenBurger", 120,"nonveg");
		
		food.add(f1);
		food.add(f2);
		food.add(f3);
		food.add(f4);
	for(Food i:food) {
		System.out.println(i);
	}

	System.out.println("---  Food based on Name  ----------");
	getFoodBasedOnPrice(food);
	
	}
	public static void getFoodBasedOnPrice(TreeSet<Food> food)
	{
		// Step1 -> convert set to List
		List<Food> tempList = new ArrayList<>();// or pass as constructor argument
		tempList.addAll(food);
		
		// Step 2-> create Comprator class Object
		SortGetFoodBasedOnName sortCode = new SortGetFoodBasedOnName();
		
		Collections.sort(tempList, sortCode);
		
		for (Food fa : tempList) {
			System.out.println(fa);
		}
		 
	}

}
