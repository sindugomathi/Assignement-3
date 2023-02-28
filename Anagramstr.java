package com.interview;

import java.util.*;

public class Anagramstr {
	private static boolean isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length()==str2.length())
		{
			str1.contains(str2);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first string to find anagram");
	    Scanner Str1=new Scanner(System.in);
	    String S1=Str1.nextLine();
	    System.out.println("Enter the second string");
	    Scanner Str2= new Scanner(System.in);
	    String S2=Str2.nextLine();
	    if(isAnagram(S1,S2)==true)
	    	System.out.print(S1   + " and "  + S2 + " are Anagram");
	    	else
	    	System.out.print(S1   + " and "  + S2 + " are not Anagram");

	}
}
