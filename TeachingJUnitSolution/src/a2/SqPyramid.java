package a2;

public class SqPyramid extends Shape3D{

	private int height;
	private int baseEdge;
	
	public SqPyramid(String name, int baseEdge, int height) {
		super(name);
		this.height = height;
		this.baseEdge = baseEdge;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getBaseEdge() {
		return baseEdge;
	}
	
	public double surfaceArea() {
		return (baseEdge*baseEdge) + 2*baseEdge*Math.sqrt((baseEdge*baseEdge/4.0) + (height*height));
	}
	
	public double volume() {
		return baseEdge*baseEdge*(height/3.0);
	}
	
	
}
