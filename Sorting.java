package com.interview;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word to sort alphabetically");
		Scanner Sc= new Scanner (System.in);
		String K=Sc.nextLine();
	    char[] S=K.toCharArray();
	    char temp=0;
	    for(int i=0;i<S.length;i++)
	    {
	    	for(int j=0;j<S.length;j++)
	    	{
	    		if(S[i]<S[j])
	    		{
	    			temp=S[j];
	    			S[j]=S[i];
	    			S[i]=temp;
	    		}
	    	}
	    }
	    for(int K1=0;K1<S.length;K1++)
	    {
	    System.out.print(S[K1]);
	    }
}
}