package ar.unq.po2.tp4.ej1;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String nombre, double precio, Boolean esDePreciosCuidados) {
		// para invocar al constructor de la super clase uso "super(params)" solamente, si deseo invocar otro metodo es super.xMetodo()
		 super(nombre, precio, esDePreciosCuidados);
	}
	
	
	

	@Override
	public double getPrecio() {
		return this.precio* 0.9;
	}

}
