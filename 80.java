/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n,i,rem=0,sum=0;
		n=sc.nextInt();
		//temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
			
		}
		n=sum;
		while(n!=0)
		{
			rem=n%10;
			if(rem%2!=0)
			{
				System.out.print(rem+" ");
			}
			n=n/10;
		}
	}
}
