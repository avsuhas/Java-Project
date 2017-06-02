package com.samsonsoft.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Unique {
	Scanner in ;
	HashMap<Character,Integer> hm ;
	Unique(){
		in = new Scanner(System.in);
		hm = new HashMap<Character,Integer>();	
	}
	
	public void getOccurance(){
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
			
		}
		for(char j:hm.keySet()){
			System.out.println(j +" "+ hm.get(j));
		}
	}
			
	
	
	private void getUnique() {
	// TODO Auto-generated method stub
	for(char j:hm.keySet()){
		if(hm.get(j) == 1 ){
			System.out.println(j);
		}
	}
	}
	public static void main(String[] args){
	
		Unique u = new Unique();
		  u.getOccurance();
		
		  u.getUnique();
	
	
	}

	
	
}
