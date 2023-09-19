package com.bk.model;

import java.util.Objects;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	private String  location;
	public Account() {
		super();
	}
	 
	public Account(int accountNumber, String accountHolderName, int balance, String location) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.location = location;
	}




	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	 
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	 
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	 
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", salary="
				+ balance + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, accountNumber, location, balance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountHolderName, other.accountHolderName) && accountNumber == other.accountNumber
				&& Objects.equals(location, other.location) && balance == other.balance;
	}

	 

	 
	

}
