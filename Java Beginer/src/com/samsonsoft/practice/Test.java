package com.samsonsoft.practice;

import java.util.Scanner;

public class Test {

 public static void main(String [] args) {

		int num;
		int rev=0,digit;
	
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		num = in.nextInt();
		
		if(num > Integer.MAX_VALUE && num > Integer.MIN_VALUE) {
		 while(num!=0){
			 
			
			digit = num%10;
			rev =rev*10+digit;
			num = num/10;
		}
		 System.out.println("0");
		}
		System.out.println(rev);
		 }
		 
 
}
