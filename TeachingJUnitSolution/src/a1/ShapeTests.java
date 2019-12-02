package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShapeTests {

	@Test
	void testCircle() {
		Circle c = new Circle("Circle 1", 4);
		
		assertEquals("Circle 1", c.getName());
		assertEquals(4, c.getRadius());
		assertEquals(Math.PI*4*4, c.area());
		assertEquals(Math.PI*4*2, c.perimeter());
	}
	
	@Test
	void testSquare() {
		Square s = new Square("Square 1", 5);
		
		assertEquals("Square 1", s.getName());
		assertEquals(5, s.getSide());
		assertEquals(5*5, s.area());
		assertEquals(5*4, s.perimeter());
	}
	
	@Test
	void testEquilateral() {
		EquilateralTriangle t = new EquilateralTriangle("Triangle 1", 4);
		
		assertEquals("Triangle 1", t.getName());
		assertEquals(4, t.getSide());
		assertEquals(4*4*Math.sqrt(3)/4, t.area());
		assertEquals(4*3, t.perimeter());
	}
	
	@Test
	void testRectangle() {
		Rectangle r = new Rectangle("Rectangle 1", 4, 6);
		
		assertEquals("Rectangle 1", r.getName());
		assertEquals(4, r.getSide1());
		assertEquals(6, r.getSide2());
		assertEquals(4*6, r.area());
		assertEquals(8+12, r.perimeter());
	}
}
