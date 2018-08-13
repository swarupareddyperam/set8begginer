/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.nextLine();
		if(ch.length()%2!=0)
		{
			int a=ch.length()/2;
			for(int i=0;i<ch.length();i++)
			{
				if(i==a)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(ch.charAt(i));
				}
			}
		}
			else
			{
			int a=ch.length()/2;
			for(int i=0;i<ch.length();i++)
			{
				if(i==a||i==a-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(ch.charAt(i));
				}
			}
			
		}
	}
}
