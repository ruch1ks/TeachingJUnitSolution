package a2;

public class Sphere extends Shape3D{

	private int radius;
	
	public Sphere(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double surfaceArea() {
		return 4*radius*radius*Math.PI;
	}
	
	public double volume() {
		return (4/3.0)*Math.PI*radius*radius*radius;
	}
}
