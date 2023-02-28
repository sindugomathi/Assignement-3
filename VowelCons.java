package com.interview;

import java.util.Scanner;

public class VowelCons {
	private static void  Vowel(String Str2)
	{
		char [] vow={'a','e','i','o','u'};
		char[] strchar=Str2.toCharArray();
		int Vowcount=0;
		int Conscount=26;
		for(int i=0;i<strchar.length;i++)
		{
		 for(int j=0;j<vow.length;j++)
		 {
			 if(strchar[i]==vow[j])
			 {
				 Vowcount++;
			 }
		 
		}
		 Conscount=Str2.length()-Vowcount;
		}
		System.out.println("Number of vowels in the given word  " +   Str2   + "is "  +  Vowcount);
		System.out.println("Number of vowels in the given word  " +   Str2   + "is "  +  Conscount);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the word to find the  number of vowels and constants in it");
       Scanner sc=new Scanner (System.in);
       String Str=sc.nextLine();
       Vowel(Str);
	}

}
