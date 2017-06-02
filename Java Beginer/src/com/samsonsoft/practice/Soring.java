package com.samsonsoft.practice;

import java.util.Scanner;

public class Soring {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String a ="";
		String b ="";
		System.out.println("Enter 2 string");

		a = in.nextLine();
		b = in.nextLine();
		
		String f1 = "",f2 = "";
		
	for(int i=0; i<a.length(); i= i+2){
		f1+=a.charAt(i);			
	}
	
	for(int j=1; j<a.length(); j= j+2){	
		f2+=a.charAt(j);				
	}
	System.out.print(f1+ "  " +f2);
	
	String f3 = "",f4 = "";
	
	for(int i=0; i<b.length(); i= i+2){
		f3+=b.charAt(i);			
	}
	
	for(int j=1; j<b.length(); j= j+2){	
		f4+=b.charAt(j);				
	}
	System.out.println();
	System.out.print(f3+ "  " +f4);
	

	}
	}
	
	
