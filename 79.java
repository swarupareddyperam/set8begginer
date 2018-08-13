/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=m*n;
		int count=0;
		for(int i=0;i<=c;i++)
		{
			if(i*i==c)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
