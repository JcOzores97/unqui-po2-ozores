package ar.unq.po2.tp4.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoPorHoraExtra ingreso3;
	
	@BeforeEach
	public void setUp() {
		trabajador =  new Trabajador();
		ingreso1 = new Ingreso("Enero", 1000.0, "trabajo manual");
		ingreso2 =  new Ingreso("Febrero", 1000.0, "trabajo manual");
		ingreso3 =  new IngresoPorHoraExtra("Marzo", 1000.0, "trabajo manual", 2);
		
		//se añaden 11 ingresos (1 por hora extra y 10 ingresos genéricos)
		trabajador.añadirIngreso(ingreso1);
		trabajador.añadirIngreso(ingreso2);
		trabajador.añadirIngreso(ingreso3);
		trabajador.añadirIngreso(ingreso1);
		trabajador.añadirIngreso(ingreso2);
		trabajador.añadirIngreso(ingreso2);
		trabajador.añadirIngreso(ingreso1);
		trabajador.añadirIngreso(ingreso2);
		trabajador.añadirIngreso(ingreso1);
		trabajador.añadirIngreso(ingreso2);
		trabajador.añadirIngreso(ingreso2);
		
	}
	
	@Test
	public void testearTotalPercibido() {
		
		assertEquals(11000, trabajador.getTotalPercibido());
	}
	@Test
	public void testearMontoImponible() {
		
		assertEquals(10000, trabajador.getMontoImponible());
	}
	@Test
	public void testearImpuestoAPagar() {
		
		assertEquals(9800, trabajador.getImpuestoAPagar());
	}
	
	
	
}
