/*Cycle 1
 *Experiment number : 8
 *Experiment Name :Abstract Classes
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 26-10-2023*/
package cycle_1;

public class Geometry {

	public static void main(String[] args) {
		abstract class Shape {
			abstract void numberOfSides();
		}
		class Rectangle extends Shape{
			void numberOfSides() {
				System.out.println("Reactangle has 4 sides");
			}
		}
		class Triangle extends Shape{
			void numberOfSides() {
				System.out.println("Triangle has 3 sides");
			}
		}
		class Hexagon extends Shape{
			void numberOfSides() {
				System.out.println("Hexagon has 6 sides");
			}
		}
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		Hexagon h1 = new Hexagon();
		r1.numberOfSides();
		t1.numberOfSides();
		h1.numberOfSides();
	}
}
