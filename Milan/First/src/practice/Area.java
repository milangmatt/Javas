package practice;

import java.util.*;


public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		float r,x,y,z,s;
		System.out.print("Enter Lenght of rectangle: ");
		a=sc.nextInt();
		System.out.print("Enter Breadth of rectangle: ");
		b=sc.nextInt();
		System.out.print("Enter Radius of Circle: ");
		r=sc.nextFloat();
		System.out.println("Enter Sides of a Triangle: ");
		System.out.print("a: ");
		x=sc.nextFloat();
		System.out.print("b: ");
		y=sc.nextFloat();
		System.out.print("c: ");
		z=sc.nextFloat();
		System.out.println("Areas");
		System.out.println("Rectangle="+(a*b));
		System.out.println("Circle="+(22*r*r/7));
		s=(x+y+z)/2;
		System.out.println("Triangle="+Math.sqrt((s*(s-x)*(s-y)*(s-z))));
		
		sc.close();

	}

}
