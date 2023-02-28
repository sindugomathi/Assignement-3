package com.interview;

import java.util.Scanner;

public class Spec {
	private static int RemoveSpecial(String st)
	{
		st=st.toLowerCase();
		int count=0;
		char [] Arr=st.toCharArray();
		for(int i=0;i<Arr.length;i++)
		{
			for(char j='a';j<='z';j++)
			{
				if(Arr[i]!=j)
				{
				
				}else
				{
					count++;
				}
					
			}
		}
	return count;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the word to remove the special character");
      Scanner Sc=new Scanner (System.in);
      String st=Sc.nextLine();
      int Count=RemoveSpecial(st);
      System.out.println(Count);
      
	}

}
