package com.interview;

public class SplitStr {
private static char[] val(String s1)
	{
		char [] Result=new char[s1.length()];
		int j=0;
	for(int i=s1.length()-1;i>=0;i--)
	{
	Result[j]=(char) (Result[j]+s1.charAt(i));
	j++;
	}
	return Result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String S="Think Twice";
       String[] Ar=S.split(" ");
      for(int i=0;i<Ar.length;i++)
      {
    	  if(i==0)
    	  {
    		String S1=Ar[i];
    		S1=S1.toLowerCase();
    		System.out.print(val(S1)); 
    		System.out.print(" ");
    	  }
    	  else
    	  {
    		String S2=Ar[i];
    		S2=S2.toLowerCase();
    		System.out.print(val(S2));
    	  }
       }
	}

}