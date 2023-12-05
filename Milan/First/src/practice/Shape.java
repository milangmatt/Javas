package practice;

public class Shape {

	public static void main(String[] args) {
		class AreaFind{
			void Area(double a) {
				System.out.println("Area of Circle= "+a*a*22/7);
			}
			void Area(double a,double b) {
				System.out.println("Area of Rectangle= "+a*b);
			}
			void Area(double a,double b, double c) {
				double s = (a+b+c)/2;
				System.out.println("Area of Triangle= "+Math.sqrt((s*(s-a)*(s-b)*(s-c))));
			}
			
		}
		AreaFind ar= new AreaFind();
		ar.Area(24);
		ar.Area(24,25);
		ar.Area(23,23,24);
	}

}
