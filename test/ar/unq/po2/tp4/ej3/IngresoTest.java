package ar.unq.po2.tp4.ej3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoTest {
	private Ingreso ingreso1;
	
	@BeforeEach
	public void setUp() {
		ingreso1 =  new Ingreso("Julio", 2000, "Servicios auxiliares");
	}
	
	@Test
	public void testMesDePercepción() {
		assertEquals("Julio", ingreso1.getMesDePercepción());
	}
	@Test
	public void testMontoPercibido() {
		assertEquals(2000, ingreso1.getMontoPercibido());
	}
	@Test
	public void testMontoImponible() {
		assertEquals(ingreso1.getMontoPercibido(), ingreso1.getMontoImponible());
	}
}
