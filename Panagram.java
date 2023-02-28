package com.interview;

import java.util.Scanner;



public class Panagram {
	public  static boolean panagram(char [] S)
	{
		int Length=S.length;
		if(Length>26)
		{
			for (int i=0;i<Length;i++)
				if(S[i]>'a'&&S[i]<'z')		
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the word or sentence to find panagram");
       //We are getting word from the user
       Scanner s=new Scanner(System.in);
       String str1=s.nextLine();
       //removing the spaces from the sentence.
       str1=str1.replaceAll("\\s","");
       //converting to lower case for comparison
       str1=str1.toLowerCase();
       //converting the string to character array.
       char[] S=str1.toCharArray();
       //Calling the method to check the panagram.
       //System.out.println(S);
       if(panagram(S)==true)
   		System.out.println(" The given word or sentence is a panagram");
   		
   	else
   		System.out.println(" The given word or sentence is not a panagram");
    
	}
}


