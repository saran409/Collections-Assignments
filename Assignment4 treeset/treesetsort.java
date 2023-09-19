package com.treeset.details;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import com.treeset.comparators.SortAccountBasedOnBalanceHighToLow;
import com.treeset.comparators.SortAccountBasedOnBalanceLowToHigh;
import com.treeset.model.Account;

public class AccountDetails {
	public static void main(String[] args) {
		TreeSet<Account> allAccounts=new TreeSet<>();
		Account a1=new Account(123, "Saran", 4000, "Bangalore");
		Account a2=new Account(454, "Thinesh", 6000, "Chennai");
		Account a3=new Account(368, "Suresh", 3000, "Chennai");
		Account a4=new Account(254, "Imaya", 7000, "Bangalore");
		Account a5=new Account(746, "Arya", 9000, "Chennai");
		
		allAccounts.add(a1);
		allAccounts.add(a2);
		allAccounts.add(a3);
		allAccounts.add(a4);
		allAccounts.add(a5);
		System.out.println("------------------default sort on AccountHolderName------------");
		for(Account acc:allAccounts) {
			System.out.println(acc);
			System.out.println();
		}
			
			System.out.println("---  Account (Low to High) sort on Balance  ----------");
			getAccountBasedOnBalanceLowToHigh(allAccounts);
			System.out.println();
			
			System.out.println("---  Account (High to Low) sort on Balance  ----------");
			getAccountsBasedOnBalanceHighToLow(allAccounts);
			System.out.println();
			
			
		
		
		
	}
	
	public static void getAccountBasedOnBalanceLowToHigh(TreeSet<Account> allAccounts)
	{
		 
		List<Account> tempList = new ArrayList<>(); 
		tempList.addAll(allAccounts);
		 
		SortAccountBasedOnBalanceLowToHigh sortCode = new SortAccountBasedOnBalanceLowToHigh();
		
		Collections.sort(tempList, sortCode);
		
		for ( Account acc1 : tempList) {
			System.out.println(acc1);
		}
		 
	}
	public static void getAccountsBasedOnBalanceHighToLow(TreeSet<Account> allAccounts) {
		List<Account> tempList = new ArrayList<>(); 
		tempList.addAll(allAccounts);
		 
		SortAccountBasedOnBalanceHighToLow sortCode = new SortAccountBasedOnBalanceHighToLow();
		
		Collections.sort(tempList, sortCode);
		
		for ( Account acc1 : tempList) {
			System.out.println(acc1);
		}
		 
		
	}

	

}
