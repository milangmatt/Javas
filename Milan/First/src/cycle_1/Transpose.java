/*Cycle 1
 *Experiment number : 3
 *Experiment Name : Transpose of Matrix
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 26-09-2023*/
package cycle_1;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c;
		System.out.print("Enter number of rows : ");
		r=sc.nextInt();
		System.out.print("Enter number of columns : ");
		c=sc.nextInt();
		int[][] a = new int[r][c];
		int[][] b = new int[c][r];
		System.out.println("Enter elements : ");
		for (int i=0; i < r;i++) {
			for (int j=0; j < c;j++) {
				
				a[i][j]=sc.nextInt();
			}
			
		}
		for (int i=0; i < r;i++) {
			for (int j=0; j < c;j++) {
				b[j][i]=a[i][j];
			}
			
		}
		System.out.println("\nGiven Matrix :\n ");
		for (int i=0; i < r;i++) {
			for (int j=0; j < c;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nTransposed Matrix :\n ");
		for (int i=0; i < c;i++) {
			for (int j=0; j < r;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
