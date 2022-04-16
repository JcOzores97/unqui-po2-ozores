package ar.unq.po2.tp4.ej1;

public class ProductoPrimeraNecesidad extends Producto{

	private int descuentoEnPorcentaje = 10;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, Boolean esDePreciosCuidados) {
		// para invocar al constructor de la super clase uso "super(params)" solamente, si deseo invocar otro metodo es super.xMetodo()
		 super(nombre, precio, esDePreciosCuidados);
		
	}
	
	
	

	public ProductoPrimeraNecesidad(String nombre, double precioBase, boolean esDePreciosCuidados, int descuentoEnPorcentaje) {
		 super(nombre, precioBase, esDePreciosCuidados);
		 this.setDescuentoEnPorcentaje(descuentoEnPorcentaje);	
	}




	@Override
	public double getPrecio() {		
		double porcentajeSobreTotal = 100 - this.getDescuentoEnPorcentaje();
		return (porcentajeSobreTotal * this.precio / 100);
	}



	public int getDescuentoEnPorcentaje() {
		return this.descuentoEnPorcentaje;
	}




	public void setDescuentoEnPorcentaje(int nuevoDescuentoEnPorcentaje) {
		this.descuentoEnPorcentaje = nuevoDescuentoEnPorcentaje;
	}
	
	

}
