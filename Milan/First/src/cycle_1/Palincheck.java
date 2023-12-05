/*Cycle 1
 *Experiment number : 6
 *Experiment Name : Palindrome
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 10-10-2023*/
package cycle_1;

import java.util.Scanner;

public class Palincheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=new String();
		System.out.print("Enter string: ");
		s=sc.nextLine();
		int j=s.length()-1,flag=0;
		for (int i=0;i<=(s.length()/2);i++) {
			if (s.charAt(i)!=s.charAt(j)){
				System.out.println(s+" -> Not a Palindrome");
				flag=1;
				break;
			}
			j--;
		}
		if (flag==0) {
			System.out.println(s+" -> Palindrome");
		}
		sc.close();
	}

}
