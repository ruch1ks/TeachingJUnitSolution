package a2;

public class Cone extends Shape3D{
	
	private int radius; 
	private int height; 
	
	public Cone(String name, int radius, int height) {
		super(name);
		this.radius = radius;
		this.height = height;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double surfaceArea() {
		return Math.PI*radius*(radius + Math.sqrt((height*height) + (radius*radius)));
	}

	public double volume() {
		return Math.PI*radius*radius*(height/3.0);
	}
}
