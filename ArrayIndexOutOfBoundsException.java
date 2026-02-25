/*1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while 
accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index.]*/


package javaprograms;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3};

		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}

/*
Output:-
1
2
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
at Programs/javaprograms.ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:15)
 */
