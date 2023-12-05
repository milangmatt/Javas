/*Cycle 1
 *Experiment number : 7
 *Experiment Name :Inheritance
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 17-10-2023*/
package cycle_1;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		class Employee {
			String name;
			int age;
			int phone_no;
			String address;
			int salary;
			void printSalary() {
				System.out.println("Salary: "+this.salary);
			}
		}
		class Officer extends Employee{
			String specialisation;
			void display() {
				System.out.println("Officer Details:");
				System.out.println("Name: "+this.name);
				System.out.println("Age: "+this.age);
				System.out.println("Phone Number: "+this.phone_no);
				System.out.println("Address: "+this.address);
				this.printSalary();
				System.out.println("Specialisation: "+this.specialisation);
			}
		}
		class Manager extends Employee{
			String department;
			void display() {
				System.out.println("Manager Details:");
				System.out.println("Name: "+this.name);
				System.out.println("Age: "+this.age);
				System.out.println("Phone Number: "+this.phone_no);
				System.out.println("Address: "+this.address);
				this.printSalary();
				System.out.println("Department: "+this.department);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		Officer ofc = new Officer();
		Manager mng = new Manager();
		System.out.println("Enter Details:");
		System.out.println("Officer Details:");
		System.out.print("Name:");ofc.name=sc.next();
		System.out.print("Age:");ofc.age=sc.nextInt();
		System.out.print("Phone Number:");ofc.phone_no=sc.nextInt();
		System.out.print("Address:");ofc.address=sc.next();
		System.out.print("Salary:");ofc.salary=sc.nextInt();
		System.out.print("Specialisation:");ofc.specialisation=sc.next();
		System.out.println("Manager Details:");
		System.out.print("Name:");mng.name=sc.next();
		System.out.print("Age:");mng.age=sc.nextInt();
		System.out.print("Phone Number:");mng.phone_no=sc.nextInt();
		System.out.print("Address:");mng.address=sc.next();
		System.out.print("Salary:");mng.salary=sc.nextInt();
		System.out.print("Department:");mng.department=sc.next();
		System.out.println("\n\n\n\n");
		ofc.display();
		mng.display();
		sc.close();
		

	}

}
