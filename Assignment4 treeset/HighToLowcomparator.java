package com.treeset.comparators;

import java.util.Comparator;

import com.treeset.model.Account;

public class SortAccountBasedOnBalanceHighToLow implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		return o2.getBalance() - o1.getBalance();
	}
	

}
