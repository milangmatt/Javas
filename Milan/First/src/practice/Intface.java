package practice;

import java.util.*;

interface Sports {
	final float sportwt = 6.0f;
	abstract void putwt();
}
class Student {
	int roll_no;
	void getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll number: ");
		this.roll_no=sc.nextInt();
	}
	void putNumber() {
		System.out.print("Roll number :"+this.roll_no);
	}
}

class Test extends Student {
	float term1;
	float term2;
	void getMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Term 1 Marks: ");
		this.term1=sc.nextFloat();
		System.out.print("Enter Term 2 Marks: ");
		this.term2=sc.nextFloat();
		sc.close();
	}
	void putMarks() {
		System.out.println("Marks obtained :");
		System.out.println("Term 1 :"+this.term1);
		System.out.println("Term 2 :"+this.term2);
	}
}

class Result extends Test implements Sports {
	public void putwt() {
		System.out.println("Sports Weightage="+sportwt);
	}
	void display() {
		getNumber();
		getMarks();
		putNumber();
		putMarks();
		putwt();
		System.out.println("Total Score ="+(term1+term2+sportwt));
		
	}
}

public class Intface {
	public static void main(String[] args) {
		Result res1 = new Result();
		res1.display();
	}
}
