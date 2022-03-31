package MathObjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();
		circle.Area();
		circle.Area(5);
		circle.Area(4.5);
		triangle.Area();
		triangle.Area(5, 6);
		rectangle.Area();
		rectangle.Area(5, 3);
		rectangle.Area(7.5, 6.2);
	}

}
