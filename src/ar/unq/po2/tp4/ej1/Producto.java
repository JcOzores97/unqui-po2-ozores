package ar.unq.po2.tp4.ej1;

public class Producto {
	
	String nombre;
	double precio;
	Boolean esPrecioCuidado = false;
	
	//constructores
	public Producto(String nombre, double precio, Boolean perteneceAPreciosCuidados) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPerteneceAPreciosCuidados(perteneceAPreciosCuidados);
	}
	
	public Producto(String nombreInicial, double precioInicial) {
		this.setNombre(nombreInicial);
		this.setPrecio(precioInicial);
	}
	
	//resto de los métodos
	private void setPerteneceAPreciosCuidados(Boolean perteneceAPreciosCuidados) {
		this.esPrecioCuidado = perteneceAPreciosCuidados;
		
	}



	private void setPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}



	private void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void aumentarPrecio(double valorDeAumento) {
		this.setPrecio(this.getPrecio() + valorDeAumento);
		
	}

	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}


	

}
