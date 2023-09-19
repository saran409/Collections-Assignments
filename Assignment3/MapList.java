package com.edu.assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bk.model.Account;

public class ListMapDemo {
	public static void main(String[] args) {

		 

		Account a1 = new Account(123,"jawahar",2000,"bangalore");

		Account a2 = new Account(234,"varun",3000,"chennai");

		Account a3 = new Account(456,"dinesh",5000,"mumbai");

		Account a4 = new Account(567,"thinesh",4500,"coimbatore");

		Account a5 = new Account(345,"dharani",7688,"bangalore");

		Account a6 = new Account(888,"harish",9876,"bangalore");

		  Map<Integer,Account> accountMap = new HashMap<>();

		  accountMap.put(a1.getAccountNumber(), a1);

		  accountMap.put(a2.getAccountNumber(), a2);

		  accountMap.put(a3.getAccountNumber(), a3);

		  accountMap.put(a4.getAccountNumber(), a4);
		  accountMap.put(a5.getAccountNumber(), a5);

		  Scanner sc = new Scanner(System.in);

		  System.out.println("Enter key to get account details");

		  int key = sc.nextInt();

		 Account acc = accountMap.get(key);



		  System.out.println(acc.toString());



		  System.out.println("Enter location to get account details");



		  String location = sc.next();



		  Map<String,List<Account>> newAccount = new HashMap<>();



		  List<Account> accountList = new ArrayList<>();



		  for(Map.Entry<Integer, Account> e : accountMap.entrySet()) {



			  if(e.getValue().getLocation().equals(location)) {



				  accountList.add(e.getValue());



			  }



		  }

		  newAccount.put(location, accountList);
		  System.out.println(newAccount+"    ");



	}
}


