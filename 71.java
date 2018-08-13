/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
	             rev=rev+str.charAt(i);
		if(str.equals(rev))
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
