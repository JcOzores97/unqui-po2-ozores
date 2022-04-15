package ar.unq.po2.tp4.ej1;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	public Supermercado(String nombre, String direccion){
		this.setDireccion(direccion);
		this.setNombre(nombre);
	}
	
	private String nombre;

	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();

	
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public void agregarProducto(Producto unNuevoProducto) {
		this.getProductos().add(unNuevoProducto);
		
	}

	public double getPrecioTotal() {
		double acc = 0;
		for (Producto producto:this.getProductos() ) {
			acc = acc + producto.getPrecio();
		}
//		System.out.println(("El valor de la suma es es " + acc));
		return acc;
	}

	
	
	
}
