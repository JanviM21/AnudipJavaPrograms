
//2.Create program for Custom Exception.

package javaprograms;

class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}
public class Demo {
	public static void main(String[] args) {
		try {
			int num = -5;

			if (num < 0) {
				throw new MyException("Number should not be negative");
			}

			System.out.println("Valid number");
		} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
Output:-
Number should not be negative
*/