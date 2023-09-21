package model2;

import java.util.Objects;

public class Food implements Comparable<Food> {
	private String itemName;
	private int price;
	private String categeory;
	public Food(String itemName, int price, String categeory) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.categeory = categeory;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategeory() {
		return categeory;
	}
	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}
	@Override

	public int hashCode() {

		return itemName.length()+categeory.length()+3+3;
	}

	@Override

	public boolean equals(Object obj) {

		if(obj instanceof Food)

		{

			Food food = (Food)obj;

			boolean a = food.itemName.equals(this.getItemName());

			boolean b = food.price==this.price;

			boolean c = food.categeory==this.categeory;

			return a && b && c;
		}

		else

		{

			return false;

		}

	}
	@Override
	public String toString() {
		return "Food [itemName=" + itemName + ", price=" + price + ", categeory=" + categeory + "]";
	}
	@Override  
	public int compareTo(Food fcc) {
		
		return this.getItemName().compareTo(fcc.getItemName());
	}
}
	 