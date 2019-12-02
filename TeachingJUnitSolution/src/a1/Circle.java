package a1;

public class Circle extends Shape {

	private int radius;
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double perimeter() {
		return Math.PI * 2 * radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
}
