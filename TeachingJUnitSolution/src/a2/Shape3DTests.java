package a2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Shape3DTests {
	
	@Test
	void testCone() {
		Cone c = new Cone("Cone", 3, 7);
		double surfaceArea = 100.0513;
		double volume = 65.97345;
		
		assertEquals("Cone", c.getName());
		assertEquals(3, c.getRadius());
		assertEquals(7, c.getHeight());
		assertTrue((Math.abs(surfaceArea - c.surfaceArea()) < .0001));
		assertTrue((Math.abs(volume - c.volume()) < .0001));
	}
	
	@Test
	void testSphere() {
		Sphere s = new Sphere("Sphere", 5);
		
		double surfaceArea = 314.15927;
		double volume = 523.59878;
		
		assertEquals("Sphere", s.getName());
		assertEquals(5, s.getRadius());
		assertTrue((Math.abs(surfaceArea - s.surfaceArea()) < .0001));
		assertTrue((Math.abs(volume - s.volume()) < .0001));
	}
	
	@Test
	void testCube() {
		Cube c = new Cube("Cube", 5);
		
		double surfaceArea = 150;
		double volume = 125;
		
		assertEquals("Cube", c.getName());
		assertEquals(5, c.getSide());
		assertTrue((Math.abs(surfaceArea - c.surfaceArea()) < .0001));
		assertTrue((Math.abs(volume - c.volume()) < .0001));
	}
	
	@Test
	void testSqPyramid() {
		SqPyramid s = new SqPyramid("SqPyramid", 6, 7);
		
		double surfaceArea = 127.38928;
		double volume = 84;
		
		assertEquals("SqPyramid", s.getName());
		assertEquals(6, s.getBaseEdge());
		assertEquals(7, s.getHeight());
		assertTrue((Math.abs(surfaceArea - s.surfaceArea()) < .0001));
		assertTrue((Math.abs(volume - s.volume()) < .0001));
	}
	
}
