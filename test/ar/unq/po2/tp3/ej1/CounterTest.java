package ar.unq.po2.tp3.ej1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;



public class CounterTest {
	private Counter counter;
	
	
	@BeforeEach
	public void setUp() {
		counter = new Counter();
		// se añaden 9 numeros impares y uno par
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(1);
		counter.añadirNumero(2);
		
		
	}
	
	//verificación de cantidad de pares
	
	@Test
	public void testearNumerosPares() {
		
	}
	@Test
	void testearNumeroPares() {
		int cantidad = counter.cantidadDePares();
		
		assertEquals(cantidad, 1);
	}
	
	@Test
	void testearNumeroImpares() {
		int cantidad = counter.cantidadDeImpares();
		
		assertEquals(cantidad, 9);
	}
	
	@Test
	void testearNumeroMultiplo() {
		int cantidad = counter.cantidadDeMultiplos(3);
		
		assertEquals(cantidad, 0);
	}
	
}
