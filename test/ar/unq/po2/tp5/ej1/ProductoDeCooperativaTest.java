package ar.unq.po2.tp5.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoDeCooperativaTest {
	private ProductoDeCooperativa producto;

	@BeforeEach
	public void setup() {

		producto = new ProductoDeCooperativa(10, 4);
	}

	@Test
	public void testPrecio() {
		assertEquals(producto.getPrecio(), 9);
	}
}
