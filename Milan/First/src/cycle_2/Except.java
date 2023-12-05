/*Cycle 2
 *Experiment number : 1
 *Experiment Name : Exception Handling
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 7-11-2023*/
package cycle_2;

import java.util.*;

public class Except {

	public static void main(String[] args) throws ArithmeticException,IndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		int a=3,b=-1;
		System.out.print("Enter a number:");
		int c = sc.nextInt();
		sc.close();
		try {
			b=a/c;
			System.out.println("b=3/"+c+"="+b);
			throw new IndexOutOfBoundsException();
		}
		catch (ArithmeticException e) {
			System.out.println("Error:Division by zero");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Error:3rd index not accessible");
		}
		finally {
			System.out.println("Exited with all errors handled");
		}
		
	}

}

