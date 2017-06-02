package com.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class Expmt {
	Scanner in = new Scanner(System.in);
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
	
	public void main(String[] args){
	System.out.println("enter how many entries");
		int entry = in.nextInt();
	
		for(int i=0;i<entry;i++){
			System.out.println("Enter the character value");
			char temp =(in.next()).charAt(0);
			if(hm.containsKey(temp)){
			int temp2 = hm.get(temp);
			temp2++;
			hm.put(temp,temp2);
			}
			else{
				hm.put(temp, 1);
			}
			for(char j:hm.keySet()){
				System.out.println(hm.get(j));
			}
		}
		
	}
	
	
}
