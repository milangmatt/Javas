package practice;

import java.util.*;

public class Swapnotemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After Swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		sc.close();
	}

}
