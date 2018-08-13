/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,l,k,i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		l=sc.nextInt();
		k=sc.nextInt();
		for(i=l+1;i<k;i++)
		{
			if(i==n)
			{
				count++;
				System.out.println("yes");
			}
		}
		if(count==0)
		{
			System.out.println("no");
		}
	}
}
