package ar.unq.po2.tp5.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	private Caja caja;

	@BeforeEach
	public void setup() {

		caja = new Caja();
	}

	@Test
	public void testCobro() {
		Producto producto1 = new Producto(10, 2);
		Producto producto2 = new Producto(10, 2);
		Producto producto3 = new Producto(10, 2);
		List<Producto> compra = new ArrayList<Producto>();
		compra.add(producto1);
		compra.add(producto2);
		compra.add(producto3);

		caja.cobrar(compra);

		assertEquals(caja.getMontoTotal(), 30);

	}

	@Test
	public void testCobroSinProductos() {

		List<Producto> compra = new ArrayList<Producto>();

		caja.cobrar(compra);

		assertEquals(caja.getMontoTotal(), 0);

	}

	@Test
	public void testRegistroDeProductos() {
		Producto producto = new Producto(10, 2);

		caja.registrarProducto(producto);

		assertEquals(producto.getStock(), 1);
	}

}
