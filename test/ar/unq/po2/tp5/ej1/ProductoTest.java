package ar.unq.po2.tp5.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {

	private Producto producto;

	@BeforeEach
	public void setup() {

		producto = new Producto(10, 4);
	}

	@Test
	public void testPrecio() {
		assertEquals(producto.getPrecio(), 10);
	}

	@Test
	public void testPrecioMenorACero() {
		// no se modifica el precio si el mismo es menor o igual a cero

		IllegalArgumentException excepcion = assertThrows(IllegalArgumentException.class, () -> {
			producto.setPrecio(-1);
		});

		assertEquals("El precio de un producto no puede ser menor o igual a cero", excepcion.getMessage());

		assertEquals(producto.getPrecio(), 10);

	}

	@Test
	public void testStock() {
		assertEquals(producto.getStock(), 4);
	}

	@Test
	public void testStockMenorACero() {
		// no se modifica el stock si el mismo es menor o igual a cero

		IllegalArgumentException excepcion = assertThrows(IllegalArgumentException.class, () -> {
			producto.setStock(-1);
		});

		assertEquals("El stock de un producto no puede ser menor o igual a cero", excepcion.getMessage());

		assertEquals(producto.getStock(), 4);

	}

	@Test
	public void testDecrementoStock() {
		producto.decrementarStock();
		assertEquals(producto.getStock(), 3);
	}

}
