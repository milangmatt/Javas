/*Cycle 1
 *Experiment number : 5
 *Experiment Name :Character Count
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 10-10-2023*/
package cycle_1;

import java.util.Scanner;

public class Charfreq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=new String();
		System.out.print("Enter string: ");
		s=sc.nextLine();
		char ch;
		System.out.print("Enter character to count: ");
		ch=sc.nextLine().charAt(0);
		int co=0;
		s.toLowerCase();
		for (int i=0;i <s.length();i++ )
			if (s.charAt(i)==ch) {
				co++;
			}
		System.out.println(ch+" occurs "+co+" times in "+s);
		sc.close();
	}

}
