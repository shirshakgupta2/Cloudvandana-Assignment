package com.tap;

import java.util.Scanner;

public class Assignment3 {
	static boolean charCheck(String s, String s2) {
		for (int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i)==s.charAt(0)) {
				return true;
			}
		}
		return false;
	}
	static String printString(String s, String s2){
		String s1="";
		System.out.println(charCheck(s,s2));
			if(charCheck(s,s2)) {
				int j = s2.indexOf(s);
				for (int i = j+1; i < s2.length(); i++) {
					s1=s1+s2.charAt(i);
					
				}
				return s1;
			}
		return "The letter does not exist in the sentence";
		
	}
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a sentence and a letter to get the rest of the sentence after the first occurrence of the letter.");
	String s2 = scan.nextLine();
	String s = scan.next();
	System.out.println(printString(s,s2));
	
	
}
}
