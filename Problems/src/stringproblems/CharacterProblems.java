package stringproblems;

import java.util.*;

public class CharacterProblems {
	
	public static void printChar(String str) {
		  
		for(int i = 0 ;i<str.length();i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}
	
	public static void printCharASCII(String str) {
		  
		for(int i = 0 ;i<str.length();i++) {
			char c = str.charAt(i);
			System.out.println(c +" " + (int)c);
		}
	}
	
	public static void printUpperCaseChar(String str) {
		  
		for(int i = 0 ;i<str.length();i++) {
			
			char c = str.charAt(i);
				
			if(Character.isUpperCase(c)) {
				
				System.out.println(c);
			}
			
		}
	}
	
	public static void printLowerCaseChar(String str) {
		  
		for(int i = 0 ;i<str.length();i++) {
			
			char c = str.charAt(i);
				
			if(Character.isLowerCase(c)) {
				
				System.out.println(c);
			}
			
		}
	}
	
	public static void printDigits(String str) {
		  
		for(int i = 0 ;i<str.length();i++) {
			
			char c = str.charAt(i);
				
			if(Character.isDigit(c)) {
				
				System.out.println(c);
			}
			
		}
	}
	
	public static void printLetterOrDigit(String str) {
		  
		for(int i = 0 ;i<str.length();i++) {
			
			char c = str.charAt(i);
				
			if(Character.isLetterOrDigit(c)) {
				
				System.out.println(c);
			}
			
		}
	}
	
	public static void printAlphabets(String str) {
		  
		for(int i = 0 ;i<str.length();i++) {
			
			char c = str.charAt(i);
				
			if(Character.isAlphabetic(c)) {
				
				System.out.println(c);
			}
			
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
	    String str = sc.nextLine();
	    
	   // printChar(str);
	   // printCharASCII(str);
	   // printUpperCaseChar(str);
	   // printLowerCaseChar(str);
	   //  printDigits(str);
	   //printLetterOrDigit(str);
	   // printAlphabets(str);


	}

}
