package a2;

public class Cube extends Shape3D {

	private int side;
	
	public Cube(String name, int side) {
		super(name);
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	public double surfaceArea() {
		return (side*side)*6;
	}
	
	public double volume() {
		return side*side*side;
	}
}
