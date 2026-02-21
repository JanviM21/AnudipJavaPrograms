
//Q2 Write a Program to Display below pattern

package anudip;

public class StarPattern
{
	public static void main(String args[])
	{
		int n=5; //total rows
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)//Print Space
			{
				System.out.print(" ");
			}
			for (int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
 Output:-
    *
   ***
  *****
 *******
*********

 */
