package com.interview;

import java.util.Scanner;

public class RepeatStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word to find the repeatedly occuring characters");
		Scanner sc =new Scanner (System.in);
		String S=sc.nextLine();
		char []X=S.toCharArray();
        for(int i=0;i<X.length;i++)
		{
		int count=0;
	     for(int j=0;j<X.length;j++)
	     {
	   	 if(X[i]==X[j])
	    	count++; 
	     }
	     System.out.println("The alphabet"  +   " " +X[i]   + " is there "  + count);
	     }
	}
}
	     	     
