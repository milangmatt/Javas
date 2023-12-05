/*Cycle 1
 *Experiment number : 1
 *Experiment Name : Prime Number
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 26-09-2023*/
package cycle_1;

import java.util.Scanner;

public class Prime_number {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,flag=0;
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		// neither prime nor composite
		if ((n==0)||(n==1)) {
			System.out.println(n+" is neither prime nor composite");
			flag=1;
		}
		//Composite
		else {
			for (int i = 2; i < n/2; i++) {
				if (n%i==0) {
					System.out.println(n+" is not prime");
					flag=1;
					break;
				}
			}
		}
		//Prime
		if (flag==0) {
			System.out.println(n+" is prime");
		}
		sc.close();

	}

}
