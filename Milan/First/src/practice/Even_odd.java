package practice;

import java.util.*;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter a number: ");
		a=sc.nextInt();
		if (a!=0) {
			if (a%2==0) {
				System.out.println(a+" is even");
			}
			else {
				System.out.println(a+" is odd");
			}
		}
		else {
			System.out.println(a+" is neither even nor odd");
		}
		sc.close();

	}

}
