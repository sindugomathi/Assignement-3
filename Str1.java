package com.interview;

import java.util.Scanner;

import java.util.*;

public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the string to convert");
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      System.out.println(str);
      int min=str.length()/2;
      String Uppercase="";
      String Lowercase="";
      for(int i=0;i<str.length();i++)
      {
    	  if(i<min)
    	  {
    		  Lowercase=Lowercase+Character.toLowerCase(str.charAt(i));
    		  
    	}else
    	{
    		Uppercase=Uppercase+Character.toUpperCase(str.charAt(i));
    	  
      }
      
	}
      System.out.println("lower case	"  +   Lowercase);
      System.out.println("upper case	"  +   Uppercase);
}
}
