/*Cycle 3
 *Experiment number : 3
 *Experiment Name : Multithreading
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 28-11-2023
 */

package cycle_3;

import java.util.Scanner;


class Oddprint extends Thread{
	int num;
	
	Oddprint(int num){
		this.num=num;
	}

	public void run() {
		System.out.println("Odd Number -> Cube: "+(num*num*num));
	}
}

class Evenprint extends Thread{
	int num;
	
	Evenprint(int num){
		this.num=num;
	}
	public void run() {
		System.out.println("Even Number -> Square: "+(num*num));
	}
}

class Intprint extends Thread{
	int limit;
	
	Intprint(int limit){
		this.limit=limit;
	}
	
	public void run() {
		for (int i=0; i<limit; i++) {
			int rand = (int)(Math.random()*100);
			System.out.println("Random Number: "+rand);
			if (rand%2==0) {
				Evenprint evn=new Evenprint(rand);
				evn.start();
			}
			else {
				Oddprint evn=new Oddprint(rand);
				evn.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int lim = sc.nextInt();
		Intprint printer = new Intprint(lim);
		printer.start();
		sc.close();
	}
}



