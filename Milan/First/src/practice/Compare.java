package practice;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		if (a==b) {
			System.out.println("Numbers are equal");
		}
		else if (a>b){
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
		
		sc.close();

	}

}
