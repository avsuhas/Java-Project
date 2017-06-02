package com.leetcode;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AlphabetCount {
	
	public static void main(String[] args) {
		String a ="";
		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);
		a = in.nextLine();
		findAlphabetCount(a);
		
	}
	
	
	private static void findAlphabetCount(String a){
	int i;
	int length = a.length(); 
	Character c;
	Map<Character,Integer> characterMap = new TreeMap<Character,Integer>();
	for(i=0;i<length;i++){
		c = a.charAt(i);
		if(characterMap.containsKey(c)){
			characterMap.put(c, characterMap.get(c)+1);
		}
		else
			characterMap.put(c, 1);
	}
	
	Iterator<Character> iter = (Iterator<Character>) characterMap.keySet().iterator();
	//char c ;
	while(iter.hasNext()){
		c = iter.next();
		System.out.println("Occurance of Character "+ c + "  is n times: " + characterMap.get(c) );
	
	}
	}
}
