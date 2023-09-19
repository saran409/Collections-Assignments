package com.treeset.comparators;

import java.util.Comparator;

import com.treeset.model.Account;

public class SortAccountBasedOnBalanceLowToHigh implements Comparator<Account> {
	@Override
	public int compare(Account o1, Account o2) {
		return o1.getBalance() - o2.getBalance();
	}
	

}
