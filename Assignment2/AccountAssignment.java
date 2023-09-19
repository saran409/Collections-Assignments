package com.edu.assignment2;

 
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.edu.model1.*;

public class AccountUi {
	Scanner scan=new Scanner(System.in);
	Map<Integer,Account> map=new HashMap<>();

 

	public static void main(String[] args) {
		AccountUi app=new AccountUi();
		while(true) {
			System.out.println(" ----- OPERATIONS ----");
			System.out.println("1. Insert The Account to add in map ");
			System.out.println("2.GetAll Accounts details Based on Location");
			System.out.println("3.Get All Accountsdetails Based on Salary Range ");
			System.out.println("4.Get the Account Based on Account Number");

 

			System.out.println("0. Exit");
			System.out.println("Enter Option :- ");

 

			switch(new Scanner(System.in).nextInt()) {
			case 1:
				app.addAccount();
				break;

 

			case 2:
				app.getAllAccountsBasedOnLocation();
				break;

 

			case 3:
				app.getAccountBasedOnBalanceRange();
				break;

 

			case 4:
				app.getAccountBasedOnAccountNumber();
				break;

 

			case 0:
				System.out.println("process completed");
				System.exit(0);
			}

		}//end of while

	}//end of main

 
	private void addAccount() {
		int accountNumber=new Random().nextInt(1000000);

		System.out.print("Enter Account Holder Name: ");
		String name=scan.next();

		System.out.print("Enter Balance: ");
		int balance=scan.nextInt();

		System.out.print("Enter Location: ");
		String location=scan.next();

		Account a=new Account(accountNumber,name,balance,location);
		map.put(a.getAccountNumber(), a);

 

	}
	private void getAccountBasedOnAccountNumber() {
		System.out.print("Enter AccountNumber to be Searched: ");
		int accountNumber=scan.nextInt();
		for(Map.Entry<Integer, Account> entry: map.entrySet()) {
			int key=entry.getKey();
			Account a=entry.getValue();
			if(a.getAccountNumber()==accountNumber) {
				displayAccounts(a);
			}

 

		}

 

	}

	private void getAccountBasedOnBalanceRange() {
		System.out.print("Enter Minimum Amount: ");
		int r1=scan.nextInt();
		System.out.print("Enter Minimum Amount: ");
		int r2=scan.nextInt();

 

		for(Map.Entry<Integer, Account> entry: map.entrySet()) {
			int key=entry.getKey();
			Account a=entry.getValue();
			if(a.getSalary()>=r1 && a.getSalary()<=r2) {
				displayAccounts(a);
			}

 

		}

 

	}

	private void getAllAccountsBasedOnLocation() {
		System.out.print("Enter Location to be Searched: ");
		String location=scan.next();
		for(Map.Entry<Integer, Account> entry: map.entrySet()) {
			int key=entry.getKey();
			Account a=entry.getValue();
			if(a.getLocation().equals(location)) {
				displayAccounts(a);
			}

 

		}

 

	}

	 

 

 

	//method to print accounts
	private void displayAccounts(Account a) {
		System.out.println("Account Number = " + a.getAccountNumber() + ", Account Holder Name = " + a.getAccountHolderName() + ", Balance = "
				+ a.getSalary() + ", Location = " + a.getLocation());

 

 

	}

 

}

 