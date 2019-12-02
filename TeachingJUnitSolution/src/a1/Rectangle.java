package a1;

public class Rectangle extends Shape {

	private int side1;
	private int side2;
	
	public Rectangle(String name, int side1, int side2) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public int getSide1() {
		return side1;
	}
	
	public int getSide2() {
		return side2;
	}
	
	public double perimeter() {
		return (side1*2) + (side2*2);
	}
	
	public double area() {
		return side1*side2;
	}
}

