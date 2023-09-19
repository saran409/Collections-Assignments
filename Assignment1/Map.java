package com.edu.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapType {
	Map<Integer, String> mp=new HashMap<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMapType m1=new HashMapType();
		while(true) {
			System.out.println("operations to perform");
			System.out.println("1.insert the values");
			System.out.println("2.Display");
			System.out.println("0. Exit \n");
			switch (new Scanner(System.in).nextInt()) {
			 

			case 1:
				m1.insertValues();
				break;

			case 2:
				 m1.displayValuesBasedOnKeys();
				break;

			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
		public void insertValues() {
			 System.out.println("enter the size of map");
			 int x=new Scanner(System.in).nextInt();
			 for(int i=0;i<x;i++) {
				 System.out.println("enter key:   ");
				 int key=new Scanner(System.in).nextInt();
				 System.out.println("enter value: ");
				 String value=new Scanner(System.in).nextLine();
				 mp.put(key, value);
			}
			 if(mp!=null)
			 {
				 System.out.println("Sucessfully inserted");
			 }
			 else {
				 System.out.println("Error");
			 }
					 
		
	}
		public void displayValuesBasedOnKeys() {
		
			System.out.println("enter the key:  ");
			int providedKey=new Scanner(System.in).nextInt();
			 
			int key=0;
			for (Map.Entry<Integer,String> entry: mp.entrySet()) {
			key = providedKey;//  entry.getKey();

			 

			String domain = entry.getValue();
			}
			System.out.println(key+" " +mp.get(key));

			
		}

}
