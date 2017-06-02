package com.samsonsoft.practice;

import java.util.Scanner;

public class AccountType {

	String accountName;
	String actType;
	int AccountNumber;
	static int AccountBalance;

	AccountType(String s1, String s2, int a, int b) {

		accountName = s1;
		actType = s2;
		AccountNumber = a;
		AccountBalance = b;
	}

	public static void deposit_amount(int a) {
		a =  AccountBalance  ;
		
		System.out.println("Account balance = " +a);
	}

	public static void withdraw_amount(int b) {
		AccountBalance = AccountBalance - b;
		System.out.println("Account balance = " + b);
	}

	public static void name_balance() {

		//System.out.println("Account Name is " + AccountName);
		System.out.println("The balance in the account is " + AccountBalance);
	}

	public static void main(String[] args) {

		int a, b;
		AccountType ba = new AccountType("Suhas", "Checking", 1234, 500);

		Scanner in = new Scanner(System.in);
		System.out.println("enter the deposit amount");
		a = in.nextInt();
		deposit_amount(a);

		System.out.println("enter the withdraw amount");
		b = in.nextInt();
		withdraw_amount(b);

		name_balance();

	}

}
