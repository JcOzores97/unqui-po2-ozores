package ar.unq.po2.tp4.ej3;



public class IngresoPorHoraExtra extends Ingreso{
	private int cantidadDeHorasExtra;
	
	public IngresoPorHoraExtra(String mes, double monto, String concepto, int cantidadDeHorasExtra) {
		super(mes, monto, concepto);
		this.setCantidadDeHorasExtra(cantidadDeHorasExtra);
	}

	public void setCantidadDeHorasExtra(int cantidadDeHorasExtra) {
		this.cantidadDeHorasExtra = cantidadDeHorasExtra;
	}
	@Override
	public double getMontoImponible() {
		return 0;
	}

	public Integer getCantidadDeHorasExtra() {
		return this.cantidadDeHorasExtra;
	}
}
