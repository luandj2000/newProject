package MathObjects;

public class Triangle extends Shape {

	public void Area(int length, int width ) {
		System.out.println("The triangle area is " + (length*width*0.5) + "cm\u00B2");
	}
	public void Area() {
		System.out.println("The furmula for a triangle is 0.5*base*length");
	}
}
