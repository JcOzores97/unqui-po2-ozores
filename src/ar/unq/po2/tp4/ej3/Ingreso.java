package ar.unq.po2.tp4.ej3;

public class Ingreso {
	
	private String mesDePercepci�n;
	private double montoPercibido;
	private String concepto;

	public Ingreso (String mes, double monto, String concepto) {
		this.setMesDePercepci�n(mes);
		this.setMonto(monto);
		this.setConcepto(concepto);
	}
	
	
	private void setMonto(double nuevoMonto) {
		this.montoPercibido = nuevoMonto;
	}


	private void setConcepto(String nuevoConcepto) {
		this.concepto = nuevoConcepto;
	}


	private void setMesDePercepci�n(String nuevoMes) {
		this.mesDePercepci�n = nuevoMes;
		
	}
	public String getMesDePercepci�n() {
		return this.mesDePercepci�n;
	}


	public double getMontoPercibido() {
		return this.montoPercibido;
	}

	public double getMontoImponible() {
		return this.getMontoPercibido();
	}

}
