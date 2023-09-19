package com.edu.model1;

import java.util.Objects;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private int salary;
	private String  location;
	public Account() {
		super();
	}
	public Account(int accountNumber, String accountHolderName, int salary, String location) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.salary = salary;
		this.location = location;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, accountNumber, location, salary);
	}
	@Override
	public boolean equals(Object obj) {
		Account a=new Account();
		if(obj instanceof Account) {
			boolean b1=this.accountHolderName.equals(a.getAccountHolderName());
			boolean b2=this.accountNumber==(a.getAccountNumber());
			boolean b3=this.salary==(a.getSalary());
			boolean b4=this.location.equals(a.getLocation());
			return b1&&b2&&b3&&b4;
		}
		return false;
	}
		 
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", salary="
				+ salary + ", location=" + location + "]";
	}
	

}
