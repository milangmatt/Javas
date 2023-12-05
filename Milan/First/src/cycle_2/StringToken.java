/*Cycle 2
 *Experiment number : 4
 *Experiment Name :String Tokenizer
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 28-11-2023
 */

package cycle_2;

import java.util.*;

public class StringToken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the elements in a line: ");
		String intstr= sc.nextLine();
		StringTokenizer intarr = new StringTokenizer(intstr);
		int sum=0;
		while(intarr.hasMoreElements()){
			int num=Integer.parseInt(intarr.nextToken());
			System.out.println(num);
			sum+=num;
		}
		System.out.println("\nSum= "+sum);
		sc.close();
	}
}
