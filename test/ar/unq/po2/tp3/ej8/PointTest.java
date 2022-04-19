package ar.unq.po2.tp3.ej8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {

	private Point point1;
	private Point point2;

	@BeforeEach
	public void setup() {
		// point 1 con coordenadas default (0,0);
		point1 = new Point();
		point2 = new Point(2, 2);
	}

	@Test
	public void testInitialValue() {
		assertEquals(point1.getX(), 0);
		assertEquals(point1.getY(), 0);
		assertEquals(point2.getX(), 2);
		assertEquals(point2.getY(), 2);
	}

	@Test
	public void testMovePoint() {
		point1.move(3, 3);
		assertEquals(point1.getX(), 3);
		assertEquals(point1.getY(), 3);
	}

	@Test
	public void testSumPoints() {
		Point result = point1.sum(point2);

		assertEquals(result.getX(), 2);
		assertEquals(result.getY(), 2);
	}
}
