package com.samsonsoft.practice;

import java.util.Scanner;

public class BankAccount {
	private String accountName;
	private String accType;
	private int accNumber;
	private int accBalance;

	public void setValues(String accountName, String accType, int accNumber, int accBalance) {
		this.accountName = accountName;
		this.accType = accType;
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}

	public void deposit( int amount ){
			this.accBalance += amount;
	}
	
	public void withdraw(int amount) {
		if(this.accBalance > 0 && this.accBalance > amount) 
		this.accBalance -= amount;
		else
			System.out.println("Your current account balance is "+ this.accBalance + "withdra" );
			
			
	}
	
	public void display(){
	//	Collections.sy
		System.out.println(this.accountName);
		System.out.println(this.accBalance);
	}
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNumber;
		result = prime * result + ((accType == null) ? 0 : accType.hashCode());
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accNumber != other.accNumber)
			return false;
		if (accType == null) {
			if (other.accType != null)
				return false;
		} else if (!accType.equals(other.accType))
			return false;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accType=" + accType + ", accNumber=" + accNumber
				+ ", accBalance=" + accBalance + "]";
	}

	public static void main(String[] args){
		BankAccount b = new BankAccount();
		b.setValues("amit", "saving", 121, 1000);
		b.display();
		b.withdraw(500);
		b.display();
		
		BankAccount b1 = new BankAccount();
		System.out.println("Bankaccount object is " + b.toString());
		
		
		
	}
	
}