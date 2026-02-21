

//Q1.Write a Program to Display below pattern

package anudip;

public class DiomandPattern
{
	    public static void main(String[] args) {

	        int n = 5;   // total rows for half diamond

	        // Upper Pyramid
	        for (int i = 1; i <= n; i++) {

	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	        // Lower Reverse Pyramid
	        for (int i = n - 1; i >= 1; i--) {

	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
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
 *******
  *****
   ***
    *

 */


