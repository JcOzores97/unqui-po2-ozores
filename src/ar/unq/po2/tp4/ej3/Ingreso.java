package ar.unq.po2.tp4.ej3;

public class Ingreso {
	
	private String mesDePercepción;
	private double montoPercibido;
	private String concepto;

	public Ingreso (String mes, double monto, String concepto) {
		this.setMesDePercepción(mes);
		this.setMonto(monto);
		this.setConcepto(concepto);
	}
	
	
	private void setMonto(double nuevoMonto) {
		this.montoPercibido = nuevoMonto;
	}


	private void setConcepto(String nuevoConcepto) {
		this.concepto = nuevoConcepto;
	}


	private void setMesDePercepción(String nuevoMes) {
		this.mesDePercepción = nuevoMes;
		
	}
	public String getMesDePercepción() {
		return this.mesDePercepción;
	}


	public double getMontoPercibido() {
		return this.montoPercibido;
	}

	public double getMontoImponible() {
		return this.getMontoPercibido();
	}

}
