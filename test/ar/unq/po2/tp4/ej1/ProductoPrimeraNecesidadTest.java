package ar.unq.po2.tp4.ej1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad pan;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		pan = new ProductoPrimeraNecesidad("Arroz", 8d, false, 20);
		arroz = new ProductoPrimeraNecesidad("Pan", 10d, false, 50);
	}
	
	@SuppressWarnings("removal")
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	
	@SuppressWarnings("removal")
	@Test
	public void testCalculoPrecioConDescuentoVariable(){
		assertEquals(new Double(6.4), pan.getPrecio());
		assertEquals(new Double(5), arroz.getPrecio());
		
	}
//	TD: testDescuentoNoMayorA100NiMenorA0;
}
