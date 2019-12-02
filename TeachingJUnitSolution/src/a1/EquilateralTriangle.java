package a1;

public class EquilateralTriangle extends Shape{

	private int side;
	public EquilateralTriangle(String name, int side) {
		super(name);
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	public double perimeter() {
		return side*3;
	}
	
	public double area() {
		return (Math.sqrt(3) / 4) * side * side;
	}
}
