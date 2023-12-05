/*Cycle 1
 *Experiment number : 2
 *Experiment Name : Second Largest Number
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 26-09-2023*/
package cycle_1;

import java.util.Scanner;

public class Second_smallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number of elements : ");
		n=sc.nextInt();
		int[] num = new int[n];
		System.out.print("Enter elements : ");
		for (int i=0; i < n;i++) {
			num[i]=sc.nextInt();
		}
		for (int i=1; i < n;i++) {
			for (int j = 0; j < n-i; j++) {
				if (num[j]>num[j+1]) {
					int temp=num[j+1];
					num[j+1]=num[j];
					num[j]=temp;
				}
			}
		}
		for (int i=0; i < n;i++) {
			if (num[i]!=num[0]) {
				System.out.print("Second smallest element is:  "+num[i]);
				break;
			}
		}
		
		sc.close();
	}

}
