package a2;

public abstract class Shape3D {
	
	private String name;
	public Shape3D(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double surfaceArea();
	
	public abstract double volume();
}
