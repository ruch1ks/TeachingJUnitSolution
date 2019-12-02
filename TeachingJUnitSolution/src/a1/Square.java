package a1;

public class Square extends Shape {

	private int side;
	public Square(String name, int side) {
		super(name);
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	public double perimeter() {
		return side*4;
	}
	
	public double area() {
		return side*side;
	}
}

