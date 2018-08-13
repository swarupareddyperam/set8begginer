/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.nextLine();
		int count=0;
		for(int i=0;i<ch.length();i++)
		{
			if(ch.charAt(i)=='a'||ch.charAt(i)=='e'||ch.charAt(i)=='i'||ch.charAt(i)=='o'||ch.charAt(i)=='u'||ch.charAt(i)=='A'||ch.charAt(i)=='E'||ch.charAt(i)=='I'||ch.charAt(i)=='O'||ch.charAt(i)=='U')
			{
				count++;
				System.out.println("yes");
				break;
				
			}
		}
		if(count==0)
		{
		System.out.println("no");	
		}
		
	}
}
