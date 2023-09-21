package rev.main;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.excep.NullNameException;
import com.excep.UserNameException;

import model0.Review;
import model2.Food;

public class MainRunner1 {
	 public static void main(String[] args) {
		 Map<Food,List<Review>> foodMap = new HashMap<>();
		 
		 TreeSet<Food> allFcc=new TreeSet<>(); 
		 
		    Food f1=new Food("idly", 50,"veg");
			Food f2=new Food("dosa", 60,"veg");
			Food f3=new Food("shavarma", 80,"nonveg");
			Food f4=new Food("ChickenBurger", 120,"nonveg");
			Food f5=new Food("frenchfries", 120,"veg");
			
			
			allFcc.add(f1);
			allFcc.add(f2);
			allFcc.add(f3);
			allFcc.add(f4);
			allFcc.add(f5);
			
			List<Review> newList1 =new ArrayList<>();	
			List<Review> newList2 = new ArrayList<>();
			List<Review> newList3= new ArrayList<>();
			List<Review> newList4 = new ArrayList<>();
			List<Review> newList5= new ArrayList<>();

			

			Review rr1 = new Review("hf", 3, "Very Good");
			Review rr2 = new Review("Null", 1, "Not Good ");
			Review rr3= new Review("sghf", 3, "Good");
			Review rr4= new Review("rfh", 5, "Excellent");
			Review rr5= new Review("dgfh", 5, "Excellent");

			newList1.add(rr1);
			newList1.add(rr2);
			newList1.add(rr3);
			newList1.add(rr4);
			newList1.add(rr5);

			
			foodMap.put(f1, newList1);
			foodMap.put(f2, newList2);
			foodMap.put(f3, newList3);
			foodMap.put(f4, newList4);
			foodMap.put(f5, newList5);

			for(Map.Entry<Food,List<Review>> entry : foodMap.entrySet())

			{
                   Food key = entry.getKey();
					List<Review> value =entry.getValue();
				 
				 System.out.println("---- "+key.getItemName()+"-------");

				 System.out.println("Price rs. "+key.getPrice());

				 System.out.println("Category "+key.getCategeory());

				  

				 System.out.println(" --- Reviews ---");

				 for (Review review : value) {
					 
				 try {
					 
				 doCall(review);
				 }
				 catch( UserNameException e){
					 System.out.println("there is no name");
				 }
				 

					for(int i=0;i<review.getRating();i++)

					{

						System.out.print("*");

					}

					 System.out.print(review.getFeedBack()+"\n");

				}

				 System.out.println("\n\n");

			}
			
		}
	 	 
	 public static boolean doCall(Review val)throws  UserNameException {
		 if(val.getCusName().equals("null")) {
			 throw new UserNameException();
		 }
		 else {
			 return true;
		 }
	 }
}
		 
			
	


