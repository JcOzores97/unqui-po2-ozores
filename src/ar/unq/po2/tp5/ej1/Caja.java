package ar.unq.po2.tp5.ej1;

import java.util.List;

public class Caja {

	private double montoTotal = 0;

	public void cobrar(List<Producto> productos) {
		for (Producto producto : productos) {
			this.registrarProducto(producto);
		}
		this.informarMontoTotal();
	}

	public void registrarProducto(Producto producto) {
		this.setMontoTotal(this.getMontoTotal() + producto.getPrecio());
		producto.decrementarStock();

	}

	private void setMontoTotal(double d) {
		montoTotal = d;
	}

	double getMontoTotal() {
		return this.montoTotal;
	}

	public void informarMontoTotal() {

		System.out.println(this.getMontoTotal());

	}

}
