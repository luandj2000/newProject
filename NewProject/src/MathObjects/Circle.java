package MathObjects;

public class Circle extends Shape {

	public void Area(int radius) {
		System.out.println("The circle area is " + (radius*radius) + "cm\u00B2");
	}


	public void Area(double radius) {
		System.out.println("The circle area is " + (radius*radius) + "cm\u00B2");
	}
}
