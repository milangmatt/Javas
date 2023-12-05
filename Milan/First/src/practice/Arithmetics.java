package practice;

import java.util.Scanner;

public class Arithmetics {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();
		System.out.println("Sum="+(a+b));
		System.out.println("Difference="+(a-b));
		System.out.println("Product="+(a*b));
		System.out.println("Quotient="+(a/b));
		System.out.println("Remainder="+(a%b));
		sc.close();
	}
}
