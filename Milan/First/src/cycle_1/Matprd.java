/*Cycle 1
 *Experiment number : 4
 *Experiment Name :Multiplication of Matrix
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 10-10-2023*/
package cycle_1;

import java.util.Scanner;

public class Matprd {

	public static void main(String[] args) {
		int ra,rb,ca,cb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix A: ");
		System.out.print("Enter number of rows : ");
		ra=sc.nextInt();
		System.out.print("Enter number of columns : ");
		ca=sc.nextInt();
		int[][] a = new int[ra][ca];
		System.out.println("Enter elements : ");
		for (int i=0; i < ra;i++) {
			for (int j=0; j < ca;j++) {
				
				a[i][j]=sc.nextInt();
			}	
		}
		System.out.println("Matrix B: ");
		System.out.print("Enter number of rows : ");
		rb=sc.nextInt();
		System.out.print("Enter number of columns : ");
		cb=sc.nextInt();
		int[][] b = new int[rb][cb];
		System.out.println("Enter elements : ");
		for (int i=0; i < rb;i++) {
			for (int j=0; j < cb;j++) {
				
				b[i][j]=sc.nextInt();
			}	
		}
		System.out.println("\nGiven Matrix A:\n ");
		for (int i=0; i < ra;i++) {
			for (int j=0; j < ca;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nGiven Matrix B:\n ");
		for (int i=0; i < rb;i++) {
			for (int j=0; j < cb;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		if (rb==ca) {
			int[][] prd = new int[ra][cb];
			for (int i=0; i < ra;i++) {
				for (int j=0; j < cb;j++) {
					prd[i][j]=0;
					for (int k=0; k < ca;k++) {
						prd[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("\nProduct Matrix:\n ");
			for (int i=0; i < ra;i++) {
				for (int j=0; j < cb;j++) {
					System.out.print(prd[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Multiplication not possible");
		}
		
		sc.close();
		

	}

}
