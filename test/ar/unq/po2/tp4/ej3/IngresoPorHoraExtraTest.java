package ar.unq.po2.tp4.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPorHoraExtraTest {
	
	private IngresoPorHoraExtra ingreso1;
	
	@BeforeEach
	public void setUp() {
		ingreso1=  new IngresoPorHoraExtra("Marzo", 100, "Trabajo manual", 10);
	}
	
	@Test
	public void testCantidadHorasExtra() {
		ingreso1.setCantidadDeHorasExtra(8);
		assertEquals(8, ingreso1.getCantidadDeHorasExtra());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(0, ingreso1.getMontoImponible());
	}

}
