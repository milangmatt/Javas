package practice;

import java.util.*;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		sc.close();

	}

}
