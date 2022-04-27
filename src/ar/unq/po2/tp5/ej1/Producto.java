package ar.unq.po2.tp5.ej1;

public class Producto {
	protected double precio;
	private int stock;

	public Producto(double precio, int stockInicial) {
		this.setPrecio(precio);
		this.setStock(stockInicial);
	}

	public double getPrecio() {
		return precio;
	}

	void setPrecio(double precio) {

		if (precio <= 0) {
			throw new IllegalArgumentException("El precio de un producto no puede ser menor o igual a cero");
		} else {
			this.precio = precio;
		}
	}

	public int getStock() {
		return stock;
	}

	void setStock(int stock) {
		if (stock <= 0) {
			throw new IllegalArgumentException("El stock de un producto no puede ser menor o igual a cero");
		} else {
			this.stock = stock;
		}
	}

	public void decrementarStock() {
		this.setStock(this.getStock() - 1);
	}

}
