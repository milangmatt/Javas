package practice;

public class InheritMethods {

	public static void main(String[] args) {
		class Employee {
			void display() {
				System.out.println("This is Employee class");
			}
			void calcSalary() {
				System.out.println("Salary of Employee is 80000");
			}
		}
		class Engineer extends Employee {
			void display() {
				System.out.println("This is Engineer class");
			}
			void calcSalary() {
				System.out.println("Salary of Engineer is 100000");
			}
		}
		Engineer eng = new Engineer();
		eng.display();
		eng.calcSalary();
		eng.display();
	}

}
