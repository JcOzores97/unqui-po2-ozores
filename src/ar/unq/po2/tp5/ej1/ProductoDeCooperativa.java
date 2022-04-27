package ar.unq.po2.tp5.ej1;

public class ProductoDeCooperativa extends Producto {
	public ProductoDeCooperativa(double precio, int stockInicial) {
		super(precio, stockInicial);
	}

	@Override
	public double getPrecio() {
		return this.precio * 0.9;
	}
}
