package ar.unq.po2.tp4.ej3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

		private List<Ingreso> ingresos = new ArrayList<Ingreso>(); 
	
		public List<Ingreso> getIngresos() {
			return ingresos;
		} 
		
		public double getTotalPercibido(){
			double acc = 0;
			for(Ingreso ingreso: this.getIngresos()) {
				acc += ingreso.getMontoPercibido();
			}
			return acc;
		}
		
		public double getMontoImponible() {
			double acc = 0;
			for(Ingreso ingreso: this.getIngresos()) {	
					acc += ingreso.getMontoImponible();
			}
			return acc;
		} 
		
		public double getImpuestoAPagar() {
			return (this.getMontoImponible() * 0.98);
		}

		public void añadirIngreso(Ingreso nuevoIngreso) {
			this.getIngresos().add(nuevoIngreso);
			
		}
		
}
